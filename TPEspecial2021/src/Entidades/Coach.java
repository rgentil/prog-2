package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Coach {

	private String nombre, apellido;
	private List<Participante> participantes;
	
	public Coach(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.participantes = new ArrayList<Participante>();
	}
	
	public boolean tieneParticipante(Participante p) {
		return participantes.contains(p);
	}
	
	public void addParticipante(Participante p) {
		if(!tieneParticipante(p)) {
			participantes.add(p);
		}
	}
	//un listado de todos los instrumentos que pueden tocar los participantes de su equipo (no debe haber repetidos)
	public List<String> getTotalInstrumentos(){
		List<String> resultado = new ArrayList<String>();
		for (Participante participante : participantes) {
			resultado.addAll(participante.getInstrumentos());
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
