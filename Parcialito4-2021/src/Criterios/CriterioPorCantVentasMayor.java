package Criterios;

import Principal.Vendedor;

public class CriterioPorCantVentasMayor extends Criterio{
	
	private int cantVentas;
	
	public CriterioPorCantVentasMayor(int cantVentas) {
		this.cantVentas = cantVentas;
	}

	public boolean cumple(Vendedor vendedor) {
		return cantVentas < vendedor.getCantidadTotalDeVentas();
 	}	
		
}
