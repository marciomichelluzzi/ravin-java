package br.com.devxlabs.ravin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.devxlabs.ravin.models.dtos.ProductDTO;
import br.com.devxlabs.ravin.services.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/products")
@Tag(name = "Produto", description = "Endpoints relacionados ao produto")
public class ProductController {

	@Autowired
	ProductService service;

	@Operation(description = "Lista todos os produtos existentes", method = "GET")
	@ApiResponses(value = { 
			@ApiResponse(responseCode = "200", description = "Lista com todos os produtos") })
	@GetMapping
	public List<ProductDTO> listAll() {
		return service.listAll();
	}

	@Operation(description = "Busca um produto pelo id", method = "GET")
	@ApiResponses(
			value = {
					@ApiResponse(responseCode = "200", description = "Retorna o produto encontrado com determinado id"),
					@ApiResponse(responseCode = "404", description = "Nenhum produto encontrado com o id especificado")
			})
	@GetMapping(value = "/{id}")
	public ResponseEntity<Object> findById(@PathVariable Long id) {
		ProductDTO product = service.findById(id);

		if (product == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(product);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteById(@PathVariable Long id) {
		service.deleteById(id);
	}

	@GetMapping(value = "/search")
	public List<ProductDTO> search(@RequestParam("name") String name,
			@RequestParam(value = "productType") String productType,
			@RequestParam(value = "minSalePrice") double minSalePrice,
			@RequestParam(value = "maxSalePrice") double maxSalePrice,
			@RequestParam(value = "page", defaultValue = "0", required = false) Integer page,
			@RequestParam(value = "orderBy", defaultValue = "id", required = false) String orderBy,
			@RequestParam(value = "itensPerPage", defaultValue = "10", required = false) Integer itensPerPage,
			@RequestParam(value = "direction", defaultValue = "ASC", required = false) String direction) {
		return service.search(name, productType, minSalePrice, maxSalePrice, page, orderBy, itensPerPage, direction);
	}

	@PostMapping
	public ResponseEntity<Object> create(@Valid @RequestBody ProductDTO product) {
		try {
			return ResponseEntity.ok(service.create(product));
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PutMapping(value = "/{id}")
	public void update(@Valid @RequestBody ProductDTO product, @PathVariable Integer id) {
		System.out.println(product);
	}
}
