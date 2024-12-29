package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Products {
	
	@Id
	Long productId;
	String productName;
	String description;
	String category;
	Long price;
	Long stock_quantity;
	String manufacturer;
	String age_range;
	
	

}
