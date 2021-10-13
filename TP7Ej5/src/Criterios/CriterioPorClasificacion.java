package Criterios;

import Vivero.Planta;

public class CriterioPorClasificacion extends CriterioString {

	public CriterioPorClasificacion(String filtro) {
		super(filtro);
	}

	@Override
	public boolean cumple(Planta p) {
		return (p.getClasificacionSuperior().toUpperCase()).equals(super.getFiltro());
	}

}
