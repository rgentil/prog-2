package Criterios;

import SistemaPapaNoel.Carta;

public class CriterioPorRegalo {
	
	private String regalo;
	
	public CriterioPorRegalo(String regalo) {
		super();
		this.regalo = regalo;
	}

	public boolean cumple(Carta c) {
		return c.tieneRegalo(regalo);
	}
	
}
