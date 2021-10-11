package Diccionario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Comparador.ComparadorPorNombre;

/*
Cada palabra del diccionario posee la función gramatical que cumple la palabra (sustantivo, adverbio, adjetivo, etc), 
	una o más definiciones, una lista de sinónimos y una lista de antónimos. 
*/

public class Palabra implements Comparable<Palabra> {
	
	private String nombre;
	private String funcionGramatical;
	private List<String> definiciones;
	private List<Palabra> sinonimos;
	private List<Palabra> antonimos;
	
	public Palabra(String nombre, String funcionGramatical) {
		this.nombre = nombre;
		this.funcionGramatical = funcionGramatical;
		this.definiciones =  new ArrayList<String>();
		this.sinonimos =  new ArrayList<Palabra>();
		this.antonimos =  new ArrayList<Palabra>();
	}
	
	@Override
	public int compareTo(Palabra o) {
		return this.getNombre().compareTo(o.getNombre());
		//this > o --> 1
		//this < o --> -1
		//this = o --> 0
		
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Palabra p = (Palabra)o;
			return p.getNombre().equals(this.getNombre());
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Palabra = " + this.getNombre() + " - " + this.getFuncionGramatical() + " - Definiciones = " + definiciones.toString();
	}
	
	public void addDefinicion(String definicion) {
		definiciones.add(definicion);
	}
	
	public void addSinonimo(Palabra sinonimo) {
		sinonimos.add(sinonimo);
	}
	
	//● Dada una palabra, obtener la lista de sinónimos, ordenada ascendentemente 
	public List<Palabra> getSinonimos() {
		List<Palabra> resultado = new ArrayList<Palabra>(sinonimos);		
		Collections.sort(resultado, new ComparadorPorNombre());		
		return resultado;		
	}
		
	//● Dada una palabra, obtener la lista de antónimos, ordenada ascendentemente
	public List<Palabra> getAntonimos() {
		List<Palabra> resultado = new ArrayList<Palabra>(antonimos);		
		Collections.sort(resultado, new ComparadorPorNombre());		
		return resultado;		
	}

	//● Dada una palabra, obtener la lista de definiciones
	public List<String> getDefiniciones() {
		return new ArrayList<String>(definiciones);
	}

	
	public void addAntonimo(Palabra antonimo) {
		this.antonimos.add(antonimo);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getFuncionGramatical() {
		return funcionGramatical;
	}
	
	public void setFuncionGramatical(String funcionGramatical) {
		this.funcionGramatical = funcionGramatical;
	}

}
