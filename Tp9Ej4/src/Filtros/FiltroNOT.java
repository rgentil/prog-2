package Filtros;

import Aseguradora.SeguroSimple;

public class FiltroNOT extends Filtro{

	private Filtro f;
	
	public FiltroNOT(Filtro f) {
		super();
		this.f = f;
	}

	@Override
	public boolean cumple(SeguroSimple s) {
		return !f.cumple(s);
	}
	

}
