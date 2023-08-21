package br.com.devxlabs.ravin.controllers;

import java.util.ArrayList;
import java.util.List;

import br.com.devxlabs.ravin.controllers.interfaces.EmployeeControllerInterface;
import br.com.devxlabs.ravin.entities.Employee;
import br.com.devxlabs.ravin.enums.EmployeeAvaiability;
import br.com.devxlabs.ravin.enums.Responsibility;
import br.com.devxlabs.ravin.repositories.EmployeeRepository;
import br.com.devxlabs.ravin.repositories.interfaces.RepositoryInterface;
import br.com.devxlabs.ravin.utility.DateUtils;
import br.com.devxlabs.ravin.utility.textconstants.ExceptionTextConstants;

public class EmployeeController implements EmployeeControllerInterface {

	private RepositoryInterface<Employee> repository;

	public EmployeeController() {
		repository = new EmployeeRepository();
	}
	
	@Override
	public void save(Employee entity) throws Exception {
		if (DateUtils.getAge(entity.getDateOfBirth()) < 18) {
			throw new Exception(ExceptionTextConstants.CANNOT_SAVE_UNDERAGE_EMPLOYEE);
		}
		
		repository.save(entity);
	}

	@Override
	public void delete(int id) {
		repository.removeById(id);
	}

	@Override
	public Employee findById(int id) {

		return repository.findById(id);
	}

	@Override
	public List<Employee> listAll() {
		return repository.listAll();
	}

	@Override
	public List<Employee> listAvailableWaiters() {
		List<Employee> employees = repository.listAll();
		List<Employee> waiters = new ArrayList<>();

		for (Employee employee : employees) {
			if (employee.getResponsability() == Responsibility.WAITER
					&& employee.getEmployeeAviability() == EmployeeAvaiability.AVAILABLE) {
				waiters.add(employee);
			}
		}

		return waiters;
	}
}
