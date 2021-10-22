package Criterios;

import java.time.LocalDate;

import Principal.Vendedor;

public class CriterioPorCantVentasPorPeriodo extends Criterio{
	
	private int cantVentas;
	private LocalDate desde;
	private LocalDate hasta;
	
	
	public CriterioPorCantVentasPorPeriodo(int cantVentas, LocalDate desde, LocalDate hasta) {
		super();
		this.cantVentas = cantVentas;
		this.desde = desde;
		this.hasta = hasta;
	}

	public boolean cumple(Vendedor vendedor) {
		return cantVentas < vendedor.getCantidadVentasPeriodo(desde, hasta);
 	}
	
		
}
