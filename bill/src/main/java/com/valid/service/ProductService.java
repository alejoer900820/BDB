package com.valid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valid.dao.IProductDao;
import com.valid.dto.Producto;
import com.valid.interfaces.IProductService;

@Service
public class ProductService implements IProductService {

	@Autowired
	IProductDao productDao;
	
	@Override
	public List<Producto> getProduct() {
		
		return (List<Producto>) productDao.findAll();
	}

}
