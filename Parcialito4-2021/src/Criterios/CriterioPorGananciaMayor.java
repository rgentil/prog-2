package Criterios;

import Principal.Vendedor;

public class CriterioPorGananciaMayor extends Criterio{
	
	private double ganancia;
	
	public CriterioPorGananciaMayor(double ganancia) {
		super();
		this.ganancia = ganancia;
	}

	public boolean cumple(Vendedor vendedor) {
		return vendedor.getGananciaTotal() > ganancia;
 	}
	
		
}
