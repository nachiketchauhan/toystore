package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Products;
import com.example.demo.repo.ProductRepo;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;
	
	@Override
	public List<Products> getProductList() {
		return productRepo.findAll();
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Products> addProductList(Products products) {
		// TODO Auto-generated method stub
		return (List<Products>) productRepo.save(products);
	}

}
