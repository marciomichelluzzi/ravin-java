package br.com.devxlabs.ravin.models.dtos;

import java.io.Serializable;

import br.com.devxlabs.ravin.models.enums.ProductType;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public class ProductDTO implements Serializable {

	public static final String MIN_COST_PRICE = "0.0";
	public static final String MIN_SAlE_PRICE = "0.0";
	
	private static final long serialVersionUID = 42L;
	
	private Long id;
	
	@NotBlank(message = "O campo nome não pode estar em branco.")
	@NotEmpty(message = "O campo nome não pode estar vazio.")
	private String name;
	
	@NotBlank(message = "O campo descrição não pode estar em branco.")
	@NotEmpty(message = "O campo descrição não pode estar vazio.")
	private String description;
	
	@NotBlank(message = "O campo código não pode estar em branco.")
	@NotEmpty(message = "O campo código não pode estar vazio.")
	private String code;
	
	@DecimalMin(value = MIN_COST_PRICE, message = "O preço de custo não pode ser negativo.")
	private Double costPrice;
	
	@DecimalMin(value = MIN_SAlE_PRICE, message = "O preço de venda não pode ser negativo.")
	private Double salePrice;
	
	@NotBlank(message = "O campo tempo de preparo não pode estar em branco.")
	@NotEmpty(message = "O campo tempo de preparo não pode estar vazio.")
	private String preparationTime;
	
	private ProductType productType;
	
	private String comments;
	private Boolean hasActive = true;

	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(Long id, String name, String description, String code, Double costPrice, Double salePrice,
			String preparationTime, String comments, ProductType productType, Boolean hasActive) {
		super();
		this.id = id;
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
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public String getPreparationTime() {
		return preparationTime;
	}

	public void setPreparationTime(String preparationTime) {
		this.preparationTime = preparationTime;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Boolean getHasActive() {
		return hasActive;
	}

	public void setHasActive(Boolean hasActive) {
		this.hasActive = hasActive;
	}

	@Override
	public String toString() {
		return "ProductDTO [name=" + name + ", description=" + description + ", code=" + code + ", costPrice="
				+ costPrice + ", salePrice=" + salePrice + ", preparationTime=" + preparationTime + ", comments="
				+ comments + ", productType=" + productType + ", hasActive=" + hasActive + "]";
	}
}
