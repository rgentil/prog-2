package Comparadores;

import java.time.LocalDate;

import Principal.Vendedor;

public class ComparadorPorCantidadProductosVendidos extends Comparador{

	public ComparadorPorCantidadProductosVendidos(LocalDate desde, LocalDate hasta) {
		super(hasta, hasta);
	}

	public int compare(Vendedor vendedor1, Vendedor vendedor2) {
		return Integer.compare(vendedor1.getCantidadProductosVendidosPeriodo(super.getDesde(), super.getHasta()), vendedor2.getCantidadProductosVendidosPeriodo(super.getDesde(), super.getHasta()));
	}
	

}
