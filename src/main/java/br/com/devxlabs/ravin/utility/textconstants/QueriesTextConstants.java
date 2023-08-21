package br.com.devxlabs.ravin.utility.textconstants;

public class QueriesTextConstants {

	public static final String LIST_ALL_PEOPLE = "SELECT * FROM person";
	public static final String REMOVE_BY_ID_PERSON = "DELETE FROM person WHERE id = ?";
	public static final String FIND_BY_ID_PERSON = "SELECT * FROM person WHERE id = ?";
	public static final String COUNT_PEOPLE = " SELECT COUNT(*) FROM person";
	public static final String INSERT_PERSON = " INSERT INTO Person (name, address, phone, cpf, dateOfBirth, observations, hasActive) "
			+ " VALUES (?, ?, ?, ?, ?, ?, ?) ";
	public static final String UPDATE_PERSON = " UPDATE Person SET name = ?, "
			+ " address = ?, phone = ?, dateOfBirth = ?, observations = ?, hasActive = ?, cpf = ? WHERE id = ? ";

	public static final String LIST_ALL_EMPLOYEES = "SELECT * FROM employee";
	public static final String REMOVE_BY_ID_EMPLOYEE = "DELETE FROM employee WHERE id = ?";
	public static final String FIND_BY_ID_EMPLOYEE = "SELECT * FROM employee WHERE id = ?";
	public static final String COUNT_EMPLOYEES = " SELECT COUNT(*) FROM employee";
	public static final String INSERT_EMPLOYEE = " INSERT INTO employee "
			+ " (personId, rg, meritalStatus, schooling, responsability, "
			+ " pis, admissionDate, resignationDate, employeeAviability) " + " VALUES (?, ?, ? , ?, ?, ?, ?, ?, ?)";
	public static final String UPDATE_IMPLOYEE = " UPDATE Employee " + " SET " + "personId = ?, " + " rg = ?, "
			+ " meritalStatus = ?, " + " schooling = ?, " + " responsability = ?, " + " pis = ?, "
			+ " admissionDate = ?, " + " resignationDate = ?, " + " employeeAviability = ? " + " WHERE id = ?; ";

}
