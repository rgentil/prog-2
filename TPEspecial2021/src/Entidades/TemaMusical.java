package Entidades;

import java.util.ArrayList;
import java.util.List;

import Filtros.Filtro;
import Filtros.FiltroPositivo;

public class TemaMusical {
	
	private String titulo, idioma;
	private List<String> generosMusicales, instrumentosNecesarios;
	private Filtro condicionesDeInterpretacion;
	
	public TemaMusical(String titulo, String idioma) {
		this.titulo = titulo;
		this.idioma = idioma;
		this.generosMusicales = new ArrayList<String>();
		this.instrumentosNecesarios = new ArrayList<String>();
		this.condicionesDeInterpretacion = new FiltroPositivo();
		
	}
	
	public boolean puedeInterpretarse(ElementoEquipo participante) {
//		Filtro cantaIdioma = new FiltroParticipantePorIdioma(this.getIdioma());
//		Filtro genero = new FiltroParticipantePorGeneroLista(this.getGenerosMusicales());
//		return cantaIdioma.cumple(participante) && genero.cumple(participante);
		return condicionesDeInterpretacion.cumple(participante);
	}
	
	public void addGeneroMusical(String genero) {
		this.generosMusicales.add(genero);
	}
	
	public void addInstrumento(String instrumento) {
		this.instrumentosNecesarios.add(instrumento);
	}
	
	public List<String> getGenerosMusicales() {
		return new ArrayList<String>(this.generosMusicales);
	}
	
	public List<String> getInstrumentosNecesarios() {
		return new ArrayList<String>(this.instrumentosNecesarios);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	@Override
	public String toString() {
		return "Tema Musical " + titulo + "\n" ;
	}
	
	

}
