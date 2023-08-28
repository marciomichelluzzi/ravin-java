package br.com.devxlabs.ravin.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.devxlabs.ravin.models.dtos.ProductDTO;

@Service
public class ProductService {

	public List<ProductDTO> getAllProducts() {
		// TODO Auto-generated method stub
		return List.of(new ProductDTO());
	}

	public ProductDTO getProduct(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ProductDTO createProduct(ProductDTO product) {
		// TODO Auto-generated method stub
		return null;
	}

	public ProductDTO updateProduct(Long id, ProductDTO product) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub

	}

}
