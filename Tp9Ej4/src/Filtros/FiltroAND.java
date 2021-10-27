package Filtros;

import Aseguradora.SeguroSimple;

public class FiltroAND extends Filtro{

	private Filtro f1;
	private Filtro f2;
	
	public FiltroAND(Filtro f1, Filtro f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean cumple(SeguroSimple s) {
		return f1.cumple(s) && f2.cumple(s);
	}
	

}
