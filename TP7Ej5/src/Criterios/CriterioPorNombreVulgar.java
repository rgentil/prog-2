package Criterios;

import Vivero.Planta;

public class CriterioPorNombreVulgar extends CriterioString {

	public CriterioPorNombreVulgar(String filtro) {
		super(filtro);
	}

	@Override
	public boolean cumple(Planta p) {
		for (String nombre : p.getNombreVulgares()) {
			if ((nombre.toUpperCase()).contains(super.getFiltro())){
				return true;
			}
		}
		return false;
	}

}
