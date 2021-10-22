package Criterios;

import Plataforma.Pelicula;

public class CriterioRentabilidadMasExigente extends Criterio {

	//●Películas posteriores del 2017, a no ser que se trate de películas del género “infantil” o “documental”.
	@Override
	public boolean cumple(Pelicula p) {
		Criterio c1  = new CriterioNOT(new CriterioPorAnioEstrenoMenor(2017));
		
		Criterio c2  = new CriterioOR( new CriterioPorGenero("infantil" ), new CriterioPorGenero("documental") ) ;
		
		Criterio c3  = new CriterioOR( c1, c2);
		
		return c3.cumple(p) ;
	}	

}
