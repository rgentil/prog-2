package Biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Comparador.ComparadorCompuesto;
import Comparador.ComparadorPorAnioEdicion;
import Comparador.ComparadorPorAutor;
import Comparador.ComparadorPorGeneroPrincipal;
import Comparador.ComparadorPorISBN;

/*
Una biblioteca posee un sistema para la administración de libros disponibles para sus socios.

El sistema debe permitir ordenar el conjunto de todos los libros disponibles por diferentes
criterios, acorde a lo que desee buscar en un determinado momento. 

Por defecto, los libros se ordenan por ISBN, un código identificatorio único de cada libro. 
Sin embargo, es posible que el administrador de la biblioteca desee ordenarlos por autor, año de edición o género
principal, tanto ascendente como descendentemente. 

Resolver el problema utilizando el método sort(.), de la clase Collections.  
*/
public class Biblioteca {

	private String nombre;
	
	private List<Libro> libros;
	
	public Biblioteca(String nombre) {
		this.nombre = nombre;
		libros = new ArrayList<Libro>();
	}
	
	public void addLibro(Libro l) {
		libros.add(l);
	}
	
	public List<Libro> getListaLibros() {
		return new ArrayList<Libro>(libros);
	}
	
	public List<Libro> getLibro(ComparadorCompuesto c){
		ArrayList<Libro> resultado = new ArrayList<Libro>(libros);
		Collections.sort(resultado,c);
		return resultado;
	}
	
	public List<Libro> getLibrosOrdenadosPorISBN(String direccion){
		ArrayList<Libro> resultado = new ArrayList<Libro>(libros);
		
		Collections.sort(resultado,new ComparadorPorISBN());	
		
		if (direccion != null && direccion.equals("desc")) {
			Collections.reverse(resultado);
		}
		
		return resultado;
	}
	
	public List<Libro> getLibrosOrdenadosPorAutor(String direccion){
		ArrayList<Libro> resultado = new ArrayList<Libro>(libros);
		
		Collections.sort(resultado,new ComparadorPorAutor());	
		
		if (direccion != null && direccion.equals("desc")) {
			Collections.reverse(resultado);
		}
		
		return resultado;
	}
	
	public List<Libro> getLibrosOrdenadosPorAnioEdicion(String direccion){
		ArrayList<Libro> resultado = new ArrayList<Libro>(libros);
		
		Collections.sort(resultado,new ComparadorPorAnioEdicion());	
		
		if (direccion != null && direccion.equals("desc")) {
			Collections.reverse(resultado);
		}
		
		return resultado;
	}
	
	public List<Libro> getLibrosOrdenadosPorGeneroPrincipal(String direccion){
		ArrayList<Libro> resultado = new ArrayList<Libro>(libros);
		
		Collections.sort(resultado,new ComparadorPorGeneroPrincipal());	
		
		if (direccion != null && direccion.equals("desc")) {
			Collections.reverse(resultado);
		}
		
		return resultado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
