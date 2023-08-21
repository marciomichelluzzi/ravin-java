package br.com.devxlabs.ravin.controllers;

import java.util.List;

import br.com.devxlabs.ravin.controllers.interfaces.ControllerInterface;
import br.com.devxlabs.ravin.entities.Person;
import br.com.devxlabs.ravin.repositories.PersonRepository;

public class PersonController implements ControllerInterface<Person> {

	PersonRepository repository;

	public PersonController() {
		repository = new PersonRepository();
	}

	@Override
	public void save(Person entity) throws Exception {
		repository.save(entity);
	}

	@Override
	public void delete(int id) {
		repository.removeById(id);

	}

	@Override
	public Person findById(int id) {
		return repository.findById(id);
	}

	@Override
	public List<Person> listAll() {
		return repository.listAll();
	}

}
