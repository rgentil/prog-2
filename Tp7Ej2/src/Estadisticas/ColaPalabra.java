package Estadisticas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Comparador.ComparadorPorCantOcurrenciasAsc;
import Comparador.ComparadorPorCantOcurrenciasDesc;

public class ColaPalabra {

	private List<Palabra> palabras;
	
	public ColaPalabra(String texto) {
		palabras = new ArrayList<Palabra>();
		texto = texto.replace(".", "").toUpperCase();
		texto = texto.replace(",", "");
		String[] textoSpliteado = texto.split(" ");
		for (String p : textoSpliteado) {
			addPalabra(new Palabra(p));
		}		
	}
	
	public List<Palabra> getPalabras() {
		List<Palabra> resultado = new ArrayList<Palabra>(palabras);
		return resultado;
	}
		
	public void addPalabra(Palabra pAdd) {
		if (palabras.isEmpty()) {
			palabras.add(pAdd);
		}else {
			if (palabras.contains(pAdd)) {
				int posicion = this.pos(pAdd);
				//System.out.println("\n Posición con método this.pos(Palabra) = " + posicion + "\n");
				((Palabra) palabras.get(posicion)).masUna();
			}else {
				palabras.add(pAdd);
			}
		}
	}
	
	private int pos(Palabra p) {
		//indexOf es lo mismo que recorrer todo
        //int posPorIndexOf = palabras.indexOf(p);
        //System.out.println("\n Posición con IndexOf = " + posPorIndexOf + "\n");
		int i = 0;
		while (i<palabras.size()) {
			if(palabras.get(i).equals(p)) {
				return i;
			}else {
				i++;
			}
		}
		return i;
	}
	
	public int getSize() {
		return palabras.size();
	}

	// 2. Retornar las N palabras más frecuentes.
	public List<Palabra> getMasFrecuentes(int n) {
		if (getSize() > n) {
			List<Palabra> resultado = new ArrayList<Palabra>(palabras); 
			Collections.sort(resultado, new ComparadorPorCantOcurrenciasDesc());
			System.out.println("\n getMasFrecuentes ordenado " + resultado);
			return resultado.subList(0, n);
		}
		return null;
	}
	
	// 3. Retornar las N palabras menos frecuentes.
	public List<Palabra> getMenosFrecuentes(int n) {
		if (getSize() > n) {
			List<Palabra> resultado = new ArrayList<Palabra>(palabras); 
			Collections.sort(resultado, new ComparadorPorCantOcurrenciasAsc());
			System.out.println("\n getMenosFrecuentes ordenado " + resultado);
			return resultado.subList(0, n);
		}
		return null;
	}

	// 4. Obtener la frecuencia de ocurrencia de una palabra.
	public int getFrecuenciaOcurrencia(Palabra p) {
		if (palabras.contains(p)) {
			return ( (Palabra)(palabras.get( palabras.indexOf(p) ) ) ).getCantOcurrencia();
		}
		return 0;
	}
	
	// 5. Obtener un listado de palabras ordenadas ascendentemente.
	public List<Palabra> getPalabrasOrdenadasAsc() {
		List<Palabra> resultado = new ArrayList<Palabra>(palabras);
		Collections.sort(resultado);
		return resultado;
	}
	
	//6. Obtener un listado de palabras ordenadas por frecuencia.
	public List<Palabra> getPalabrasOrdenadasPorFrecuencia() {
		List<Palabra> resultado = new ArrayList<Palabra>(palabras);
		Collections.sort(resultado,new ComparadorPorCantOcurrenciasAsc());
		return resultado;
		
	}	
}
