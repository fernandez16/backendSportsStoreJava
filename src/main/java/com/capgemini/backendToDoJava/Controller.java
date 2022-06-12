package com.capgemini.backendToDoJava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/products")
public class Controller {

	@Autowired
	ProductService service;

	@GetMapping
	public List<Product> list() {
		return service.list();
	}

	@GetMapping(path = { "/{id}" })
	public Product listId(@PathVariable("id") int id) {
		return service.listId(id);
	}

	@PostMapping
	public Product add(@RequestBody Product p) {
		return service.add(p);
	}

	@PutMapping
	public Product edit(@RequestBody Product p) {
		return service.edit(p);
	}

	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") int id) {
		service.delete(id);
	}

}
