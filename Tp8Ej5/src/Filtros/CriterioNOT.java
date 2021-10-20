package Filtros;

import SistemaArchivo.ArchivoSistema;

public class CriterioNOT extends Criterio{
	
	private Criterio c;
	
	public CriterioNOT(Criterio c) {
		super();
		this.c = c;
	}

	@Override
	public boolean cumple(ArchivoSistema a) {
		return !c.cumple(a); 
	}

}
