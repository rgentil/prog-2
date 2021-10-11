package Criterios;

import java.util.List;

import Documentador.Documento;

public class CriterioPorPalabraClave extends Criterio {

	private String filtro;
	
	public CriterioPorPalabraClave(String filtro) {
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(Documento d1) {
		List<String> pc = d1.getPalabrasClave();
		for (String p : pc) {
			if ((p.toUpperCase()).equals(filtro))
				return true;
		}
		return false;
	}

}
