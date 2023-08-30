package br.com.devxlabs.ravin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.devxlabs.ravin.models.dtos.PersonDTO;
import br.com.devxlabs.ravin.models.dtos.ProductDTO;
import br.com.devxlabs.ravin.services.ProductService;

@RestController
@RequestMapping(value = "/api/products")
public class ProductController {

	@Autowired
	ProductService service;

	@GetMapping
	public List<ProductDTO> listAll() {
		return service.listAll();
	}

	@GetMapping(value = "/{id}")
	public ProductDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteById(@PathVariable Long id) {
		service.deleteById(id);
	}
	
	@GetMapping(value = "/search")
	public List<ProductDTO> search(
			@RequestParam("name") String name, 
			@RequestParam("productType") String productType,
			@RequestParam("minSalePrice") double minSalePrice,
			@RequestParam("maxSalePrice") double maxSalePrice
			){
		return service.search(name, productType, minSalePrice, maxSalePrice);
	}

}
