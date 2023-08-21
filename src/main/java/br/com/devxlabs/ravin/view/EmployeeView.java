package br.com.devxlabs.ravin.view;

import java.util.Date;
import java.util.List;

import static br.com.devxlabs.ravin.utility.textconstants.ViewsTextConstants.*;
import static br.com.devxlabs.ravin.utility.DateUtils.*;

import javax.swing.JOptionPane;

import br.com.devxlabs.ravin.controllers.EmployeeController;
import br.com.devxlabs.ravin.entities.Employee;
import br.com.devxlabs.ravin.entities.Person;
import br.com.devxlabs.ravin.enums.EmployeeAvaiability;
import br.com.devxlabs.ravin.enums.MaritalStatus;
import br.com.devxlabs.ravin.enums.Responsibility;
import br.com.devxlabs.ravin.enums.Schooling;
import br.com.devxlabs.ravin.view.interfaces.EmployeeViewInterface;

public class EmployeeView implements EmployeeViewInterface {

	private EmployeeController controller;
	private PersonView personView;

	public EmployeeView() {
		controller = new EmployeeController();
		personView = new PersonView();
	}

	@Override
	public void showEntityMainMenu() {
		int option = Integer.parseInt(JOptionPane.showInputDialog(buildEntityMainMenu()));

		switch (option) {
		case 1:
			insertEmployee();
			break;
		case 2:
			updateEmployee();
			break;
		case 3:
			showEntityDeleteMenu();
			break;
		case 4:
			JOptionPane.showMessageDialog(null, showEntityFindMenu());
			break;
		case 5:
			listAllEmployee();
			break;
		case 6:
			listAvailableWaiters();
			break;
		case 7:
			break;
		default:
			JOptionPane.showMessageDialog(null, INVALID_MENU_OPTION);
		}
	}

	private void listAvailableWaiters() {
		var waiters = controller.listAvailableWaiters();
		showEntityListAllMenu(waiters);
	}

	private void listAllEmployee() {
		var employees = controller.listAll();
		showEntityListAllMenu(employees);
	}

