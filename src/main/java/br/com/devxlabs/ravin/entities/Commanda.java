package br.com.devxlabs.ravin.entities;

import java.util.List;

import br.com.devxlabs.ravin.enums.CommandaStatus;

public class Commanda {
	private int id;
	private Table table;
	private Customer customer;
	private List<Order> orders;
	private String code;
	private String comments;
	private CommandaStatus commandaStatus;

	public Commanda() {
		// TODO Auto-generated constructor stub
	}

	public Commanda(int id, Table table, Customer customer, List<Order> orders, String code,
			String comments, CommandaStatus commandaStatus) {
		super();
		this.id = id;
		this.table = table;
		this.customer = customer;
		this.orders = orders;
		this.code = code;
		this.comments = comments;
		this.commandaStatus = commandaStatus;
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

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
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

	public CommandaStatus getCommandaStatus() {
		return commandaStatus;
	}

	public void setCommandaStatus(CommandaStatus commandaStatus) {
		this.commandaStatus = commandaStatus;
	}

	@Override
	public String toString() {
		return "Commanda [id=" + id + ", table=" + table + ", customer=" + customer + ", orders=" + orders + ", code="
				+ code + ", comments=" + comments + ", commandaStatus=" + commandaStatus + "]";
	}	
}
