package Filtros;

import SistemaArchivo.ArchivoSistema;

public class CriterioAND extends Criterio{
	
	private Criterio c1;
	private Criterio c2;
	
	public CriterioAND(Criterio c1, Criterio c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(ArchivoSistema a) {
		return c1.cumple(a) && c2.cumple(a); 
	}
	
			

}
