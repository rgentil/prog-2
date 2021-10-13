package Criterios;

import Vivero.Planta;

public class CriterioPorNombre extends CriterioString{

	public CriterioPorNombre(String filtro) {
		super(filtro);
	}

	@Override
	public boolean cumple(Planta p) {
		return (p.getNombreCientifico().toUpperCase()).contains(super.getFiltro());
	}

}
