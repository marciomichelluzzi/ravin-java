package br.com.devxlabs.ravin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.devxlabs.ravin.models.dtos.ProductDTO;

@Service
public class ProductService {
	
	public List<ProductDTO> listAll(){
		return List.of(new ProductDTO());
	}

}
