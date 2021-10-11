package Criterios;

import Documentador.Documento;

public class CriterioPorContenido extends Criterio {

	private String filtro;
	
	public CriterioPorContenido(String filtro) {
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(Documento d1) {
		return (d1.getContenido().toUpperCase()).contains(filtro);
	}

}
