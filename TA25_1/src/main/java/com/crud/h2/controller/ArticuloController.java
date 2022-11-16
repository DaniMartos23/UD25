package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Articulo;
import com.crud.h2.service.ArticuloServiceImpl;



@RestController
@RequestMapping("/api")
public class ArticuloController {
	
	@Autowired
	ArticuloServiceImpl articuloServiceImpl;
	
	@GetMapping("/articulos")
	public List<Articulo> listarArticulos(){
		return articuloServiceImpl.listarArticulos();
	}
	
	//listar articulos por campo nombre
	@GetMapping("/articulos/nombre/{nombre}")
	public List<Articulo> listarArticuloNombre(@PathVariable(name="nombre") String nombre) {
	    return articuloServiceImpl.listarArticuloNombre(nombre);
	}
	
	
	@PostMapping("/articulos")
	public Articulo salvarArticulo( Articulo articulo) {
		return articuloServiceImpl.guardarArticulo(articulo);
	}
	
	
	@GetMapping("/articulos/{codigo}")
	public Articulo ArticuloXID(@PathVariable(name="codigo") Long codigo) {
		
		Articulo articulo_xid= new Articulo();
		
		articulo_xid= articuloServiceImpl.articuloXID(codigo);
		
		System.out.println("Articulo XID: "+articulo_xid);
		
		return articulo_xid;
	}
	
	@PutMapping("/articulos/{codigo}")
	public Articulo actualizarArticulo(@PathVariable(name="codigo")Long codigo, Articulo articulo) {
		
		Articulo articulo_seleccionado= new Articulo();
		Articulo articulo_actualizado= new Articulo();
		
		articulo_seleccionado= articuloServiceImpl.articuloXID(codigo);
		
		articulo_seleccionado.setNombre(articulo.getNombre());
		
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		
		articulo_seleccionado.setFabricante(articulo.getFabricantes());
		
		articulo_actualizado = articuloServiceImpl.actualizarArticulo(articulo_seleccionado);
		
		System.out.println("El Articulo actualizado es: "+ articulo_actualizado);
		
		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulos/{codigo}")
	public void eliminarArticulo(@PathVariable(name="codigo")Long codigo) {
		articuloServiceImpl.eliminarArticulo(codigo);
	}
	
	
}
