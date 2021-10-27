package Filtros;

import Aseguradora.SeguroSimple;

public class FiltroPorDNI extends Filtro{

	private String filtro;
	
	public FiltroPorDNI(String filtro) {
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(SeguroSimple s) {
		return s.getDni().equals(filtro); 
	}	
	
}
