package Criterios;

import Documentador.Documento;

public class CriterioPorTitulo extends Criterio {

	private String filtro;
	
	public CriterioPorTitulo(String filtro) {
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(Documento d1) {
		return (d1.getTitulo().toUpperCase()).equals(filtro);
	}

}
