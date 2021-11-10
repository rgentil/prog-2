package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Comportamientos.ComportamientoCoach;
import Comportamientos.ComportamientoRegular;
import Filtros.Filtro;
import Participantes.ElementoEquipo;

public class Coach {

	private String nombre, apellido;
	private List<ElementoEquipo> equipos;
	//Comportamiento dinámico del coach Patron Strategy
	private ComportamientoCoach comportamiento;
	
	public Coach(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.equipos = new ArrayList<ElementoEquipo>(); 
		this.comportamiento = new ComportamientoRegular();
	}

	public boolean addParticipante(ElementoEquipo nuevo) {
		if (nuevo != null) {
			if (this.comportamiento.cumple(nuevo)) {
				equipos.add(nuevo);
				return true;
			}
		}
		return false;
	}
	
	public void setComportamiento(ComportamientoCoach nuevoComportamiento) {
		this.comportamiento = nuevoComportamiento;
	}
	
	//● Listado de todos los instrumentos que pueden tocar los participantes de su equipo (no debe haber repetidos)
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
	
	//● Listado de todos los idiomas que pueden cantar los participantes de su equipo (sin idiomas repetidos)
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
	
	//● Listado de géneros de preferencia de los participantes de su equipo (sin repetidos y ordenados alfabéticamente)
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
	
	private boolean vacio() {
		return equipos.isEmpty();
	}
	
	private int totalEquipos() {
		return equipos.size();
	}
	
	//● El promedio de edad de su equipo
	public double getPromedioEdad() {
		double resultado = 0;
		if (!this.vacio()) {
			for (ElementoEquipo equipo : equipos) {
				//resultado =+ equipo.getPromedioEdad();
				//Es el promedio del promedio
				resultado =+ equipo.getEdad();
			}
			if (resultado != 0) {
				return resultado / this.totalEquipos(); 
			}
		}
		return resultado;
	}
	/*
	● Canten en un determinado idioma, por ejemplo “inglés”
	● Prefieren un determinado género, por ejemplo “rock”.
	● Canten en un determinado idioma y toquen un instrumento específico. Por ejemplo, “Aleman”	y “Guitarra”
	● Todos los participantes mayores de una determinada edad.
	● Puedan Interpretar un determinado Tema Musical
	● Los anteriores son algunos ejemplos de los listados que la producción le pide
	constantemente a los jurados. Se pueden agregar nuevos requerimientos de búsquedas así
	como combinación lógicas de los existentes.
	*/
	public List<ElementoEquipo> buscarParticipantes(Filtro criterio){
		List<ElementoEquipo> resultado = new ArrayList<ElementoEquipo>();
		for (ElementoEquipo equipo : equipos) {
			if (criterio.cumple(equipo)) {
				resultado.add(equipo);
			}
		}
		return resultado;
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Coach c = (Coach) o;
			return this.getApellido().equals(c.getApellido()) && this.getNombre().equals(c.getNombre());
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "\nCoach [nombre=" + nombre + ", apellido=" + apellido + ", equipos=" + equipos + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	

}
