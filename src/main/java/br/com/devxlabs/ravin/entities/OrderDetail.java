package br.com.devxlabs.ravin.entities;


import java.sql.Timestamp;

import br.com.devxlabs.ravin.enums.PreparationOrderStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class OrderDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne(cascade =  CascadeType.ALL)
	private Product product;
	
	private Timestamp requestDateTime;
	private Timestamp startPreparationDateTime;
	private Timestamp reminingPreparationTime;
	
	@Enumerated(value = EnumType.STRING)
	private PreparationOrderStatus preparationOrderStatus;
	
	private String comments;
	
	@Column(nullable = false)
	private int quantity;
	
	public OrderDetail() {
		// TODO Auto-generated constructor stub
	}

	public OrderDetail(int id, Product product, Timestamp requestDateTime, Timestamp startPreparationDateTime,
			Timestamp reminingPreparationTime, PreparationOrderStatus preparationOrderStatus, String comments,
			int quantity) {
		super();
		this.id = id;
		this.product = product;
		this.requestDateTime = requestDateTime;
		this.startPreparationDateTime = startPreparationDateTime;
		this.reminingPreparationTime = reminingPreparationTime;
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

	public Timestamp getReminingPreparationTime() {
		return reminingPreparationTime;
	}

	public void setReminingPreparationTime(Timestamp reminingPreparationTime) {
		this.reminingPreparationTime = reminingPreparationTime;
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
				+ reminingPreparationTime + ", preparationOrderStatus=" + preparationOrderStatus + ", comments="
				+ comments + ", quantity=" + quantity + "]";
	}
}
