package com.devsuperior.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.api.domain.Product;
import com.devsuperior.api.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public List<Product> getObjects(){		
		List<Product> list = productRepository.findAll();		
		return list;
	}

}
