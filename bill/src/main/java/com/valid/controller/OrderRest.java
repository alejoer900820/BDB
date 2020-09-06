package com.valid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.valid.PedidoResponse;
import com.valid.dto.Pedido;
import com.valid.interfaces.IOrderService;
import com.valid.util.EnumMessages;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="orderrest")
@RestController
@Api(value = "bill microservice", description = "Bill the sum of all products to user in Bill service")
public class OrderRest {

	@Autowired
	private IOrderService orderService;
	
	@PostMapping(value="billservice")
	@ApiOperation(value = "Service to sum all products", notes = "sum all products")
	public ResponseEntity<?>  billService(@RequestBody Pedido pedido) {
		
		PedidoResponse pedidoResponse = new PedidoResponse();
		
		Double suma = orderService.billService(pedido);
	
		if (suma != null) {
			
			pedidoResponse.setSuma(suma);
			pedidoResponse.setMensaje(EnumMessages.OK.getName());
			
			return ResponseEntity.status(HttpStatus.OK).body(pedidoResponse);
			
		} else {
			
			pedidoResponse.setSuma(suma);
			pedidoResponse.setMensaje(EnumMessages.ERROR.getName());
			
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(pedidoResponse);
			
		}
		
		
		
	}
	
}
