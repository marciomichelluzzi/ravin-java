package br.com.devxlabs.ravin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devxlabs.ravin.models.dtos.ProductDTO;
import br.com.devxlabs.ravin.services.ProductService;

@RestController
@RequestMapping(value = "/api/producs")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping()
	public List<ProductDTO> listAll(){
		return service.listAll();
	}

}
