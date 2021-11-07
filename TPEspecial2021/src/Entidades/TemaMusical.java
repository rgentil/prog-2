package Entidades;

import java.util.ArrayList;
import java.util.List;

public class TemaMusical {
	
	private String titulo, idioma;
	private List<String> generosMusicales, instrumentosNecesarios;
	
	public TemaMusical(String titulo, String idioma) {
		this.titulo = titulo;
		this.idioma = idioma;
		this.generosMusicales = new ArrayList<String>();
		this.instrumentosNecesarios = new ArrayList<String>();
	}
	
	private boolean tieneGenero(String genero) {
		return this.generosMusicales.contains(genero);
	}
	
	public void addGeneroMusical(String genero) {
		if (!tieneGenero(genero)) {
			this.generosMusicales.add(genero);
		}
	}
	
	private boolean tieneInstrumento(String instrumento) {
		return this.instrumentosNecesarios.contains(instrumento);
	}
	
	public void addInstrumento(String instrumento) {
		if (!tieneInstrumento(instrumento)) {
			this.instrumentosNecesarios.add(instrumento);
		}
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

}
