package br.com.devxlabs.ravin.services;

import static br.com.devxlabs.ravin.consts.ExceptionConsts.*;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;


import br.com.devxlabs.ravin.models.dtos.ProductDTO;
import br.com.devxlabs.ravin.models.entities.Product;
import br.com.devxlabs.ravin.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	ModelMapper mapper;

	public List<ProductDTO> listAll() {
		List<ProductDTO> productsDTO = productRepository.findAll().stream()
				.map(product -> mapper.map(product, ProductDTO.class)).toList();

		return productsDTO;
	}

	public ProductDTO findById(Long id) {
		Optional<Product> optional = productRepository.findById(id);
		ProductDTO productDTO = null;

		if (optional.isPresent()) {
			productDTO = mapper.map(optional.get(), ProductDTO.class);
		}

		return productDTO;
	}

	public void deleteById(Long id) {
		productRepository.deleteById(id);
	}

	public List<ProductDTO> search(String name, String productType, double minSalePrice, double maxSalePrice,
			Integer page, String orderBy, Integer itensPerPage, String direction) {

		Pageable pageable = PageRequest.of(page, itensPerPage, Direction.fromString(direction));

		Page<Product> products = productRepository.findAll(pageable);

		return null;
	}

	public Long create(ProductDTO productDTO) throws Exception {
		return save(productDTO);
	}
	public Long update(ProductDTO productDTO) throws Exception {
		var optional = productRepository.findById(productDTO.getId());
		
		if(optional.isPresent()) {
			Product product = optional.get();
			
			if(!productDTO.getName().isEmpty())
				product.setName(productDTO.getName());
			if(!productDTO.getDescription().isEmpty() )
				product.setDescription(productDTO.getDescription());
			// ...
			
			productRepository.save(product);
			return product.getId();
		} else {
			throw new Exception("");
		}
	}
	
	public Long save(ProductDTO productDTO) throws Exception {
		if (productDTO.getCostPrice() > productDTO.getSalePrice()) {
			throw new Exception(PRODUCT_COST_PRICE_GRATHER_THEN_SALE_PRICE);
		}
		
		try {
			Product product = mapper.map(productDTO, Product.class);
			Product created = productRepository.save(product);
			
			return created.getId();
		} catch (Exception e) {
			throw new Exception(PRODUCT_INSERT_ERROR);
		}
	}

}
