package br.com.devxlabs.ravin.models.dtos;

import java.io.Serializable;
import java.util.List;

import br.com.devxlabs.ravin.models.enums.TableStatus;

public class TableDTO implements Serializable {

	private EmployeeDTO employee;
	private List<TabDTO> tabs;
	private String name;
	private String code;
	private int number;
	private TableStatus tableStatus;

	public TableDTO() {
	}

	public TableDTO(EmployeeDTO employee, List<TabDTO> commands, String name, String code, int number,
			TableStatus tableStatus) {
		super();
		this.employee = employee;
		this.tabs = commands;
		this.name = name;
		this.code = code;
		this.number = number;
		this.tableStatus = tableStatus;
	}

	public EmployeeDTO getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeDTO employee) {
		this.employee = employee;
	}

	public List<TabDTO> getCommands() {
		return tabs;
	}

	public void setCommands(List<TabDTO> commands) {
		this.tabs = commands;
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

	@Override
	public String toString() {
		return "TableDTO [employee=" + employee + ", tabs=" + tabs + ", name=" + name + ", code=" + code + ", number="
				+ number + ", tableStatus=" + tableStatus + "]";
	}
}
