package com.valid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.valid.dto.Producto;
import com.valid.interfaces.IProductService;

/**
 * @author Alejandro Echeverri Restrepo
 * 
 * Service for testing the application
 *
 */
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="productrest")
@RestController
public class ProductRest {

	@Autowired
	private IProductService productService;
	
	@GetMapping(value="products")
	public List<Producto> getProduct() {
		
		return productService.getProduct();
		
	}
	
}
