package Filtros;

import Aseguradora.SeguroSimple;

public class FiltroPorMontoSuperior extends Filtro{

	private double filtro;
	
	public FiltroPorMontoSuperior(double filtro) {
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(SeguroSimple s) {
		return s.getMontoAsegurado() > filtro; 
	}

	
	
}
