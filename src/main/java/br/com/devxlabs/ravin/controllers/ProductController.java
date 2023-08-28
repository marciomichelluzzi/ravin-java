package br.com.devxlabs.ravin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devxlabs.ravin.models.dtos.ProductDTO;
import br.com.devxlabs.ravin.services.ProductService;

@RestController
@RequestMapping(value = "/api/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping
	public ResponseEntity<Void> getAllProducts() {
		return ResponseEntity.noContent().build();
//		return productService.getAllProducts();
	}

	@GetMapping("/{id}")
	public ProductDTO getProduct(@PathVariable Long id) {
		return productService.getProduct(id);
	}

	@PostMapping
	public ProductDTO createProduct(@RequestBody ProductDTO product) {
		return productService.createProduct(product);
	}

	@PutMapping("/{id}")
	public ProductDTO updateProduct(@PathVariable Long id, @RequestBody ProductDTO product) {
		return productService.updateProduct(id, product);
	}

	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
	}

//	@GetMapping("/search")
//	public ResponseEntity<Void> search(){
//		return ResponseEntity.noContent().build();
//		
//	}

}
