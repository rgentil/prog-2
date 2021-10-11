package main;

import java.time.LocalDate;

import cuerpotecnico.CuerpoTecnico;
import cuerpotecnico.Entrenador;
import cuerpotecnico.EstadoPersona;

public class MainCuerpoTecnico {

	public static void main(String[] args) {

		CuerpoTecnico e = new Entrenador("Pepe","Garcia",2, LocalDate.of(1982,12,21));
		
		e.setEstado(EstadoPersona.VIAJANDO);
		
		System.out.println(e.disponible());

	}

}
