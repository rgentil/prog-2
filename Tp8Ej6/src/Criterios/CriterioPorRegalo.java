package Criterios;

import SistemaPapaNoel.Carta;

public class CriterioPorRegalo extends Criterio {
	
	private String regalo;
	
	public CriterioPorRegalo(String regalo) {
		super();
		this.regalo = regalo;
	}

	@Override
	public boolean cumple(Carta c) {
		return c.tieneRegalo(regalo);
	}
	
}
