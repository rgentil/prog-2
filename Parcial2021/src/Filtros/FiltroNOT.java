package Filtros;

import Agencia.Paquete;

public class FiltroNOT extends Filtro {

	private Filtro filtro;
	
	public FiltroNOT(Filtro filtro) {
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(Paquete paquete) {
		return !filtro.cumple(paquete);
	}

}
