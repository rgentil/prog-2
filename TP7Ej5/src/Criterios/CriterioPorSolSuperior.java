package Criterios;

import Vivero.Planta;

public class CriterioPorSolSuperior extends CriterioInteger{

	public CriterioPorSolSuperior(int filtro) {
		super(filtro);
	}

	@Override
	public boolean cumple(Planta p) {
		return p.getSol() > super.getFiltro();
	}

}
