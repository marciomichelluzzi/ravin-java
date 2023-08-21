package br.com.devxlabs.ravin.entities;

import java.util.List;

import br.com.devxlabs.ravin.enums.TableStatus;

public class Table {

	private int id;
	
	private Employee employee;
	private List<Commanda> commands;
	private String name;
	private String code;	
	private int number;
	private TableStatus tableStatus;

	public Table() {
		// TODO Auto-generated constructor stub
	}

	public Table(int id, Employee employee, List<Commanda> commands, String name, String code, int number,
			TableStatus tableStatus) {
		super();
		this.id = id;
		this.employee = employee;
		this.commands = commands;
		this.name = name;
		this.code = code;
		this.number = number;
		this.tableStatus = tableStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Commanda> getCommands() {
		return commands;
	}

	public void setCommands(List<Commanda> commands) {
		this.commands = commands;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public TableStatus getTableStatus() {
		return tableStatus;
	}

	public void setTableStatus(TableStatus tableStatus) {
		this.tableStatus = tableStatus;
	}
}
