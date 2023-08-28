package br.com.devxlabs.ravin.models.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import br.com.devxlabs.ravin.models.enums.TabStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Tab {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "table_id")
	private Table table;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private Customer customer;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<OrderDetail> orderDetails;

	@Column(unique = true, nullable = false)
	private String code;

	private String comments;

	@Enumerated(value = EnumType.STRING)
	private TabStatus tabStatus;

	@CreatedBy
	private String createdBy;

	@CreatedDate
	private Date createdDate;

	private String updatedBy;
	private Date updatedDate;

	public Tab() {
		// TODO Auto-generated constructor stub
	}

	public Tab(int id, Table table, Customer customer, List<OrderDetail> orderDetails, String code, String comments,
			TabStatus tabStatus, String createdBy, Date createdDate, String updatedBy, Date updatedDate) {
		super();
		this.id = id;
		this.table = table;
		this.customer = customer;
		this.orderDetails = orderDetails;
		this.code = code;
		this.comments = comments;
		this.tabStatus = tabStatus;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
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

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public TabStatus getTabStatus() {
		return tabStatus;
	}

	public void setTabStatus(TabStatus tabStatus) {
		this.tabStatus = tabStatus;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public TabStatus getCommandaStatus() {
		return tabStatus;
	}

	public void setCommandaStatus(TabStatus commandaStatus) {
		this.tabStatus = commandaStatus;
	}

	@Override
	public String toString() {
		return "Tab [id=" + id + ", table=" + table + ", customer=" + customer + ", orderDetails=" + orderDetails
				+ ", code=" + code + ", comments=" + comments + ", tabStatus=" + tabStatus + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate + "]";
	}
	
	
}
