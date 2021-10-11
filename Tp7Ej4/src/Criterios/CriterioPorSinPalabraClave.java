package Criterios;

import Documentador.Documento;

public class CriterioPorSinPalabraClave extends Criterio {

	public CriterioPorSinPalabraClave() {
	}

	@Override
	public boolean cumple(Documento d1) {
		return d1.getPalabrasClave().isEmpty();
	}

}
