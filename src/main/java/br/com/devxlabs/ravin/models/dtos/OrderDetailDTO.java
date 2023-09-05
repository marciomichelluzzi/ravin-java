package br.com.devxlabs.ravin.models.dtos;

import java.io.Serializable;
import java.sql.Timestamp;

import br.com.devxlabs.ravin.models.enums.PreparationOrderStatus;

public class OrderDetailDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private ProductDTO product;
	private Timestamp requestDateTime;
	private Timestamp startPreparationDateTime;
	private Timestamp reminingPreparationTime;
	private PreparationOrderStatus preparationOrderStatus;
	private String comments;
	private int quantity;

	public OrderDetailDTO() {
		// TODO Auto-generated constructor stub
	}

	public OrderDetailDTO(int id, ProductDTO product, Timestamp requestDateTime, Timestamp startPreparationDateTime,
			Timestamp reminingPreparationTime, PreparationOrderStatus preparationOrderStatus, String comments,
			int quantity) {
		super();
		this.product = product;
		this.requestDateTime = requestDateTime;
		this.startPreparationDateTime = startPreparationDateTime;
		this.reminingPreparationTime = reminingPreparationTime;
		this.preparationOrderStatus = preparationOrderStatus;
		this.comments = comments;
		this.quantity = quantity;
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
		return "OrderDetailDTO [product=" + product + ", requestDateTime=" + requestDateTime
				+ ", startPreparationDateTime=" + startPreparationDateTime + ", reminingPreparationTime="
				+ reminingPreparationTime + ", preparationOrderStatus=" + preparationOrderStatus + ", comments="
				+ comments + ", quantity=" + quantity + "]";
	}
}
