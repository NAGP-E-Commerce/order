package com.nagp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

import lombok.Data;


@Data
@Entity(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Long id;
	
	@OneToMany
	@JoinTable(name = "order_entries",
    joinColumns = @JoinColumn(name = "entry_id", referencedColumnName = "id"))
	private List<OrderEntry> orderEntries = new ArrayList<OrderEntry>();
	
	private String userId;
	
	private String status;
}
