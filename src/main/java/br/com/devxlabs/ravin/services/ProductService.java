package br.com.devxlabs.ravin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.devxlabs.ravin.models.dtos.ProductDTO;

@Service
public class ProductService {

	public List<ProductDTO> listAll() {
		return List.of(new ProductDTO(), new ProductDTO());
	}

	public ProductDTO findById(Long id) {
		System.out.println(id);
		return new ProductDTO();
	}

	public void deleteById(Long id) {
		System.out.println("Deletou o produto com id = " + id);
	}

	public List<ProductDTO> search(String name, String productType, double minSalePrice, double maxSalePrice) {
		System.out.println("Buscando o produto com Filtros");
		return List.of(new ProductDTO(), new ProductDTO(), new ProductDTO());
	}

}