	private void updateEmployee() {
		var employees = controller.listAll();
		int employeeId = showReadIdFromEntityMenu(employees);

		Employee employee = controller.findById(employeeId);

		showEntityUpdateMenu(employee);
		try {
			controller.save(employee);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, EMPLOYEE_ERROR_TO_UPDATE_EMPLOYEE + e.getMessage());
		}
	}

	private void insertEmployee() {

		Person person = personView.showEntityCreateMenu();
		Employee employee = showEntityCreateMenu();

		employee.setAddress(person.getAddress());
		employee.setCpf(person.getCpf());
		employee.setDateOfBirth(person.getDateOfBirth());
		employee.setHasActive(person.isHasActive());
		employee.setName(person.getName());
		employee.setObservations(person.getObservations());
		employee.setPhone(person.getPhone());

		try {
			controller.save(employee);
			JOptionPane.showMessageDialog(null, SUCCESS_TO_INSERT_ENTITY);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	@Override
	public Employee showEntityCreateMenu() {
		Employee employee = new Employee();
		employee.setRg(JOptionPane.showInputDialog(EMPLOYEE_RG));

		MaritalStatus maritalStatus = MaritalStatus
				.valueOf(JOptionPane.showInputDialog(EMPLOYEE_MERITAL_STATUS, employee.getMeritalStatus()));
		employee.setMeritalStatus(maritalStatus);

		Responsibility responsibility = Responsibility
				.valueOf(JOptionPane.showInputDialog(EMPLOYEE_RESPONSABILITY, employee.getResponsability()));
		employee.setResponsability(responsibility);

		Schooling schooling = Schooling
				.valueOf(JOptionPane.showInputDialog(EMPLOYEE_SCHOOLING, employee.getSchooling()));
		employee.setSchooling(schooling);

		EmployeeAvaiability aviability = EmployeeAvaiability
				.valueOf(JOptionPane.showInputDialog(EMPLOYEE_AVIABILITY, employee.getEmployeeAviability()));
		employee.setEmployeeAviability(aviability);

		Date admissionDate = tryParseDate(
				JOptionPane.showInputDialog(EMPLOYEE_ADIMSSION_DATE, employee.getAdmissionDate()));
		employee.setAdmissionDate(admissionDate);

		Date resignationDate = tryParseDate(
				JOptionPane.showInputDialog(EMPLOYEE_RESIGNATION_DATE, employee.getResignationDate()));
		employee.setResignationDate(resignationDate);

		int pis = Integer.parseInt(JOptionPane.showInputDialog(EMPLOYEE_PIS, employee.getPis()), employee.getPis());

		employee.setPis(pis);

		return employee;
	}

	@Override
	public Employee showEntityUpdateMenu(Employee entity) {
		entity.setRg(JOptionPane.showInputDialog(EMPLOYEE_RG, entity.getRg()));

		MaritalStatus maritalStatus = MaritalStatus
				.valueOf(JOptionPane.showInputDialog(EMPLOYEE_MERITAL_STATUS, entity.getMeritalStatus()));
		entity.setMeritalStatus(maritalStatus);

		Responsibility responsibility = Responsibility
				.valueOf(JOptionPane.showInputDialog(EMPLOYEE_RESPONSABILITY, entity.getResponsability()));
		entity.setResponsability(responsibility);

		Schooling schooling = Schooling.valueOf(JOptionPane.showInputDialog(EMPLOYEE_SCHOOLING, entity.getSchooling()));
		entity.setSchooling(schooling);

		EmployeeAvaiability aviability = EmployeeAvaiability
				.valueOf(JOptionPane.showInputDialog(EMPLOYEE_AVIABILITY, entity.getEmployeeAviability()));
		entity.setEmployeeAviability(aviability);

		Date admissionDate = tryParseDate(
				JOptionPane.showInputDialog(EMPLOYEE_ADIMSSION_DATE, formatDate(entity.getAdmissionDate())));
		entity.setAdmissionDate(admissionDate);

		int pis = Integer.parseInt(JOptionPane.showInputDialog(EMPLOYEE_PIS, entity.getPis()));
		entity.setPis(pis);

		return entity;
	}

	@Override
	public void showEntityDeleteMenu() {
		try {
			var employees = controller.listAll();
			var id = showReadIdFromEntityMenu(employees);
			controller.delete(id);
			JOptionPane.showMessageDialog(null, SUCCESS_TO_DELETE_ENTITY);
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(null, ERROR_TO_DELETE_ENTITY + exception.getMessage());
		}
	}

	@Override
	public void showEntityListAllMenu(List<Employee> employees) {
		StringBuilder builder = new StringBuilder();

		builder.append(EMPLOYEE_LIST_TITLE);
		builder.append(BREAK_LINE);
		builder.append(BREAK_LINE);

		for (Employee employee : employees) {
			builder.append(employee);
			builder.append(BREAK_LINE);
			builder.append(BREAK_LINE);
		}
		
		if (employees.isEmpty())
			builder.append(EMPTY_LIST);

		JOptionPane.showMessageDialog(null, builder.toString());
	}

	@Override
	public Employee showEntityFindMenu() {
		var employeeId = Integer.parseInt(JOptionPane.showInputDialog(EMPLOYEE_FIND_BY_ID));
		var employee = controller.findById(employeeId);
		return employee;
	}

	public static String buildEntityMainMenu() {
		String subMenuGeral = GeneralView.buildGeneralSubMenu("Funcionarios");

		StringBuilder builder = new StringBuilder();
		builder.append(subMenuGeral);
		builder.append("6 - Consultar Garçons Disponíveis \n");
		builder.append("7 - Voltar");

		return builder.toString();
	}

	@Override
	public int showReadIdFromEntityMenu(List<Employee> entities) {
		var builder = new StringBuilder();

		builder.append(EMPLOYEE_LIST_TITLE);
		builder.append(BREAK_LINE);
		builder.append(BREAK_LINE);

		for (Employee employee : entities) {
			builder.append(employee.getEmployeeId());
			builder.append(" - ");
			builder.append(employee.getName());
			builder.append(BREAK_LINE);

		}

		if (entities.isEmpty())
			builder.append(EMPTY_LIST);

		builder.append(BREAK_LINE);
		builder.append("Digite o id do funcionário que você deseja alterar");

		return Integer.parseInt(JOptionPane.showInputDialog(builder.toString()));
	}

}
