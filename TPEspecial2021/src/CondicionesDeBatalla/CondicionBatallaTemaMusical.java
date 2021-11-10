package CondicionesDeBatalla;

import Entidades.TemaMusical;
import Participantes.ElementoEquipo;

public abstract class CondicionBatallaTemaMusical {
	
	private ElementoEquipo equipo1;
	private ElementoEquipo equipo2;
	private TemaMusical temaMusical;
	
	public CondicionBatallaTemaMusical(ElementoEquipo equipo1, ElementoEquipo equipo2, TemaMusical temaMusical) {
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.temaMusical = temaMusical;
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

	public TemaMusical getTemaMusical() {
		return temaMusical;
	}

	public void setTemaMusical(TemaMusical temaMusical) {
		this.temaMusical = temaMusical;
	}	
	
}
