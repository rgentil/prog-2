package Plataforma;

import java.util.ArrayList;
import java.util.List;

public class Pelicula implements Comparable<Pelicula>{
	
	private String titulo;
	private String sinopsis;
	private List<String> generos;
	private String director;
	private List<String> actores;
	private int anioEstreno;
	private int duracion;
	
	public Pelicula(String titulo, String sinopsis, String director, int anioEstreno, int duracion) {
		super();
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.director = director;
		this.anioEstreno = anioEstreno;
		this.duracion = duracion;
		this.generos = new ArrayList<>();
		this.actores = new ArrayList<>();
	}
	
	public boolean tieneGenero(String genero) {
		return this.generos.contains(genero);
	}
	
	public boolean tieneGeneroEquals(String g) {
		for (String genero : this.generos) {
			if (genero.equalsIgnoreCase(g))
				return true;
		}
		return false;
	}
	
	public void addGenero(String genero) {
		if (!tieneGenero(genero)) {
			this.generos.add(genero);
		}
	}
	
	public boolean tieneActor(String actor) {
		return this.actores.contains(actor);
	}
	
	public void addActor(String actor) {
		if(!tieneActor(actor)) {
			this.actores.add(actor);
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
		Pelicula p = (Pelicula)obj; 
		return this.getTitulo().equalsIgnoreCase(p.getTitulo()) &&
			   this.getDirector().equalsIgnoreCase(p.getDirector()) &&
			   this.getAnioEstreno() == p.getAnioEstreno();
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "\nPelicula [titulo=" + titulo + ", sinopsis=" + sinopsis + ", generos=" + generos + ", director="
				+ director + ", actores=" + actores + ", anioEstreno=" + anioEstreno + ", duracion=" + duracion + "]";
	}
	
	@Override
	public int compareTo(Pelicula o) {
		return this.titulo.compareTo(o.getTitulo());
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getSinopsis() {
		return sinopsis;
	}
	
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public int getAnioEstreno() {
		return anioEstreno;
	}
	
	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

}
