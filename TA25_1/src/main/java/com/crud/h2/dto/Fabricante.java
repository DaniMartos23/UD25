package com.crud.h2.dto;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="fabricante")
public class Fabricante {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name = "nombre")
	private String nombre;
	@OneToMany
    @JoinColumn(name="codigo")
	private List<Articulo>articulos;
	
	public Fabricante() {
		
	}
	/**
	 * @param id
	 * @param nombre
	 * @param articulos
	 */
	public Fabricante(Long id, String nombre) {
		//super();
		this.codigo = id;
		this.nombre = nombre;
	}
	
	

	//Getters y Setters
	
	/**
	* @return id
	*/
	public Long getId() {
		return this.codigo;
	}

	/**
	* @param id
	*/
	public void setId(Long id) {
		this.codigo = id;
	}

	/**
	* @return nombre
	*/
	public String getNombre() {
		return this.nombre;
	}

	/**
	* @param nombre
	*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	/**
	 * @return articulo
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulo")
	public List<Articulo> getArticulo() {
		return articulos;
	}

	/**
	 * @param registroCurso the registroCurso to set
	 */
	public void setArticulo(List<Articulo> articulo) {
		this.articulos = articulo;
	}
	//Metodo impresion de datos por consola
	
	@Override
	public String toString() {
		return "Fabricante [id=" + codigo + ", nombre=" + nombre + "]";
	}

	

	
}
