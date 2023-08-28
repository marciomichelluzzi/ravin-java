package br.com.devxlabs.ravin.models.dtos;

import java.io.Serializable;

import br.com.devxlabs.ravin.models.enums.ProductType;

public class ProductDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String description;
	private String code;
	private double costPrice;
	private double salePrice;
	private String preparationTime;
	private String comments;
	private ProductType productType;
	private boolean hasActive;

	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(String name, String description, String code, double costPrice, double salePrice,
			String preparationTime, String comments, ProductType productType, boolean hasActive) {
		super();
		this.name = name;
		this.description = description;
		this.code = code;
		this.costPrice = costPrice;
		this.salePrice = salePrice;
		this.preparationTime = preparationTime;
		this.comments = comments;
		this.productType = productType;
		this.hasActive = hasActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public String getPreparationTime() {
		return preparationTime;
	}

	public void setPreparationTime(String preparationTime) {
		this.preparationTime = preparationTime;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public boolean isHasActive() {
		return hasActive;
	}

	public void setHasActive(boolean hasActive) {
		this.hasActive = hasActive;
	}

	@Override
	public String toString() {
		return "ProductDTO [name=" + name + ", description=" + description + ", code=" + code + ", costPrice="
				+ costPrice + ", salePrice=" + salePrice + ", preparationTime=" + preparationTime + ", comments="
				+ comments + ", productType=" + productType + ", hasActive=" + hasActive + "]";
	}
}
