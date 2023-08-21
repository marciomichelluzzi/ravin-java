package br.com.devxlabs.ravin.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.devxlabs.ravin.utility.textconstants.ExceptionTextConstants;

public class ConnectionUtils {

	public static void closeConnection(ResultSet resultSet, PreparedStatement statement, Connection connection) {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			closeConnection(statement, connection);

		} catch (SQLException ex) {
			throw new RuntimeException(ExceptionTextConstants.CLOSE_DATABASE_CONNECTION, ex);
		}
	}

	public static void closeConnection(ResultSet generatedKey, ResultSet resultSet, PreparedStatement statement,
			Connection connection) {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (generatedKey != null) {
				generatedKey.close();
			}
			closeConnection(statement, connection);

		} catch (SQLException ex) {
			throw new RuntimeException(ExceptionTextConstants.CLOSE_DATABASE_CONNECTION, ex);
		}
	}

	public static void closeConnection(PreparedStatement statement, Connection connection) {
		try {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException ex) {
			throw new RuntimeException(ExceptionTextConstants.CLOSE_DATABASE_CONNECTION, ex);
		}
	}

}
