package Entidades;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/*
	De los participantes, se registra su
		nombre, apellido, edad, géneros musicales de preferencia, idiomas en los que
		canta y los instrumentos que toca. 
  
*/
public class Participante {

	private String nombre, apellido;
	private int edad;
	private List<String> generosPreferencia, idiomasCanta, instrumentosToca;
	
	public Participante(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.generosPreferencia = new ArrayList<String>();
		this.idiomasCanta = new ArrayList<String>();
		this.instrumentosToca = new ArrayList<String>();		
	}
	
	public boolean noTieneInstrumento(String instrumento) {
		return this.instrumentosToca.contains(instrumento);
	}
	
	public void addInstrumento(String instrumento) {
		if (!noTieneInstrumento(instrumento)) {
			this.instrumentosToca.add(instrumento);
		}
	}
	
	public List<String> getInstrumentos() {
		return new ArrayList<String>(this.instrumentosToca);
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Participante p = (Participante) o;
			return this.getApellido().equals(p.getApellido()) && this.getNombre().equals(p.getNombre()) && this.getEdad() == p.getEdad();	
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "\nParticipante [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", generosPreferencia="
				+ generosPreferencia + ", idiomasCanta=" + idiomasCanta + ", instrumentosToca=" + instrumentosToca
				+ "]";
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
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
