package Comparadores;

import java.time.LocalDate;

import Principal.Vendedor;

public class ComparadorPorRatioDeVentas extends Comparador{

	public ComparadorPorRatioDeVentas(LocalDate desde, LocalDate hasta) {
		super(desde,hasta);
	}
	
	public int compare(Vendedor vendedor1, Vendedor vendedor2) {
		return Double.compare(vendedor1.getRatioVentas(super.getDesde(), super.getHasta()), vendedor2.getRatioVentas(super.getDesde(), super.getHasta()));
	}
	

}
