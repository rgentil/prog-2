package Criterio;

import Diccionario.Palabra;

public class CriterioNombre extends Criterio {

	private String filtro;
	
	public CriterioNombre(String filtro) {
		this.filtro = filtro;
	}
	
	@Override
	public boolean cumple(Palabra p) {
		return p.getNombre().equals(filtro);
	}

}
