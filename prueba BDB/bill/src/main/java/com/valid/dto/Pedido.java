package com.valid.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Alejandro Echeverri Restrepo
 * 
 * date 274/06/2020
 * 
 * 
 *
 */
@Entity
@Table(name="pedido")
@ApiModel("Model Pedido")
public class Pedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@ApiModelProperty(value = "the pedido's id", required = true)
	private Long id;	
	
	@ApiModelProperty(value = "the cliente's id", required = true)
	private Long clienteId;
	
	private Date fecha;
	
	private String direccion;

	@OneToMany(targetEntity=Producto.class, mappedBy="pedido", fetch=FetchType.EAGER)
	@ApiModelProperty(value = "List of products", required = true)
	private List<Producto> producto;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}



}
