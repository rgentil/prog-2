package Comparadores;

import java.time.LocalDate;

import Principal.Vendedor;

public class ComparadorPorGananciaTotalVentasEnPeriodo extends Comparador{

	public ComparadorPorGananciaTotalVentasEnPeriodo(LocalDate desde, LocalDate hasta) {
		super(desde,hasta);
	}

	public int compare(Vendedor vendedor1, Vendedor vendedor2) {
		return Double.compare(vendedor1.getGananciaTotalEnPeriodo(super.getDesde(), super.getHasta()), vendedor2.getGananciaTotalEnPeriodo(super.getDesde(), super.getHasta()));
	}
	

}
