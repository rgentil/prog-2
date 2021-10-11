package cuerpotecnico;

import java.time.LocalDate;

public class Masajista extends CuerpoTecnico {

	private String titulo;
	private int cantAniosExperiencia;

	public Masajista(String nombre, String apellido, int nroPasaporte, LocalDate fechaNacimiento) {
		super(nombre, apellido, nroPasaporte, fechaNacimiento);
		this.titulo = "Sin título";
		this.cantAniosExperiencia = 0;

	}

	public Masajista(String nombre, String apellido, int nroPasaporte, LocalDate fechaNacimiento, String titulo, int cantAniosExperiencia) {
		super(nombre, apellido, nroPasaporte, fechaNacimiento);
		this.titulo = titulo;
		this.cantAniosExperiencia = cantAniosExperiencia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getCantAniosExperiencia() {
		return cantAniosExperiencia;
	}

	public void setCantAniosExperiencia(int cantAniosExperiencia) {
		this.cantAniosExperiencia = cantAniosExperiencia;
	}


}
