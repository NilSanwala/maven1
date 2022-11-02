package com.nihal.product.bo;

import com.nihal.product.dto.Product;

public interface ProductBO {
	void create(Product product);
	
	Product finalProduct(int id);

	Product findProduct(int parseInt);
	
}
