package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Products;



public interface ProductService {

	List<Products> getProductList();

	List<Products> addProductList(Products products);

}
