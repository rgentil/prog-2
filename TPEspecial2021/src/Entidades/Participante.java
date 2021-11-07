package Entidades;

import java.util.ArrayList;
import java.util.List;

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
	
	public boolean tocaInstrumento(String instrumento) {
		return this.instrumentosToca.contains(instrumento);
	}
	
	public void addInstrumento(String instrumento) {
		if (!tocaInstrumento(instrumento)) {
			this.instrumentosToca.add(instrumento);
		}
	}
	
	public List<String> getInstrumentos() {
		return new ArrayList<String>(this.instrumentosToca);
	}
	
	public List<String> getIdiomas() {
		return new ArrayList<String>(this.idiomasCanta);
	}
	
	public List<String> getGeneros() {
		return new ArrayList<String>(this.generosPreferencia);
	}
	
	public boolean tieneGenero(String genero) {
		return this.generosPreferencia.contains(genero);
	}
	
	public void addGeneroPreferencia(String genero) {
		if (!tieneGenero(genero)) {
			this.generosPreferencia.add(genero);
		}
	}
	
	public boolean sabeIdioma(String idioma) {
		return this.idiomasCanta.contains(idioma);
	}
	
	public void addIdioma(String idioma) {
		if (!sabeIdioma(idioma)) {
			this.idiomasCanta.add(idioma);
		}
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
