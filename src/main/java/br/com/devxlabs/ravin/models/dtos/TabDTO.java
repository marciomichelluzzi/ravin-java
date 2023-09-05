package br.com.devxlabs.ravin.models.dtos;

import java.util.List;

import br.com.devxlabs.ravin.models.enums.TabStatus;

public class TabDTO {

	private TableDTO table;
	private CustomerDTO customer;
	private List<OrderDetailDTO> orderDetails;
	private String code;
	private String comments;
	private TabStatus tabStatus;

	public TabDTO() {
		// TODO Auto-generated constructor stub
	}

	public TabDTO(TableDTO table, CustomerDTO customer, List<OrderDetailDTO> orderDetails, String code, String comments,
			TabStatus tabStatus) {
		super();
		this.table = table;
		this.customer = customer;
		this.orderDetails = orderDetails;
		this.code = code;
		this.comments = comments;
		this.tabStatus = tabStatus;
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
		return "TabDTO [table=" + table + ", customer=" + customer + ", orderDetails=" + orderDetails + ", code=" + code
				+ ", comments=" + comments + ", tabStatus=" + tabStatus + "]";
	}
}
