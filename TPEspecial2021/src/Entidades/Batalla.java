package Entidades;

import CondicionesDeBatalla.CondicionBatallaPersonal;
import Participantes.ElementoEquipo;

public class Batalla {

	private ElementoEquipo equipo1;
	private ElementoEquipo equipo2;
	private CondicionBatalla condicionBatalla;
	
	public Batalla(ElementoEquipo equipo1, ElementoEquipo equipo2, CondicionBatallaPersonal condicionPersonal) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.condicionPersonal = condicionPersonal;
	}
	
	public int CompetirPersonal() {
		return condicionPersonal.resultado();
	}

	public ElementoEquipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(ElementoEquipo equipo1) {
		this.equipo1 = equipo1;
	}

	public ElementoEquipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(ElementoEquipo equipo2) {
		this.equipo2 = equipo2;
	}

	public CondicionBatallaPersonal getCondicionPersonal() {
		return condicionPersonal;
	}

	public void setCondicionPersonal(CondicionBatallaPersonal condicionPersonal) {
		this.condicionPersonal = condicionPersonal;
	}	
	
}
