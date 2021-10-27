package CalculoCostoPoliza;

import Aseguradora.Seguro;

public class PorcentajeDelValor extends CalculoCostoPoliza{

	private double porcentaje;
	
	public PorcentajeDelValor(double porcentaje) {
		super();
		this.porcentaje = porcentaje;
	}

	@Override
	public double caluclarCosto(Seguro s) {
		return s.getMontoPoliza() * porcentaje; 
	}


}
