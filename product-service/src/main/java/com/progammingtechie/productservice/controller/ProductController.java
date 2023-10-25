/**
 * 
 */
package com.progammingtechie.productservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.progammingtechie.productservice.controller.dto.ProductRequest;
import com.progammingtechie.productservice.controller.dto.ProductResponse;
import com.progammingtechie.productservice.service.ProductService;

import lombok.RequiredArgsConstructor;

/**
 * 
 */
@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

	private final ProductService productService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createProduct(@RequestBody ProductRequest productRequest) {
		productService.createProduct(productRequest);
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<ProductResponse> getAllProducts() {
		//char ch = 'utea';
		//char ca = 'tea';
		//char cr = u0223;
		//char cc = 'itea';
		long a = 904423;
		//long b = 0xnf029L;
		//long b = ABH8097;
		//long b = 990023L;
		
		return productService.getAllProducts();
	}
}
