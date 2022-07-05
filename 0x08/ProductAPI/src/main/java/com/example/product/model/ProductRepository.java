package com.example.product.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {


	  private List<Product> list = new ArrayList<Product>();

	  public List<Product> getAllProducts() {
		  return this.list;
	  }

	  public Product getProductById(Long id) {
		  return this.list.stream().filter(product -> product.getId().equals(Long.valueOf(id.toString()))).findFirst().orElse(null);
	  }

	  public void addProduct(Product s) {
	    list.add(s);
	  }

	  public void updateProduct(Product s) {
	    for(Product product : this.list) {
	    	if (product.getId().equals(s.getId())) {
				product.setCode(s.getCode());
				product.setDescription(s.getDescription());
				product.setPrice(s.getPrice());
				product.setCreatedOne(s.getCreatedOne());
				product.setStatus(s.getStatus());
			}
	    }
	   }

	   public void removeProduct(Product s) {
	     this.list.remove(s);
	   }

	   public void addList(List<Product> listOfProducts) {
	     this.list.addAll(listOfProducts);
	   }
}
