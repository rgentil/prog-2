package Criterios;

import java.time.LocalDate;

import Principal.Vendedor;

public class CriterioPorEnPeriodo extends Criterio{
	
	private LocalDate desde;
	private LocalDate hasta;
	
	
	public CriterioPorEnPeriodo(LocalDate desde, LocalDate hasta) {
		super();
		this.desde = desde;
		this.hasta = hasta;
	}

	public boolean cumple(Vendedor vendedor) {
		return vendedor.realizoVentaEnPeriodo(desde, hasta);
 	}
	
		
}
