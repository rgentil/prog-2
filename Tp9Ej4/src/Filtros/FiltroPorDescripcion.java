package Filtros;

import Aseguradora.SeguroSimple;

public class FiltroPorDescripcion extends Filtro{

	private String filtro;
	
	public FiltroPorDescripcion(String filtro) {
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(SeguroSimple s) {
		return s.getDescripcion().contains(filtro); 
	}

	
	
}
