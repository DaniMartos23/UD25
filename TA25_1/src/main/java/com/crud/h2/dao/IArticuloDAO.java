package com.crud.h2.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Articulo;

public interface IArticuloDAO extends JpaRepository<Articulo, Long>{
	
	public List<Articulo> findByNombre(String nombre);
}
