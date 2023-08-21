package br.com.devxlabs.ravin.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.devxlabs.ravin.database.ConnectionFactory;
import br.com.devxlabs.ravin.database.ConnectionUtils;
import br.com.devxlabs.ravin.entities.Employee;
import br.com.devxlabs.ravin.entities.Person;
import br.com.devxlabs.ravin.enums.EmployeeAviability;
import br.com.devxlabs.ravin.enums.MeritalStatus;
import br.com.devxlabs.ravin.enums.Responsibility;
import br.com.devxlabs.ravin.enums.Schooling;
import br.com.devxlabs.ravin.repositories.interfaces.RepositoryInterface;
import br.com.devxlabs.ravin.utility.textconstants.ExceptionTextConstants;
import br.com.devxlabs.ravin.utility.textconstants.QueriesTextConstants;

public class EmployeeRepository implements RepositoryInterface<Employee> {

	PersonRepository personRepository;

	public EmployeeRepository() {
		personRepository = new PersonRepository();
	}

	@Override
	public void save(Employee entity) {
		if (entity.getId() == 0) {
			insert(entity);
		} else {
			update(entity);
		}
	}

	@Override
	public List<Employee> listAll() {
		List<Employee> employees = new ArrayList<>();

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(QueriesTextConstants.LIST_ALL_EMPLOYEES);
			resultSet = statement.executeQuery();

			while (resultSet.next()) {

				Employee employee = new Employee();
				employee.setEmployeeId(resultSet.getInt("id"));
				employee.setRg(resultSet.getString("rg"));
				employee.setMeritalStatus(MeritalStatus.valueOf(resultSet.getString("meritalStatus")));
				employee.setSchooling(Schooling.valueOf(resultSet.getString("schooling")));
				employee.setResponsability(Responsibility.valueOf(resultSet.getString("responsability")));
				employee.setPis(resultSet.getInt("pis"));
				employee.setAdmissionDate(resultSet.getDate("admissionDate"));
				employee.setResignationDate(resultSet.getDate("resignationDate"));
				employee.setEmployeeAviability(EmployeeAviability.valueOf(resultSet.getString("employeeAviability")));

				var personId = resultSet.getInt("personId");
				Person person = personRepository.findById(personId);
				employee.setId(personId);
				employee.setAddress(person.getAddress());
				employee.setCpf(person.getCpf());
				employee.setDateOfBirth(person.getDateOfBirth());
				employee.setHasActive(person.isHasActive());
				employee.setName(person.getName());
				employee.setObservations(person.getObservations());
				employee.setPhone(person.getPhone());

				employees.add(employee);
			}
		} catch (SQLException exception) {
			throw new RuntimeException(ExceptionTextConstants.LIST_ALL_EMPLOYEES, exception);
		} finally {
			ConnectionUtils.closeConnection(resultSet, statement, connection);
		}
		return employees;
	}

	@Override
	public void removeById(int id) {

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(QueriesTextConstants.REMOVE_BY_ID_EMPLOYEE);
			statement.setInt(1, id);
			statement.execute();
		} catch (SQLException exception) {
			throw new RuntimeException(ExceptionTextConstants.REMOVE_BY_ID_EMPLOYEE, exception);
		} finally {
			ConnectionUtils.closeConnection(statement, connection);
		}

	}

	@Override
	public Employee findById(int id) {
		Employee employee = null;

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(QueriesTextConstants.FIND_BY_ID_EMPLOYEE);
			statement.setInt(1, id);
			resultSet = statement.executeQuery();

			if (resultSet.next()) {
				employee = new Employee();
				employee.setEmployeeId(resultSet.getInt("id"));
				employee.setRg(resultSet.getString("rg"));
				employee.setMeritalStatus(MeritalStatus.valueOf(resultSet.getString("meritalStatus")));
				employee.setSchooling(Schooling.valueOf(resultSet.getString("schooling")));
				employee.setResponsability(Responsibility.valueOf(resultSet.getString("responsability")));
				employee.setPis(resultSet.getInt("pis"));
				employee.setAdmissionDate(resultSet.getDate("admissionDate"));
				employee.setResignationDate(resultSet.getDate("resignationDate"));
				employee.setEmployeeAviability(EmployeeAviability.valueOf(resultSet.getString("employeeAviability")));

				var personId = resultSet.getInt("personId");
				Person person = personRepository.findById(personId);

				employee.setId(personId);
				employee.setAddress(person.getAddress());
				employee.setCpf(person.getCpf());
				employee.setDateOfBirth(person.getDateOfBirth());
				employee.setHasActive(person.isHasActive());
				employee.setName(person.getName());
				employee.setObservations(person.getObservations());
				employee.setPhone(person.getPhone());
			}
		} catch (SQLException exception) {
			throw new RuntimeException(ExceptionTextConstants.FIND_BY_ID_EMPLOYEE, exception);
		} finally {
			ConnectionUtils.closeConnection(resultSet, statement, connection);
		}
		return employee;
	}

	@Override
	public int count() {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(QueriesTextConstants.COUNT_EMPLOYEES);
			resultSet = statement.executeQuery();

			resultSet.next();
			return resultSet.getInt(1);

		} catch (SQLException exception) {
			throw new RuntimeException(ExceptionTextConstants.COUNT_EMPLOYEES, exception);
		} finally {
			ConnectionUtils.closeConnection(statement, connection);
		}
	}

	@Override
	public int insert(Employee entity) {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet generatedKey = null;

		try {

			Person person = new Person();
			person.setAddress(entity.getAddress());
			person.setCpf(entity.getCpf());
			person.setDateOfBirth(entity.getDateOfBirth());
			person.setHasActive(entity.isHasActive());
			person.setName(entity.getName());
			person.setObservations(entity.getObservations());
			person.setPhone(entity.getPhone());

			int personId = personRepository.insert(person);

			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(QueriesTextConstants.INSERT_EMPLOYEE, Statement.RETURN_GENERATED_KEYS);

			statement.setInt(1, personId);
			statement.setString(2, entity.getRg());
			statement.setString(3, entity.getMeritalStatus().getDescription());
			statement.setString(4, entity.getSchooling().getDescription());
			statement.setString(5, entity.getResponsability().getDescription());
			statement.setInt(6, entity.getPis());
			statement.setDate(7, new java.sql.Date(entity.getAdmissionDate().getTime()));
			statement.setDate(8, new java.sql.Date(entity.getResignationDate().getTime()));
			statement.setString(9, entity.getEmployeeAviability().getDescription());
			statement.execute();

			generatedKey = statement.getGeneratedKeys();
			int lastInsertedId = 0;

			if (generatedKey.next()) {
				lastInsertedId = generatedKey.getInt(1);
			}

			return lastInsertedId;

		} catch (SQLException ex) {
			throw new RuntimeException(ExceptionTextConstants.INSERT_EMPLOYEE, ex);
		} finally {
			ConnectionUtils.closeConnection(generatedKey, statement, connection);
		}

	}

	@Override
	public void update(Employee entity) {

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			Person person = new Person();
			person.setId(entity.getId());
			person.setAddress(entity.getAddress());
			person.setCpf(entity.getCpf());
			person.setDateOfBirth(entity.getDateOfBirth());
			person.setHasActive(entity.isHasActive());
			person.setName(entity.getName());
			person.setObservations(entity.getObservations());
			person.setPhone(entity.getPhone());

			personRepository.update(person);

			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(QueriesTextConstants.UPDATE_IMPLOYEE);

			statement.setInt(1, entity.getId());
			statement.setString(2, entity.getRg());
			statement.setString(3, entity.getMeritalStatus().getDescription());
			statement.setString(4, entity.getSchooling().getDescription());
			statement.setString(5, entity.getResponsability().getDescription());
			statement.setInt(6, entity.getPis());
			statement.setDate(7, new java.sql.Date(entity.getAdmissionDate().getTime()));
			statement.setDate(8, new java.sql.Date(entity.getResignationDate().getTime()));
			statement.setString(9, entity.getEmployeeAviability().getDescription());
			statement.setInt(10, entity.getEmployeeId());

			statement.execute();
		} catch (SQLException exception) {
			throw new RuntimeException(ExceptionTextConstants.UPDATE_IMPLOYEE, exception);
		} finally {
			ConnectionUtils.closeConnection(statement, connection);
		}

	}

}
