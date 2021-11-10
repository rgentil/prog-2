package Participantes;

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
	public int getTotalIntegrantesParticipantes() {
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
	public int getTotalGeneros() {
		return this.getGeneros().size();
	}

	@Override
	public int getTotalIdiomas() {
		return this.getIdiomas().size();
	}

	@Override
	public int getTotalInstrumentos() {
		return this.getInstrumentos().size();
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
	
	@Override
	public int getTotalDeInstrumentosRequeridosConocen(List<String> instrumentosNecesarios) {
		int resultado = 0;
		for (String instrumento : instrumentosNecesarios) {
			if (this.tocaInstrumento(instrumento))
				resultado += 1;
		}
		return resultado;
	}
	
	@Override
	public void addParticipante(ElementoEquipo nuevo) {}
	
	@Override
	public boolean tieneGenero(String genero) {
		return this.generosPreferencia.contains(genero);
	}
	
	public void addGeneroPreferencia(String genero) {
		if (!tieneGenero(genero)) {
			this.generosPreferencia.add(genero);
		}
	}
	
	@Override
	public boolean tocaInstrumento(String instrumento) {
		return this.instrumentosToca.contains(instrumento);
	}
	
	public void addInstrumento(String instrumento) {
		if (!tocaInstrumento(instrumento)) {
			this.instrumentosToca.add(instrumento);
		}
	}
	
	@Override
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
			Solista p = (Solista) o;
			return this.getApellido().equals(p.getApellido()) && this.getNombre().equals(p.getNombre()) && this.getEdad() == p.getEdad();	
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "\nSolista [nombre=" + this.getNombre() + ", apellido=" + apellido + ", edad=" + edad + ", generosPreferencia="
				+ generosPreferencia + ", idiomasCanta=" + idiomasCanta + ", instrumentosToca=" + instrumentosToca
				+ "]";
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


}
