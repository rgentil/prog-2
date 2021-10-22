package Comparadores;

import java.time.LocalDate;

import Principal.Vendedor;

public class ComparadorPorCantidadVentasEnPeriodo extends Comparador{

	public ComparadorPorCantidadVentasEnPeriodo(LocalDate desde, LocalDate hasta) {
		super(desde,hasta);
	}

	public int compare(Vendedor vendedor1, Vendedor vendedor2) {
		return Integer.compare(vendedor1.getCantidadVentasPeriodo(super.getDesde(), super.getHasta()), vendedor2.getCantidadVentasPeriodo(super.getDesde(), super.getHasta()));
	}
	

}
