package primerparte.src.libreria;

import java.util.ArrayList;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private long dni;
	private double descuento;
	
	private ArrayList<String> autoresFavoritos;
	private ArrayList<String> generosFavoritos;
	private ArrayList<Producto> compras ;
	
	public Cliente(String nombre, String apellido, String direccion, long dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		
		this.autoresFavoritos = new ArrayList<String>() ;
		this.generosFavoritos = new ArrayList<String>() ;
		this.compras =new ArrayList<Producto>();
		
	}
	
	public boolean compro(Producto p) {
		return compras.contains(p);
	}	
	
	/*
	A algunos clientes les gusta el libro solo si el autor del mismo está en su lista de autores favoritos. 
		Pero hay clientes más exigentes que piden que el autor esté en su lista de favoritos 
		y además que el género también este en su lista de géneros favoritos 
	*/
	public boolean leGusta(Libro libro){
		return leGustaAutor(libro.getAutor());
	}
		
	
	public void addAutorFavorito(String nombre) {
		if (!autoresFavoritos.contains(nombre)) {//Funciona usando el equal del tipo de elemento
			autoresFavoritos.add(nombre);
		}
	}
	
	public boolean leGustaGenero(String genero) {
		return generosFavoritos.contains(genero); 
	}
	
	public boolean leGustaAutor(String autor) {
		return autoresFavoritos.contains(autor); 
	}
	
	public void addgeneroFavorito(String nombre) {
		if (!generosFavoritos.contains(nombre)) {
			generosFavoritos.add(nombre);
		}
	}
	
	public void addgeneroFavorito(Producto p) {
		compras.add(p);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}


}
