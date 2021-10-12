package Criterios;

import Documentador.Documento;

public class CriterioCompuestoAnd extends Criterio {

	private Criterio criterio;
	private Criterio siguiente;
	
	public CriterioCompuestoAnd(Criterio c, Criterio siguiente) {
		this.criterio = c;
		this.siguiente = siguiente;
	}
	
	public CriterioCompuestoAnd(Criterio c) {
		this.criterio = c;
		this.siguiente = null;
	}

	@Override
	public boolean cumple(Documento d1) {
		boolean cumple = criterio.cumple(d1);
		if (cumple && siguiente!=null) {
			return siguiente.cumple(d1);
		} else {
			return cumple;
		}
	}

}
