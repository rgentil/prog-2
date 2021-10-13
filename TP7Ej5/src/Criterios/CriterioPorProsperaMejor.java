package Criterios;

import Vivero.Planta;

public class CriterioPorProsperaMejor extends CriterioString{

	public CriterioPorProsperaMejor(String filtro) {
		super(filtro);
	}

	@Override
	public boolean cumple(Planta p) {
		return p.getProsperaMejor().equalsIgnoreCase(super.getFiltro());
	}

}
