package br.com.devxlabs.ravin.models.dtos;

import br.com.devxlabs.ravin.enums.TabStatus;

import java.util.List;

public class TabDTO {

	private int id;

	private TableDTO table;

	private CustomerDTO customer;

	private List<OrderDetailDTO> orderDetails;

	private String code;
	private String comments;

	private TabStatus tabStatus;

	public TabDTO() {
		// TODO Auto-generated constructor stub
	}

	public TabDTO(int id, TableDTO table, CustomerDTO customer, List<OrderDetailDTO> orderDetails, String code,
				  String comments, TabStatus tabStatus) {
		super();
		this.id = id;
		this.table = table;
		this.customer = customer;
		this.orderDetails = orderDetails;
		this.code = code;
		this.comments = comments;
		this.tabStatus = tabStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TableDTO getTable() {
		return table;
	}

	public void setTable(TableDTO table) {
		this.table = table;
	}

	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}

	public List<OrderDetailDTO> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetailDTO> orderDetails) {
		this.orderDetails = orderDetails;
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

	public TabStatus getTabStatus() {
		return tabStatus;
	}

	public void setTabStatus(TabStatus tabStatus) {
		this.tabStatus = tabStatus;
	}

	@Override
	public String toString() {
		return "Tab [id=" + id + ", table=" + table + ", customer=" + customer + ", orders=" + orderDetails + ", code="
				+ code + ", comments=" + comments + ", tabStatus=" + tabStatus + "]";
	}	
}
