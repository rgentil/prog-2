package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Filtros.Filtro;
/*
● un listado de todos los instrumentos que pueden tocar los participantes de su equipo (no
debe haber repetidos)
● un listado de todos los idiomas que pueden cantar los participantes de su equipo (sin idiomas
repetidos)
● un listado de géneros de preferencia de los participantes de su equipo (sin repetidos y
ordenados alfabéticamente)
● El promedio de edad de su equipo 
 */
public class Participantes {
	private List<Participante> participantes;
	
	public Participantes() {
		this.participantes = new ArrayList<Participante>();
	}
	
	public int getTotalParticipante() {
		return participantes.size();
	}
	
	public boolean tieneParticipante(Participante p) {
		return participantes.contains(p);
	}
	
	public void addParticipante(Participante p) {
		if (p != null) {
			if(!tieneParticipante(p)) {
				participantes.add(p);
			}
		}
	}
	
	public List<String> getTotalInstrumentos(){
		List<String> resultado = new ArrayList<String>();
		for (Participante p : participantes) {
			List<String> instrumentos = p.getInstrumentos();
			for(String ins : instrumentos) {
				if (!resultado.contains(ins)) {
					resultado.add(ins);
				}
			}
		}
		return resultado;
	}

	public List<String> getIdiomas(){
		List<String> resultado = new ArrayList<String>();
		for (Participante p : participantes) {
			List<String> idiomas = p.getIdiomas();
			for(String idioma : idiomas) {
				if (!resultado.contains(idioma)) {
					resultado.add(idioma);
				}
			}
		}
		return resultado;
	}
	
	public List<String> getGeneros(){
		List<String> resultado = new ArrayList<String>();
		for (Participante p : participantes) {
			List<String> generos = p.getGeneros();
			for(String genero : generos) {
				if (!resultado.contains(genero)) {
					resultado.add(genero);
				}
			}
		}
		
		Collections.sort(resultado);
		
		return resultado;
	}

	public double getPromedioEdad() {
		double promedio = 0;
		if (participantes.isEmpty()) {
			return 0;
		}else {
			int totalDeEdad = 0;
			for (Participante p : participantes) {
				totalDeEdad += p.getEdad();
			}	
			promedio = totalDeEdad / this.getTotalParticipante();
		}
		return promedio;
	}

	public List<Participante> buscar(Filtro criterio) {
		List<Participante> resultado = new ArrayList<Participante>();
		for (Participante p : participantes) {
			if (criterio.cumple(p)) {
				resultado.add(p);
			}			
		}
		return resultado;
	}


}
