package Criterios;

import java.util.List;

import Documentador.Documento;

public class CriterioPorAutor extends Criterio {

	private String filtro;
	
	public CriterioPorAutor(String filtro) {
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(Documento d1) {
		List<String> autores = d1.getAutores();
		for (String autor : autores) {
			if ((autor.toUpperCase()).equals(filtro))
				return true;
		}
		return false;
	}

}
