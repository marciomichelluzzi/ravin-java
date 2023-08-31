package br.com.devxlabs.ravin.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devxlabs.ravin.models.dtos.ProductDTO;
import br.com.devxlabs.ravin.models.entities.Product;
import br.com.devxlabs.ravin.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	

	public List<ProductDTO> listAll() {
		return List.of(new ProductDTO(), new ProductDTO());
	}

	public ProductDTO findById(Long id) {
		Optional<Product> optional = productRepository.findById(id);
		return null;
	}

	public void deleteById(Long id) {
		System.out.println("Deletou o produto com id = " + id);
	}

	public List<ProductDTO> search(String name, String productType, double minSalePrice, double maxSalePrice) {
		System.out.println("Buscando o produto com Filtros");
		return List.of(new ProductDTO(), new ProductDTO(), new ProductDTO());
	}

}
