package br.com.devxlabs.ravin.services;

import static br.com.dexlabs.ravin.consts.ExeptionConsts.*;

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
import br.com.dexlabs.ravin.consts.ExeptionConsts;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	ModelMapper mapper;

	public List<ProductDTO> listAll() {
		List<ProductDTO> productsDTO = productRepository.findAll()
				.stream()
				.map(product -> mapper.map(product, ProductDTO.class)).toList();
		

		return productsDTO;
	}

	public ProductDTO findById(Long id) {
		Optional<Product> optional = productRepository.findById(id);
		return null;
	}

	public void deleteById(Long id) {
		
	}

	public List<ProductDTO> search(	String name, 
									String productType, 
									double minSalePrice, 
									double maxSalePrice, 
									Integer page, 
									String orderBy, 
									Integer itensPerPage, 
									String direction) {
		
		Pageable pageable = PageRequest.of(page, itensPerPage, 
					Direction.fromString(direction));
	
		Page<Product> products = productRepository.findAll(pageable);
		
		return null;
	}
	public long create(ProductDTO productDTO) throws Exception {
		return save(productDTO);
		
	}
	
	public long update(ProductDTO productDTO) throws Exception {
		return save(productDTO);
	}
	
	private Long save(ProductDTO productDTO) throws Exception {
		if(productDTO.getCostPrice() > productDTO.getSalePrice()) {
			throw new Exception(PRODUCT_COST_PRICE_GRATHER_THEN_SALE_PRICE);
		}
		try {
			Product product = mapper.map(productDTO, Product.class);
			Product update = productRepository.save(product);
			return update.getId();
		} catch (Exception e) 
			{
				throw new Exception(INSERT_PRODUCT_ERROR);
			}
		}
		
}
