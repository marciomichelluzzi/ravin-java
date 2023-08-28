package br.com.devxlabs.ravin.models.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import br.com.devxlabs.ravin.models.enums.TableStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
@jakarta.persistence.Table(name = "restaurant_table")
public class Table {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Employee employee;

	@OneToMany(mappedBy = "table", cascade = CascadeType.ALL)
	private List<Tab> tabs;

	@Column(nullable = false, unique = true)
	private String name;

	@Column(nullable = false, unique = true)
	private String code;

	@Column(unique = true)
	private int number;

	@Enumerated(value = EnumType.STRING)
	private TableStatus tableStatus;

	@CreatedBy
	private String createdBy;

	@CreatedDate
	private Date createdDate;

	private String updatedBy;
	private Date updatedDate;

	public Table() {
		// TODO Auto-generated constructor stub
	}

	public Table(int id, Employee employee, List<Tab> tabs, String name, String code, int number,
			TableStatus tableStatus, String createdBy, Date createdDate, String updatedBy, Date updatedDate) {
		super();
		this.id = id;
		this.employee = employee;
		this.tabs = tabs;
		this.name = name;
		this.code = code;
		this.number = number;
		this.tableStatus = tableStatus;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public List<Tab> getTabs() {
		return tabs;
	}

	public void setTabs(List<Tab> tabs) {
		this.tabs = tabs;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
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

	public List<Tab> getCommands() {
		return tabs;
	}

	public void setCommands(List<Tab> commands) {
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
		return "Table [id=" + id + ", employee=" + employee + ", tabs=" + tabs + ", name=" + name + ", code=" + code
				+ ", number=" + number + ", tableStatus=" + tableStatus + ", createdBy=" + createdBy + ", createdDate="
				+ createdDate + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate + "]";
	}
}
