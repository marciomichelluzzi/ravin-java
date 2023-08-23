package br.com.devxlabs.ravin.models.dtos;

import br.com.devxlabs.ravin.enums.ProductType;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serial;
import java.io.Serializable;

public class ProductDTO implements Serializable {
	private static final String MIN_COST_PRICE = "0.0";
	private static final String MAX_COST_PRICE = "0.0";

	@Serial
	private static final long serialVersionUID = 1L;
	private int id;
	@NotBlank (message = "O campo 'nome' não pode estar em branco")
	@NotEmpty (message = "O campo 'nome' não pode estar vazio")
	private String name;
	@NotBlank (message = "O campo 'descrição' não pode estar em branco")
	@NotEmpty (message = "O campo 'descrição' não pode estar vazio")
	private String description;
	@NotBlank (message = "O campo 'código' não pode estar em branco")
	@NotEmpty (message = "O campo 'código' não pode estar vazio")
	private String code;
	@DecimalMin(value = MIN_COST_PRICE, message = "O 'preço de custo' não pode ser negativo")
	@NotBlank (message = "O campo 'preço de custo' não pode estar em branco")
	@NotEmpty (message = "O campo 'preço de custo' não pode estar vazio")
	private double costPrice;
	@DecimalMin(value = MAX_COST_PRICE, message = "O 'preço de venda' não pode ser negativo")
	@NotBlank (message = "O campo 'preço de venda' não pode estar em branco")
	@NotEmpty (message = "O campo 'preço de venda' não pode estar vazio")
	private double salePrice;
	@NotBlank (message = "O campo 'tempo de preparação' não pode estar em branco")
	@NotEmpty (message = "O campo 'tempo de preparação' não pode estar vazio")
	private String preparationTime;
	@NotBlank (message = "O campo 'tipo de produto' não pode estar em branco")
	@NotEmpty (message = "O campo 'tipo de produto' não pode estar vazio")
	private ProductType productType;

	private final boolean hasActive = true;

	public ProductDTO(int id, String name, String description, String code, double costPrice, double salePrice, String preparationTime, ProductType productType) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.code = code;
		this.costPrice = costPrice;
		this.salePrice = salePrice;
		this.preparationTime = preparationTime;
		this.productType = productType;
	}


}
