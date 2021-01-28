package com.nagp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "orderEntry")
public class OrderEntry {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Long id;
	
	private String productName;
	
	private String productCode;
	
	private Double price;
	
	private Double quantity;
	
	private String imageUrl;
}
