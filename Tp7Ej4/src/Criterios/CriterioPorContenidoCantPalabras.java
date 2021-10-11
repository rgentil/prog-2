package Criterios;

import Documentador.Documento;

public class CriterioPorContenidoCantPalabras extends Criterio {

	private int filtro;
	
	public CriterioPorContenidoCantPalabras(int filtro) {
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(Documento d1) {
		String[] palabras = d1.getContenido().split(" ");
		return palabras.length > filtro;
	}

}
