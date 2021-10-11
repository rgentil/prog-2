package Criterio;

import Diccionario.Palabra;

public class CriterioPalabraEntre extends Criterio {

	private Criterio criterioPalabraMayor;
	private Criterio criterioPalabraMenor;
	
	public CriterioPalabraEntre(Palabra desde, Palabra hasta) {
		criterioPalabraMayor = new CriterioPalabraMayor(desde);
		criterioPalabraMenor = new CriterioPalabraMenor(hasta);
	}
	
	@Override
	public boolean cumple(Palabra p) {
		return criterioPalabraMayor.cumple(p) && criterioPalabraMenor.cumple(p);
	}
	

}
