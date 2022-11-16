package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Fabricante;



public interface IFabricanteService {

	//Metodos del CRUD
	public List<Fabricante> listarFabricantes(); 
	
	public Fabricante guardarFabricante(Fabricante fabricante);
	
	public Fabricante fabricanteXID(Long id);
	
	public List<Fabricante> listarFabricanteNombre(String nombre);
	
	public Fabricante actualizarFabricante(Fabricante fabricante); 
	
	public void eliminarFabricante(Long id);
	
	
}
