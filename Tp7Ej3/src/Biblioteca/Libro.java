package Biblioteca;

/*
Una biblioteca posee un sistema para la administración de libros disponibles para sus socios.
El sistema debe permitir ordenar el conjunto de todos los libros disponibles por diferentes
criterios, acorde a lo que desee buscar en un determinado momento. 
Por defecto, los libros se ordenan	 por ISBN, un código identificatorio único de cada libro. 
Sin embargo, es posible que el administrador de la biblioteca desee ordenarlos por autor, año de edición o género
principal, tanto ascendente como descendentemente. 

Resolver el problema utilizando el método sort(.), de la clase Collections.  
*/

public class Libro implements Comparable<Libro>{

	private String ISBN;
	private String autor;
	private int anioEdicion;
	private String generoPrincipl;

	public Libro(String ISBN, String autor, int anioEdicion, String generoPrincipl) {
		this.ISBN = ISBN; //Math.floor(Math.random() * 99999) + UUID.randomUUID().toString();
		this.autor = autor;
		this.anioEdicion = anioEdicion;
		this.generoPrincipl = generoPrincipl;
	}
	
	@Override
	public int compareTo(Libro l) {
		return this.getISBN().compareTo(l.getISBN());
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Libro l = (Libro)o;
			return l.getISBN().equals(this.getISBN());
		}catch(Exception e) {
			return false;
		}		
	}
	
	public String toString() {
		return "\n ISBN = " + this.getISBN() + " Autor = " + this.getAutor() 
		+ " Año Edición = " + this.getAnioEdicion() + " Genero Principal = " + this.getGeneroPrincipl();  
	}

	public String getISBN() {
		return this.ISBN;
	}
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnioEdicion() {
		return anioEdicion;
	}

	public void setAnioEdicion(int anioEdicion) {
		this.anioEdicion = anioEdicion;
	}

	public String getGeneroPrincipl() {
		return generoPrincipl;
	}

	public void setGeneroPrincipl(String generoPrincipl) {
		this.generoPrincipl = generoPrincipl;
	}


}
