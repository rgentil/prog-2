package Diccionario;

import java.util.List;
import Criterio.Criterio;

public class ColaPalabras {

	private List<Palabra> palabras;
	
	public int cantPalabras() {
		return this.palabras.size();
	}
	
	public Palabra getPalabra(Palabra p) {
		int i = 0;
		while(i<this.cantPalabras()) {
			if (palabras.get(i).compareTo(p) == 0) {
				return palabras.get(i); 
			}else {
				i++;
			}
		}
		return null;
	}
	
	public int getPosicionPalabra(Palabra p) {
		int i = 0;
		while(i<this.cantPalabras()) {
			if (palabras.get(i).compareTo(p) == 0) {
				return i; 
			}else {
				i++;
			}
		}
		return -1;
	}
	
	//Un diccionario almacena una lista de palabras, ordenadas alfabéticamente. 
	//● Agregar, modificar y eliminar palabras del diccionario. 
	
	public void add(Palabra palabra) {
		if (palabras.isEmpty()) {
			palabras.add(palabra);
		}else {
			if (!palabras.contains(palabra)) {
				int i = 0;
				boolean encontro = false;
				while(i<this.cantPalabras() && !encontro) {
					if (palabras.get(i).compareTo(palabra) > 0) {
						encontro = true;
						palabras.add(i,palabra);
					}else {
						i++;
					}
				}
				if (!encontro) {
					palabras.add(palabra);
				}
			}
		}		
	}
	
	public void modificar(Palabra original, Palabra nueva) {
		this.eliminar(original);
		this.add(nueva);
	}
	
	public void eliminar(Palabra p) {
		//palabras.remove(p);
		int pos = getPosicionPalabra(p);
		if (pos > -1) {
			palabras.set(pos, p);
		}	
	}
	
	//● Dada una palabra, obtener la lista de sinónimos, ordenada ascendentemente 
	public List<Palabra> getSinonimos(Palabra p){
		Palabra palabraEnCola = getPalabra(p);
		List<Palabra>sinonimos = palabraEnCola.getSinonimos();		
		return sinonimos;
	}
	
	//● Dada una palabra, obtener la lista de antónimos, ordenada ascendentemente
	public List<Palabra> getAntonimos(Palabra p){
		Palabra palabraEnCola = getPalabra(p);
		List<Palabra>antonimos = palabraEnCola.getAntonimos();		
		return antonimos;
	}
	
	//● Dada una palabra, obtener la lista de definiciones
	public List<String> getDefiniciones(Palabra p) {
		Palabra palabraEnCola = getPalabra(p);
		List<String>definiciones = palabraEnCola.getDefiniciones();		
		return definiciones;
	}

	//● Dadas dos palabras, obtener la lista de palabras comprendidas entre ellas, en orden alfabético.
	public ColaPalabras buscar(Criterio criterio) {
		ColaPalabras resultado = new ColaPalabras(); 
		for (Palabra p : palabras) {
			if (criterio.cumple(p)) {
				resultado.add(p);
			}
		}
		return resultado;
	}	

}
