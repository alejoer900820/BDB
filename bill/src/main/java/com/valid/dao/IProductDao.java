package com.valid.dao;

import org.springframework.data.repository.CrudRepository;

import com.valid.dto.Producto;

/**
 * @author Alejandro Echeverri Restrepo
 * 
 * date 27/06/2020
 *
 */
public interface IProductDao extends CrudRepository<Producto, Long> {

}
