package Entidades;

import java.util.ArrayList;
import java.util.List;

import Filtros.Filtro;

public class Solista extends ElementoEquipo {

	private int edad;
	private String apellido;
	private List<String> generosPreferencia, idiomasCanta, instrumentosToca;
	
	public Solista(String nombre, String apellido, int edad) {
		super(nombre);
		this.apellido = apellido;
		this.edad = edad;
		this.generosPreferencia = new ArrayList<String>();
		this.idiomasCanta = new ArrayList<String>();
		this.instrumentosToca = new ArrayList<String>();
	}
	
	@Override
	public int getEdad() {
		return this.edad;
	}
	
	@Override
	public int getTotalIntegrantes() {
		return 1;
	}
	
	@Override
	public List<String> getGeneros() {
		return new ArrayList<String>(this.generosPreferencia);
	}
	
	@Override
	public List<String> getIdiomas() {
		return new ArrayList<String>(this.idiomasCanta);
	}
	
	@Override
	public List<String> getInstrumentos() {
		return new ArrayList<String>(this.instrumentosToca);
	}
	
	@Override
	public List<ElementoEquipo> buscar(Filtro filtro) {
		List<ElementoEquipo> resultado = new ArrayList<ElementoEquipo>();
		if (filtro.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}
	
	@Override
	public ElementoEquipo getCopiaEstructura() {
		Solista solista = new Solista(this.getNombre(), this.getApellido(), this.getEdad());
		List<String> instrumentos = this.getInstrumentos();
		for (String instrumento : instrumentos) {
			solista.addInstrumento(instrumento);
		}
		List<String> idiomas = this.getIdiomas();
		for (String idioma : idiomas) {
			solista.addInstrumento(idioma);
		}
		List<String> generos = this.getGeneros();
		for (String genero : generos) {
			solista.addInstrumento(genero);
		}
		return solista;
	}
	
	public void addGeneroPreferencia(String genero) {
		this.generosPreferencia.add(genero);
	}
	
	public void addInstrumento(String instrumento) {
		this.instrumentosToca.add(instrumento);
	}
	
	public void addIdioma(String idioma) {
		this.idiomasCanta.add(idioma);
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Solista p = (Solista) o;
			return this.getApellido().equals(p.getApellido()) && this.getNombre().equals(p.getNombre()) && this.getEdad() == p.getEdad();	
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "\nMúsico=" + this.getNombre() + " " + apellido + ", " + edad + " \n Géneros="
				+ generosPreferencia + "\n Idiomas=" + idiomasCanta + "\nInstrumentos=" + instrumentosToca;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public int cantParticipantesQueTocanElInstrumento(String instrumento) {
		if (this.instrumentosToca.contains(instrumento)) {
			return 1;
		}else {
			return 0;
		}
	}


}
