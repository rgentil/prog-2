package Entidades;

import java.util.ArrayList;
import java.util.List;

/*
	Cada tema musical tiene un título, un idioma, una lista de géneros musicales a los que pertenece y una
	lista de instrumentos musicales necesarios para interpretarlo durante el concurso (puede ser vacía). 
*/
public class TemaMusical {
	
	private String titulo, idioma;
	private List<String> generosMusicales, instrumentosNecesarios;
	
	public TemaMusical(String titulo, String idioma) {
		this.titulo = titulo;
		this.idioma = idioma;
		this.generosMusicales = new ArrayList<String>();
		this.instrumentosNecesarios = new ArrayList<String>();
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
