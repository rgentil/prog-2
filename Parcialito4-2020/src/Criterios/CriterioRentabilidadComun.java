package Criterios;

import Plataforma.Pelicula;

public class CriterioRentabilidadComun extends Criterio{

	public CriterioRentabilidadComun() {
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		return true;
	}

}
