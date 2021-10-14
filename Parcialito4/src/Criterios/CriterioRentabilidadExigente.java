package Criterios;

import Plataforma.Pelicula;

public class CriterioRentabilidadExigente extends Criterio {

	//● Películas cuya duración sea menor a 120 minutos, que no sean del género “comedia”.
	@Override
	public boolean cumple(Pelicula p) {
		Criterio c1  = new CriterioPorDuracionMenor(120);
		Criterio c2  = new CriterioPorGenero("comedia");
		Criterio criterio = new CriterioAND(c1,c2); 
		return criterio.cumple(p) ;
	}	

}
