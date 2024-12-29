package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Products;
import com.example.demo.services.ProductService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;





@RestController
public class ProductsController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/getproductlist")
	public List<Products> getProductList(){
		return productService.getProductList();
		}
	
	@PostMapping("/addproduct")
	public List<Products> addProductList(@RequestBody Products products){
		return productService.addProductList(products);
	}
	
	
	}





