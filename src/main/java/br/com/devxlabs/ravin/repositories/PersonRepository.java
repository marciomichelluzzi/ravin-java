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
import br.com.devxlabs.ravin.entities.Person;
import br.com.devxlabs.ravin.repositories.interfaces.RepositoryInterface;
import br.com.devxlabs.ravin.utility.textconstants.ExceptionTextConstants;
import br.com.devxlabs.ravin.utility.textconstants.QueriesTextConstants;

public class PersonRepository implements RepositoryInterface<Person> {

	public PersonRepository() {

	}

	@Override
	public void save(Person entity) {
		if (entity.getId() == 0) {
			insert(entity);
		} else {
			update(entity);
		}
	}

	@Override
	public List<Person> listAll() {
		List<Person> people = new ArrayList<>();

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(QueriesTextConstants.LIST_ALL_PEOPLE);
			resultSet = statement.executeQuery();

			while (resultSet.next()) {

				Person person = new Person();
				person.setId(resultSet.getInt("id"));
				person.setCpf(resultSet.getString("cpf"));
				person.setAddress(resultSet.getString("meritalStatus"));
				person.setDateOfBirth(resultSet.getDate("dateOfBirth"));
				person.setName(resultSet.getString("name"));
				person.setPhone(resultSet.getString("phone"));
				person.setHasActive(resultSet.getBoolean("hasActive"));
				person.setObservations(resultSet.getString("observations"));

				people.add(person);
			}
		} catch (SQLException exception) {
			throw new RuntimeException(ExceptionTextConstants.LIST_ALL_PEOPLE, exception);
		} finally {
			ConnectionUtils.closeConnection(resultSet, statement, connection);
		}
		return people;
	}

	@Override
	public void removeById(int id) {

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(QueriesTextConstants.REMOVE_BY_ID_PERSON);
			statement.setInt(1, id);
			statement.execute();
		} catch (SQLException exception) {
			throw new RuntimeException(ExceptionTextConstants.REMOVE_BY_ID_PERSON, exception);
		} finally {
			ConnectionUtils.closeConnection(statement, connection);
		}

	}

	@Override
	public Person findById(int id) {
		Person person = null;

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(QueriesTextConstants.FIND_BY_ID_PERSON);
			statement.setInt(1, id);
			resultSet = statement.executeQuery();

			if (resultSet.next()) {
				person = new Person();
				person.setAddress(resultSet.getString("address"));
				person.setCpf(resultSet.getString("cpf"));
				person.setDateOfBirth(resultSet.getDate("dateOfBirth"));
				person.setHasActive(resultSet.getBoolean("hasActive"));
				person.setId(resultSet.getInt("id"));
				person.setName(resultSet.getString("name"));
				person.setObservations(resultSet.getString("observations"));
				person.setPhone(resultSet.getString("phone"));
			}
		} catch (SQLException exception) {
			throw new RuntimeException(ExceptionTextConstants.FIND_BY_ID_PERSON, exception);
		} finally {
			ConnectionUtils.closeConnection(resultSet, statement, connection);
		}
		return person;
	}

	@Override
	public int count() {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(QueriesTextConstants.COUNT_PEOPLE);
			resultSet = statement.executeQuery();

			resultSet.next();
			return resultSet.getInt(1);

		} catch (SQLException exception) {
			throw new RuntimeException(ExceptionTextConstants.COUNT_PEOPLE, exception);
		} finally {
			ConnectionUtils.closeConnection(statement, connection);
		}
	}

	@Override
	public int insert(Person entity) {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet generatedKey = null;

		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(QueriesTextConstants.INSERT_PERSON, Statement.RETURN_GENERATED_KEYS);

			statement.setString(1, entity.getName());
			statement.setString(2, entity.getAddress());
			statement.setString(3, entity.getPhone());
			statement.setString(4, entity.getCpf());
			statement.setDate(5, new java.sql.Date(entity.getDateOfBirth().getTime()));
			statement.setString(6, entity.getObservations());
			statement.setBoolean(7, entity.isHasActive());

			statement.execute();

			generatedKey = statement.getGeneratedKeys();
			int lastInsertedId = 0;
			if (generatedKey.next()) {
				lastInsertedId = generatedKey.getInt(1);
			}

			return lastInsertedId;
		} catch (SQLException ex) {
			throw new RuntimeException(ExceptionTextConstants.INSERT_PERSON, ex);
		} finally {
			ConnectionUtils.closeConnection(generatedKey, statement, connection);
		}

	}

	@Override
	public void update(Person entity) {

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(QueriesTextConstants.UPDATE_PERSON);

			statement.setString(1, entity.getName());
			statement.setString(2, entity.getAddress());
			statement.setString(3, entity.getPhone());
			statement.setDate(4, new java.sql.Date(entity.getDateOfBirth().getTime()));
			statement.setString(5, entity.getObservations());
			statement.setBoolean(6, entity.isHasActive());
			statement.setString(7, entity.getCpf());
			statement.setInt(8, entity.getId());

			statement.execute();
		} catch (SQLException exception) {
			throw new RuntimeException(ExceptionTextConstants.UPDATE_PERSON, exception);
		} finally {
			ConnectionUtils.closeConnection(statement, connection);
		}

	}
}
