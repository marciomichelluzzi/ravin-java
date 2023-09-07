package br.com.devxlabs.ravin.services;

import static org.mockito.Mockito.when;

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

	public void save_ShouldSave() {
		Product product = createProduct();
		Product createdProduct = createProduct();
		when(productRepository.save(product)).thenReturn(createdProduct);
	}

	public ProductDTO createProductDTO() {
		ProductDTO productDTO = new ProductDTO(1L, "Hamburguer", "Veggie", "8df98", 12.9, 20.5, "10 minutos", "",
				ProductType.SNACK, true);

		return productDTO;
	}
	
	public Product createProduct() {
//		Product product = new Product(1L, "Hamburguer", "Veggie", "8df98", 12.9, 20.5, "10 minutos", "",
//				ProductType.SNACK, true, new Date(), "", new Date(),"");
//		return product;
		return null;
	}

}
