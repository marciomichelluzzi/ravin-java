package br.com.devxlabs.ravin.utility.textconstants;

public class ExceptionTextConstants {

	// PersonRespository
	public static final String LIST_ALL_PEOPLE = "Erro ao buscar todos as pessoas";
	public static final String REMOVE_BY_ID_PERSON = "Erro remover o pessoa";
	public static final String FIND_BY_ID_PERSON = "Erro ao buscar a pessoa pelo id";
	public static final String COUNT_PEOPLE = "Erro ao contar a quantidade total de pessoas";
	public static final String INSERT_PERSON = "Erro ao inserir uma pessoa";
	public static final String UPDATE_PERSON = "Erro ao atualizar uma pessoa";

	// EmployeeRespository
	public static final String LIST_ALL_EMPLOYEES = "Erro ao buscar todos os funcionários";
	public static final String REMOVE_BY_ID_EMPLOYEE = "Erro remover o funcionário, existem relações do funcionário com outras entidades do sistema";
	public static final String FIND_BY_ID_EMPLOYEE = "Erro ao buscar o funcioário pelo id";
	public static final String COUNT_EMPLOYEES = "Erro ao contar a quantidade total de funcionários";
	public static final String INSERT_EMPLOYEE = "Erro ao inserir um funcionário";
	public static final String UPDATE_IMPLOYEE = "Erro ao atualizar um funcionário";

	// EmployeeController
	public static final String CANNOT_SAVE_UNDERAGE_EMPLOYEE = "Não pode salvar o funcionario, pois ele é menor de idade";

	// General
	public static final String CLOSE_DATABASE_CONNECTION = "Erro ao fechar a conexão com o banco de dados";

}
