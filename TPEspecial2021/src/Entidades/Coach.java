package Entidades;

import java.util.List;

import Comportamientos.ComportamientoCoach;
import Comportamientos.ComportamientoRegular;
import Filtros.Filtro;
import Participantes.ElementoEquipo;
import Participantes.Participantes;

public class Coach {

	private String nombre, apellido;
	private Participantes participantes;
	//Comportamiento dinámico del coach Patron Strategy
	private ComportamientoCoach comportamiento;
	
	public Coach(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.participantes = new Participantes();
		this.comportamiento = new ComportamientoRegular();
	}

	public void addParticipante(ElementoEquipo nuevo) {
		if (this.comportamiento.cumple(nuevo)) {
			participantes.addParticipante(nuevo);
		}
	}
	
	public void setComportamiento(ComportamientoCoach nuevoComportamiento) {
		this.comportamiento = nuevoComportamiento;
	}
	
	//● Listado de todos los instrumentos que pueden tocar los participantes de su equipo (no debe haber repetidos)
	public List<String> getIntrumentos(){
		return participantes.getIntrumentos();
	}
	
	//● Listado de todos los idiomas que pueden cantar los participantes de su equipo (sin idiomas repetidos)
	public List<String> getIdiomas(){
		return participantes.getIdiomas();
	}
	
	//● Listado de géneros de preferencia de los participantes de su equipo (sin repetidos y ordenados alfabéticamente)
	public List<String> getGeneros(){
		return participantes.getGeneros();
	}
	
	//● El promedio de edad de su equipo
	public double getPromedioEdad() {
		return participantes.getPromedioEdad();
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
		return participantes.buscar(criterio);
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
		return "\nCoach [nombre=" + nombre + ", apellido=" + apellido + ", participantes=" + participantes + "]";
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
