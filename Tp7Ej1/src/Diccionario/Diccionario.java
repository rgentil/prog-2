package Diccionario;

import java.util.List;

import Criterio.CriterioPalabraEntre;

/*
1 - Diccionario 

Un diccionario almacena una lista de palabras, ordenadas alfabéticamente. 

Cada palabra del diccionario posee la función gramatical que cumple la palabra (sustantivo, adverbio, adjetivo, etc), 
	una o más definiciones, una lista de sinónimos y una lista de antónimos. 
	
Implementar en Java una solución que permita: 

● Agregar, modificar y eliminar palabras del diccionario. 

● Dada una palabra, obtener la lista de sinónimos, ordenada ascendentemente 

● Dada una palabra, obtener la lista de antónimos, ordenada ascendentemente 

● Dada una palabra, obtener la lista de definiciones 

● Dadas dos palabras, obtener la lista de palabras comprendidas entre ellas, en orden alfabético. 

*/
public class Diccionario {

	private ColaPalabras palabras;

	public ColaPalabras getPalabras() {
		return palabras;
	}

	public Diccionario() {
		this.palabras = new ColaPalabras();
	}

	public Diccionario(ColaPalabras palabras) {
		this.palabras = palabras;
	}

	// Un diccionario almacena una lista de palabras, ordenadas alfabéticamente.
	// ● Agregar, modificar y eliminar palabras del diccionario.
	public void addPalabra(Palabra p) {
		palabras.add(p);
	}

	public void modificarPalabra(Palabra original, Palabra nueva) {
		palabras.modificar(original, nueva);
	}

	public void eliminarPalabra(Palabra p) {
		palabras.eliminar(p);
	}

	// ● Dada una palabra, obtener la lista de sinónimos, ordenada ascendentemente

	public List<Palabra> getSinonimos(Palabra p) {
		return palabras.getSinonimos(p);
	}

	// ● Dada una palabra, obtener la lista de antónimos, ordenada ascendentemente
	public List<Palabra> getAntonimos(Palabra p) {
		return palabras.getAntonimos(p);
	}

	// ● Dada una palabra, obtener la lista de definiciones
	public List<String> getDefiniciones(Palabra p) {
		return palabras.getDefiniciones(p);
	}

	// ● Dadas dos palabras, obtener la lista de palabras comprendidas entre ellas,
	// en orden alfabético.

	public ColaPalabras buscarEntre(Palabra p1, Palabra p2) {
		return palabras.buscar(new CriterioPalabraEntre(p1,p2));
	} 
	
	public void setPalabras(ColaPalabras palabras) {
		this.palabras = palabras;
	}

}
