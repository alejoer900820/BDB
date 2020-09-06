package com.valid.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.valid.dto.Pedido;
import com.valid.dto.Producto;
import com.valid.interfaces.IOrderService;

@Service
public class OrderService implements IOrderService {


	@Override
	public Double billService(Pedido pedido) {
		
		List<Producto> productos = new ArrayList<Producto>();
		
		Double suma = 0.0;
		
		if(pedido != null) {
			
			if (pedido.getProducto() != null) {
				
				productos = pedido.getProducto();
				
				if (!productos.isEmpty()) {
					
					for (Producto producto : productos) {
						
						suma += producto.getPrecio() * producto.getCantidad();
						
					}
					
				}
				
			}
			
			
		}
		
		
		return suma;
	}
	


}
