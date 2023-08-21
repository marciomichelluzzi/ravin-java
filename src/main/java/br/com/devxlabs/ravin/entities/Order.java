package br.com.devxlabs.ravin.entities;


import java.sql.Timestamp;

import br.com.devxlabs.ravin.enums.PreparationOrderStatus;

public class Order {
	
	private int id;
	private Product product;
	private Timestamp requestDateTime;
	private Timestamp startPreparationDateTime;
	private Timestamp remindingPreparationTime;
	private PreparationOrderStatus preparationOrderStatus;
	private String comments;
	private int quantity;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int id, Product product, Timestamp requestDateTime, Timestamp startPreparationDateTime,
			Timestamp remindingPreparationTime, PreparationOrderStatus preparationOrderStatus, String comments,
			int quantity) {
		super();
		this.id = id;
		this.product = product;
		this.requestDateTime = requestDateTime;
		this.startPreparationDateTime = startPreparationDateTime;
		this.remindingPreparationTime = remindingPreparationTime;
		this.preparationOrderStatus = preparationOrderStatus;
		this.comments = comments;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Timestamp getRequestDateTime() {
		return requestDateTime;
	}

	public void setRequestDateTime(Timestamp requestDateTime) {
		this.requestDateTime = requestDateTime;
	}

	public Timestamp getStartPreparationDateTime() {
		return startPreparationDateTime;
	}

	public void setStartPreparationDateTime(Timestamp startPreparationDateTime) {
		this.startPreparationDateTime = startPreparationDateTime;
	}

	public Timestamp getRemindingPreparationTime() {
		return remindingPreparationTime;
	}

	public void setRemindingPreparationTime(Timestamp remindingPreparationTime) {
		this.remindingPreparationTime = remindingPreparationTime;
	}

	public PreparationOrderStatus getPreparationOrderStatus() {
		return preparationOrderStatus;
	}

	public void setPreparationOrderStatus(PreparationOrderStatus preparationOrderStatus) {
		this.preparationOrderStatus = preparationOrderStatus;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", product=" + product + ", requestDateTime=" + requestDateTime
				+ ", startPreparationDateTime=" + startPreparationDateTime + ", remindingPreparationTime="
				+ remindingPreparationTime + ", preparationOrderStatus=" + preparationOrderStatus + ", comments="
				+ comments + ", quantity=" + quantity + "]";
	}
}
