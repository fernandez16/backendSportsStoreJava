package com.capgemini.backendToDoJava;

import java.util.List;

public interface ProductService {
	 List<Product> list();
	 Product listId(int id);
	 Product add(Product p);
	 Product edit(Product p);
	 void delete(int id);
}
