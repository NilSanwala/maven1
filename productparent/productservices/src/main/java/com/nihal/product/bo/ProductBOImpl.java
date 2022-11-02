package com.nihal.product.bo;

import com.nihal.product.dao.ProductDAO;
import com.nihal.product.dao.ProductDAOImpl;
import com.nihal.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	
	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);

	}

	@Override
	public Product finalProduct(int id) {

		return dao.read(id);
	}

	@Override
	public Product findProduct(int parseInt) {
		// TODO Auto-generated method stub
		//return null;
		return dao.read(parseInt);
	}

}
