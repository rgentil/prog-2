package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Filtros.Filtro;
import Filtros.FiltroPositivo;

public class Coach {

	private String nombre, apellido;
	private List<ElementoEquipo> equipos;
//	Comportamiento dinámico del coach Patron Strategy
	private Filtro requisitoIngreso;
	
	public Coach(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.equipos = new ArrayList<ElementoEquipo>(); 
		this.requisitoIngreso = new FiltroPositivo();
	}

	public boolean addParticipante(ElementoEquipo nuevo) {
		if (nuevo != null && this.requisitoIngreso.cumple(nuevo)) {
			return equipos.add(nuevo);
		}
		return false;
	}
	
	public void setRequisitoIngreso(Filtro nuevoRequisitoIngreso) {
		this.requisitoIngreso = nuevoRequisitoIngreso;
	}
	
//	● Listado de todos los instrumentos que pueden tocar los participantes de su equipo (no debe haber repetidos)
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
	
//	● Listado de todos los idiomas que pueden cantar los participantes de su equipo (sin idiomas repetidos)
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
	
//	● Listado de géneros de preferencia de los participantes de su equipo (sin repetidos y ordenados alfabéticamente)
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
	
//	● El promedio de edad de su equipo
	public double getPromedioEdad() {
		double resultado = 0;
		if (!this.equipos.isEmpty()) {
			for (ElementoEquipo equipo : equipos) {
				//Es el promedio del promedio
				resultado += equipo.getEdad();
			}
			if (resultado != 0) {
				return resultado / this.equipos.size(); 
			}
		}
		return resultado;
	}
//	● Canten en un determinado idioma, por ejemplo “inglés”
//	● Prefieren un determinado género, por ejemplo “rock”.
//	● Canten en un determinado idioma y toquen un instrumento específico. Por ejemplo, “Aleman”	y “Guitarra”
//	● Todos los participantes mayores de una determinada edad.
//	● Puedan Interpretar un determinado Tema Musical
//	● Los anteriores son algunos ejemplos de los listados que la producción le pide
//	constantemente a los jurados. Se pueden agregar nuevos requerimientos de búsquedas así
//	como combinación lógicas de los existentes.
	public List<ElementoEquipo> buscarParticipantes(Filtro criterio){
		List<ElementoEquipo> resultado = new ArrayList<ElementoEquipo>();
		for (ElementoEquipo equipo : equipos) {
			if (criterio.cumple(equipo)) {
				resultado.add(equipo);
			}
		}
		return resultado;
	}
	
//	Como los jurados no quieren perder una desean poder contar con un mecanismo que les permita
//	dada la forma actual que se va a utilizar para determinar el ganador de una batalla, obtener un listado
//	de sus participantes ordenado de forma tal que los primeros miembros del listado sean los que les
//	ganen o empaten con los siguientes miembros (siempre dentro del mismo equipo del juez).
	public List<ElementoEquipo> getParticipantePorReglaBatalla(Comparator<ElementoEquipo> reglaBatalla){
		List<ElementoEquipo> resultado = new ArrayList<ElementoEquipo>(equipos);
		Collections.sort(resultado, reglaBatalla);
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
		return "\nCoach " + nombre + " " + apellido + "\nEquipos\n" + equipos + "\n";
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
	
	public String getNombreYApellido() {
		return nombre + " " + apellido;
	}

}
