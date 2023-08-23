package br.com.devxlabs.ravin.controllers.interfaces;

import br.com.devxlabs.ravin.models.entities.Employee;

import java.util.List;

public interface EmployeeControllerInterface extends ControllerInterface<Employee> {
	
	public List<Employee> listAvailableWaiters();

}
