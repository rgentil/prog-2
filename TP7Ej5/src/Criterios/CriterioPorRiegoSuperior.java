package Criterios;

import Vivero.Planta;

public class CriterioPorRiegoSuperior extends CriterioInteger{

	public CriterioPorRiegoSuperior(int filtro) {
		super(filtro);
	}

	@Override
	public boolean cumple(Planta p) {
		return p.getRiego() > super.getFiltro();
	}

}
