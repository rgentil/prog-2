package Criterios;

import Vivero.Planta;

public class CriterioPorNombreVulgar extends CriterioString {

	public CriterioPorNombreVulgar(String filtro) {
		super(filtro);
	}

	@Override
	public boolean cumple(Planta p) {
		return p.contieneNombreVulgar(super.getFiltro());
	}

}
