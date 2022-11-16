package com.crud.h2.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="articulo")
public class Articulo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name="precio")
	private int precio;
	@ManyToOne
	@JoinColumn(name = "cod_fabricante")
    Fabricante cod_fabricante;
	
	
	
	public Articulo() {
		
	}
	/**
	 * @param id
	 * @param nombre
	 * @param precio
	 * @param cod_fabricante
	 */
	public Articulo(Long id, String nombre, String trabajo,int precio, Fabricante codigo_fabricante) {
		//super();
		this.codigo = id;
		this.nombre = nombre;
		this.precio= precio;
		this.cod_fabricante=codigo_fabricante;
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
	* @return precio
	*/
	public int getPrecio() {
		return this.precio;
	}

	/**
	* @param precio
	*/
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	/**
	 * @return cod_fabricante
	 */
	public Fabricante getFabricantes() {
		return this.cod_fabricante;
	}
	
	/**
	 * @param codigo_fab
	 */
	public void setFabricante(Fabricante codigo_fab) {
		this.cod_fabricante=codigo_fab;
	}
	
		
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Cliente [id=" + this.codigo + ", nombre=" + this.nombre + "]";
	}
}
