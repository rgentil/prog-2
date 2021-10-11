package Criterio;

import Diccionario.Palabra;

public class CriterioPalabraMenor extends Criterio {

	private Palabra filtro;
	
	public CriterioPalabraMenor(Palabra filtro) {
		this.filtro = filtro;
	}
	
	@Override
	public boolean cumple(Palabra p) {
		return p.getNombre().compareTo(filtro.getNombre()) < 0;
	}

}
