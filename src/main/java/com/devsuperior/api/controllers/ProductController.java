package com.devsuperior.api.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.api.domain.Department;
import com.devsuperior.api.domain.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@GetMapping
	public List<Product> getObjects(){
		
		Department d1 = new Department(1l, "Tech");
		Department d2 = new Department(2l, "Pet");
		
		Product p1 = new Product(1l, "MacBook Pro", 4000.00, d1);
		Product p2 = new Product(1l, "MacBook Pro", 5000.00, d2);
		Product p3 = new Product(1l, "Pet House", 300.00, d2);
		
		List<Product> list = Arrays.asList(p1, p2, p3);
		
		return list;
	}

}
