package br.com.devxlabs.ravin.models.dtos;

import br.com.devxlabs.ravin.enums.TableStatus;

import java.util.List;

public class TableDTO {

	private int id;

	private EmployeeDTO employee;

	private List<TabDTO> tabs;

	private String name;

	private String code;

	private int number;

	private TableStatus tableStatus;

	public TableDTO() {
		// TODO Auto-generated constructor stub
	}

	public TableDTO(int id, EmployeeDTO employee, List<TabDTO> tabs, String name, String code, int number,
					TableStatus tableStatus) {
		super();
		this.id = id;
		this.employee = employee;
		this.tabs = tabs;
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

	public EmployeeDTO getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeDTO employee) {
		this.employee = employee;
	}

	public List<TabDTO> getTabs() {
		return tabs;
	}

	public void setTabs(List<TabDTO> tabs) {
		this.tabs = tabs;
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
