package br.com.devxlabs.ravin.view;

import static br.com.devxlabs.ravin.utility.DateUtils.tryParseDate;
import static br.com.devxlabs.ravin.utility.textconstants.ViewsTextConstants.EMPLOYEE_ERROR_TO_UPDATE_EMPLOYEE;
import static br.com.devxlabs.ravin.utility.textconstants.ViewsTextConstants.INVALID_MENU_OPTION;
import static br.com.devxlabs.ravin.utility.textconstants.ViewsTextConstants.PERSON_ADDRESS;
import static br.com.devxlabs.ravin.utility.textconstants.ViewsTextConstants.PERSON_CPF;
import static br.com.devxlabs.ravin.utility.textconstants.ViewsTextConstants.PERSON_DATE_OF_BIRTH;
import static br.com.devxlabs.ravin.utility.textconstants.ViewsTextConstants.PERSON_FIND_BY_ID;
import static br.com.devxlabs.ravin.utility.textconstants.ViewsTextConstants.PERSON_HAS_ACTIVE;
import static br.com.devxlabs.ravin.utility.textconstants.ViewsTextConstants.PERSON_NAME;
import static br.com.devxlabs.ravin.utility.textconstants.ViewsTextConstants.PERSON_OBSERVATIONS;
import static br.com.devxlabs.ravin.utility.textconstants.ViewsTextConstants.PERSON_PHONE;
import static br.com.devxlabs.ravin.utility.textconstants.ViewsTextConstants.SUCCESS_TO_DELETE_ENTITY;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.devxlabs.ravin.controllers.PersonController;
import br.com.devxlabs.ravin.entities.Person;
import br.com.devxlabs.ravin.utility.textconstants.ViewsTextConstants;
import br.com.devxlabs.ravin.view.interfaces.ViewInterface;

public class PersonView implements ViewInterface<Person> {

	PersonController controller;

	public PersonView() {
		controller = new PersonController();
	}

	@Override
	public void showEntityMainMenu() {
		int option = Integer.parseInt(JOptionPane.showInputDialog(buildEntityMainMenu()));

		switch (option) {
		case 1:
			insertPerson();
			break;
		case 2:
			updatePerson();
			break;
		case 3:
			showEntityDeleteMenu();
			break;
		case 4:
			JOptionPane.showMessageDialog(null, showEntityFindMenu());
			break;
		case 5:
			listAllPerson();
			break;
		default:
			JOptionPane.showMessageDialog(null, INVALID_MENU_OPTION);
		}

	}

	private void listAllPerson() {
		// TODO Auto-generated method stub

	}

	private void updatePerson() {
		var people = controller.listAll();
		int personId = showReadIdFromEntityMenu(people);

		Person person = controller.findById(personId);

		showEntityUpdateMenu(person);
		try {
			controller.save(person);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, EMPLOYEE_ERROR_TO_UPDATE_EMPLOYEE + e.getMessage());
		}

	}

	private void insertPerson() {
		Person person = showEntityCreateMenu();

		person.setAddress(person.getAddress());
		person.setCpf(person.getCpf());
		person.setDateOfBirth(person.getDateOfBirth());
		person.setHasActive(person.isHasActive());
		person.setName(person.getName());
		person.setObservations(person.getObservations());
		person.setPhone(person.getPhone());

		try {
			controller.save(person);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

	private String buildEntityMainMenu() {
		String subMenuGeral = GeneralView.buildGeneralSubMenu("Funcionarios");

		StringBuilder builder = new StringBuilder();
		builder.append(subMenuGeral);

		return builder.toString();
	}

	@Override
	public Person showEntityCreateMenu() {
		Person person = new Person();
		person.setName(JOptionPane.showInputDialog(PERSON_NAME));
		
		person.setAddress(JOptionPane.showInputDialog(PERSON_ADDRESS));

		person.setCpf(JOptionPane.showInputDialog(PERSON_CPF));

		person.setDateOfBirth(tryParseDate(JOptionPane.showInputDialog(PERSON_DATE_OF_BIRTH)));

		person.setHasActive(Boolean.parseBoolean(JOptionPane.showInputDialog(PERSON_HAS_ACTIVE)));

		person.setObservations(JOptionPane.showInputDialog(PERSON_OBSERVATIONS));

		person.setPhone(JOptionPane.showInputDialog(PERSON_PHONE));

		return person;
	}

	@Override
	public int showReadIdFromEntityMenu(List<Person> entities) {
		var builder = new StringBuilder();

		builder.append(" ==================== Lista de pessoas ==================== ");
		builder.append(ViewsTextConstants.BREAK_LINE);

		for (Person person : entities) {
			builder.append(person.getId());
			builder.append(" - ");
			builder.append(person.getName());
			builder.append(ViewsTextConstants.BREAK_LINE);
		}

		builder.append("Digite o id do funcionário que você deseja alterar");

		return Integer.parseInt(JOptionPane.showInputDialog(builder.toString()));
	}

	@Override
	public Person showEntityUpdateMenu(Person entity) {
		entity.setName(JOptionPane.showInputDialog(PERSON_NAME));

		entity.setCpf(JOptionPane.showInputDialog(PERSON_CPF));

		entity.setDateOfBirth(tryParseDate(JOptionPane.showInputDialog(PERSON_DATE_OF_BIRTH)));

		entity.setHasActive(Boolean.parseBoolean(JOptionPane.showInputDialog(PERSON_HAS_ACTIVE)));

		entity.setObservations(JOptionPane.showInputDialog(PERSON_OBSERVATIONS));

		entity.setPhone(JOptionPane.showInputDialog(PERSON_PHONE));

		return entity;
	}

	@Override
	public void showEntityDeleteMenu() {
		try {
			var people = controller.listAll();
			var id = showReadIdFromEntityMenu(people);
			controller.delete(id);
			JOptionPane.showMessageDialog(null, SUCCESS_TO_DELETE_ENTITY);
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(null, SUCCESS_TO_DELETE_ENTITY + exception.getMessage());
		}
	}

	@Override
	public void showEntityListAllMenu(List<Person> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public Person showEntityFindMenu() {
		var personId = Integer.parseInt(JOptionPane.showInputDialog(PERSON_FIND_BY_ID));
		var person = controller.findById(personId);
		return person;

	}

}
