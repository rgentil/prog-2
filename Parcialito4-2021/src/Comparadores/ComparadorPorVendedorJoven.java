package Comparadores;

import java.time.LocalDate;

import Principal.Vendedor;

public class ComparadorPorVendedorJoven extends Comparador{

	public ComparadorPorVendedorJoven(LocalDate desde, LocalDate hasta) {
		super(desde,hasta);
	}
		
	public int compare(Vendedor vendedor1, Vendedor vendedor2) {
		return Double.compare(vendedor1.getPonderacion(super.getDesde(), super.getHasta()), vendedor2.getPonderacion(super.getDesde(), super.getHasta()));
	}
	

}
