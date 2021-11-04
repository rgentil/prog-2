package Filtros;

import Agencia.Paquete;

public class FiltroPorCostoMayor extends Filtro {

	private double costo;
	
	public FiltroPorCostoMayor(double costo) {
		this.costo = costo;
	}

	@Override
	public boolean cumple(Paquete paquete) {
		return paquete.getCosto() > costo;
	}
}