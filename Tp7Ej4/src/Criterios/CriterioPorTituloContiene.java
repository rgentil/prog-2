package Criterios;

import Documentador.Documento;

public class CriterioPorTituloContiene extends Criterio {

	private String filtro;
	
	public CriterioPorTituloContiene(String filtro) {
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(Documento d1) {
		return (d1.getTitulo().toUpperCase()).contains(filtro);
	}
	
	
	

}
