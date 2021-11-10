package Participantes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Filtros.Filtro;

public class Participantes {
	
	private List<ElementoEquipo> equipos;
	
	public Participantes() {
		this.equipos = new ArrayList<ElementoEquipo>(); 
	}

	public void addParticipante(ElementoEquipo nuevo) {
		if (nuevo != null) {
			equipos.add(nuevo);
		}
	}
	
	public List<String> getIntrumentos(){
		List<String> resultado = new ArrayList<String>();
		for (ElementoEquipo equipo : equipos) {
			List<String> instrumentos = equipo.getInstrumentos();
			for (String instrumento : instrumentos) {
				if (!resultado.contains(instrumento)) {
					resultado.add(instrumento);
				}
			}
		}
		return resultado;
	}
	
	public List<String> getIdiomas(){
		List<String> resultado = new ArrayList<String>();
		for (ElementoEquipo equipo : equipos) {
			List<String> idiomas = equipo.getIdiomas();
			for (String idioma : idiomas) {
				if (!resultado.contains(idioma)) {
					resultado.add(idioma);
				}
			}
		}
		return resultado;
	}
	
	public List<String> getGeneros(){
		List<String> resultado = new ArrayList<String>();
		for (ElementoEquipo equipo : equipos) {
			List<String> generos = equipo.getGeneros();
			for (String genero : generos) {
				if (!resultado.contains(genero)) {
					resultado.add(genero);
				}
			}
		}
		
		if (!resultado.isEmpty()) {//Ordenado
			Collections.sort(resultado);
		}
		
		return resultado;
	}

	public double getPromedioEdad() {
		double resultado = 0;
		if (!this.vacio()) {
			for (ElementoEquipo equipo : equipos) {
				//resultado =+ equipo.getPromedioEdad();
				resultado =+ equipo.getEdad();
			}
			if (resultado != 0) {
				return resultado / this.totalEquipos(); 
			}
		}
		return resultado;
	}
	
	private boolean vacio() {
		return equipos.isEmpty();
	}
	
	private int totalEquipos() {
		return equipos.size();
	}

	public List<ElementoEquipo> buscar(Filtro criterio) {
		List<ElementoEquipo> resultado = new ArrayList<ElementoEquipo>();
		for (ElementoEquipo equipo : equipos) {
			if (criterio.cumple(equipo)) {
				resultado.add(equipo);
			}
		}
		return resultado;
	}

}
