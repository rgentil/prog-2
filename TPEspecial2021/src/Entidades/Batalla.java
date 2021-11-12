package Entidades;

import java.util.Comparator;

public class Batalla {

	private Comparator<ElementoEquipo> reglasDeBatalla;
	
	public Batalla(Comparator<ElementoEquipo> reglasDeBatalla) {
		this.reglasDeBatalla = reglasDeBatalla;
	}
	
	public void setReglasDeBatalla(Comparator<ElementoEquipo> reglasDeBatalla) {
		this.reglasDeBatalla = reglasDeBatalla;
	}
	
	public ElementoEquipo getGanador(ElementoEquipo participante1, ElementoEquipo participante2) {
		int resultado = reglasDeBatalla.compare(participante1, participante2);
		if (resultado > 0)
			return participante1;
		if (resultado < 0) 
			return participante2;
		return null;//empate
	}
	
}
