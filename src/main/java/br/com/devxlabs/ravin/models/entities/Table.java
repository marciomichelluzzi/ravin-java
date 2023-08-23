package br.com.devxlabs.ravin.models.entities;

import br.com.devxlabs.ravin.enums.TableStatus;
import jakarta.persistence.*;

import java.util.List;

@Entity
@jakarta.persistence.Table(name = "restaurant_table")
public class Table {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne(cascade = CascadeType.ALL)
	private Employee employee;
	@OneToMany(mappedBy = "table", cascade = CascadeType.ALL)
	private List<Tab> tabs;
	@Column(nullable = false, unique = true)
	private String name;
	@Column(nullable = false, unique = true)
	private String code;
	@Column(unique = true)
	private int number;
	@Enumerated(EnumType.STRING)
	private TableStatus tableStatus;

	public Table() {
		// TODO Auto-generated constructor stub
	}

	public Table(int id, Employee employee, List<Tab> tabs, String name, String code, int number,
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Tab> getTabs() {
		return tabs;
	}

	public void setTabs(List<Tab> tabs) {
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
