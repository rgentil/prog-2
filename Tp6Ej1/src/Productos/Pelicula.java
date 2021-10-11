package Productos;

public class Pelicula extends Item {
	
	private String titulo;
	private String director;
	private String info;
	private int copias;
	
	public Pelicula(double precio, String titulo, String director, String info, int copias) {
		super(precio);
		this.info = info;
		this.copias = copias;
		this.titulo = titulo;
		this.director = director;
	}
	
	public boolean puedeAlquilarse() {
		return this.copias > 0;
	}
	
	public void alquilar() {
		copias --;
	}
	
	public void devolucion() {
		copias ++;
	}
	
	public boolean equals(Object o) {
		try {
			return this.titulo.equals( ((Pelicula)o).getTitulo() ) && this.director.equals( ((Pelicula)o).getDirector() ) ;
		}catch(Exception e) {
			return false;
		}
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}
	
	public int getCopias() {
		return copias;
	}
	
	public void setCopias(int copias) {
		this.copias = copias;
	}
		
}