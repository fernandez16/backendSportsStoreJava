package com.capgemini.backendToDoJava;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface ProductRepository extends Repository<Product, Integer> {
	List<Product> findAll();
	Product findById(int id);
	Product save(Product p);
	void delete(Product p);	
}
