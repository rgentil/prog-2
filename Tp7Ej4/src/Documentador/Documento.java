package Documentador;

import java.util.ArrayList;
import java.util.List;

/*
Un documento tiene 
	un título, 
	una lista de autores, 
	un contenido textual y 
	una lista de palabras clave. 
*/
public class Documento {
	private String titulo;
	private List<String> autores;
	private String contenido;
	private List<String> palabrasClave;
	
	public Documento(String titulo, String contenido) {
		this.titulo = titulo;
		this.autores = new ArrayList<String>();
		this.contenido = contenido;
		this.palabrasClave = new ArrayList<String>();
	}
	
	@Override
	public String toString() {
		return "\n Título = " + this.titulo + " \n   Lista de Autores = " + this.autores + " \n   Contenido = " + this.contenido + "\n   Lista de palabras claves = " + this.palabrasClave + "\n";
	}
	
	@Override
	public boolean equals (Object o) {
		try { 
			return ((Documento)o).getTitulo().equals(this.getTitulo());
		}catch(Exception e) {
			return false;
		}	
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public List<String> getAutores() {
		return new ArrayList<String>(autores);
	}
	
	public void addAutor(String autor) {
		this.autores.add(autor);
	}
	
	public String getContenido() {
		return contenido;
	}
	
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	public List<String> getPalabrasClave() {
		return new ArrayList<String>(palabrasClave);
	}
	
	public void addPalabrasClave(String palabraClave) {
		this.palabrasClave.add(palabraClave);
	}
	
	
	
	
			
}
