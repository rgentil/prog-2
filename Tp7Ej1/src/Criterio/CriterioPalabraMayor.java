package Criterio;

import Diccionario.Palabra;

public class CriterioPalabraMayor extends Criterio {

	private Palabra filtro;
	
	public CriterioPalabraMayor(Palabra filtro) {
		this.filtro = filtro;
	}
	
	@Override
	public boolean cumple(Palabra p) {
		return p.getNombre().compareTo(filtro.getNombre()) > 0;
	}

}
