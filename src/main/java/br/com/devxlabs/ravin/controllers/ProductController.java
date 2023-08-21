package br.com.devxlabs.ravin.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devxlabs.ravin.controllers.interfaces.ProductControllerInterface;
import br.com.devxlabs.ravin.entities.Product;

@RestController
@RequestMapping("/products")
public class ProductController implements ProductControllerInterface {

	@GetMapping
	public List<Product> listAll() {
		List<Product> productList = List.of(new Product());
		return productList;
	}

	@Override
	public void save(Product entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
