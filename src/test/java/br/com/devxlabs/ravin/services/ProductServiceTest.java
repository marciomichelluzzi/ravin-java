package br.com.devxlabs.ravin.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.util.Date;

import static br.com.devxlabs.ravin.consts.ExceptionConsts.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;

import br.com.devxlabs.ravin.models.dtos.ProductDTO;
import br.com.devxlabs.ravin.models.entities.Product;
import br.com.devxlabs.ravin.models.enums.ProductType;
import br.com.devxlabs.ravin.repositories.ProductRepository;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

	@Mock
	ProductRepository productRepository;

	@Mock
	ModelMapper mapper;

	@InjectMocks
	ProductService productService;

	@Test
	public void save_ShouldSave() throws Exception {
		// Arrange
		Long createdProductId = 1l;
		Product product = createProductEntity();
		Product createdProduct = createProductEntity();
		createdProduct.setId(createdProductId);
		ProductDTO productDTO = createProductDTO();
		when(mapper.map(productDTO, Product.class)).thenReturn(product);
		when(productRepository.save(product)).thenReturn(createdProduct);

		// Act
		Long id = productService.save(productDTO);

		// Asserts
		verify(mapper).map(productDTO, Product.class);
		verify(productRepository, times(1)).save(product);
		verifyNoMoreInteractions(productRepository);
		assertThat(id).isEqualTo(createdProductId);

	}

	@Test
	public void save_shouldntSave() {
		// Arrange
		Product product = createProductEntity();
		ProductDTO productDTO = createProductDTO();
		when(mapper.map(productDTO, Product.class)).thenReturn(product);
		when(productRepository.save(product)).thenThrow(new IllegalArgumentException());

		// Act
		Throwable exception = catchThrowable(() -> productService.save(productDTO));

		// Asserts
		assertThat(exception.getMessage()).isEqualTo(PRODUCT_INSERT_ERROR);
	}

	public ProductDTO createProductDTO() {
		ProductDTO productDTO = new ProductDTO(1L, "Hamburguer", "Veggie", "8df98", 12.9, 20.5, "10 minutos", "",
				ProductType.SNACK, true);

		return productDTO;
	}

	public Product createProductEntity() {
		Product product = new Product();
		product.setName("Hamburguer");
		product.setDescription("Veggie");
		product.setCode("8df98");
		product.setCostPrice(12.9);
		product.setSalePrice(20.5);
		product.setPreparationTime("10 minutos");
		product.setProductType(ProductType.SNACK);
		product.setHasActive(true);
		product.setCreatedBy("");
		product.setCreatedDate(new Date());
		product.setUpdatedBy("");
		product.setUpdatedDate(new Date());
		return product;
	}
}
