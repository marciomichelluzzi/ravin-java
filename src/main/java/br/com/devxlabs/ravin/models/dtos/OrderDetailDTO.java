package br.com.devxlabs.ravin.models.dtos;


import br.com.devxlabs.ravin.enums.PreparationOrderStatus;

import java.sql.Timestamp;

public class OrderDetailDTO {

	private int id;
	private ProductDTO product;
	private Timestamp requestDateTime;
	private Timestamp startPreparationDateTime;
	private Timestamp remainingPreparationTime;

	private PreparationOrderStatus preparationOrderStatus;
	private String comments;

	private int quantity;
	
	public OrderDetailDTO() {
		// TODO Auto-generated constructor stub
	}

	public OrderDetailDTO(int id, ProductDTO product, Timestamp requestDateTime, Timestamp startPreparationDateTime,
						  Timestamp remainingPreparationTime, PreparationOrderStatus preparationOrderStatus, String comments,
						  int quantity) {
		super();
		this.id = id;
		this.product = product;
		this.requestDateTime = requestDateTime;
		this.startPreparationDateTime = startPreparationDateTime;
		this.remainingPreparationTime = remainingPreparationTime;
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

	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
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

	public Timestamp getRemainingPreparationTime() {
		return remainingPreparationTime;
	}

	public void setRemainingPreparationTime(Timestamp remainingPreparationTime) {
		this.remainingPreparationTime = remainingPreparationTime;
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
				+ remainingPreparationTime + ", preparationOrderStatus=" + preparationOrderStatus + ", comments="
				+ comments + ", quantity=" + quantity + "]";
	}
}
