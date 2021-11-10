package CondicionesDeBatalla;

import Participantes.ElementoEquipo;

public abstract class CondicionBatallaPersonal {
	
	private ElementoEquipo equipo1;
	private ElementoEquipo equipo2;
	
	public CondicionBatallaPersonal() {}
	
	public CondicionBatallaPersonal(ElementoEquipo equipo1, ElementoEquipo equipo2) {
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
	}
		
	public abstract int resultado();

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
	
}
