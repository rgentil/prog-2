package cuerpotecnico;

import java.time.LocalDate;

public class Futbolista extends CuerpoTecnico {

	public static final String PIE_ZURDO = "Zurdo";
	public static final String PIE_DERECHO = "Derecho";
	public static final String PIE_AMBOS = "Ambos";

	private int posicion;
	private String pie;
	private int cantGoles;

	public Futbolista(String nombre, String apellido, int nroPasaporte, LocalDate fechaNacimiento) {
		super(nombre, apellido, nroPasaporte, fechaNacimiento);
		this.posicion = 0;
		this.pie = PIE_DERECHO;
		this.cantGoles = 0;

	}

	public Futbolista(String nombre, String apellido, int nroPasaporte, LocalDate fechaNacimiento, int posicion,
			String pie, int cantGoles) {
		super(nombre, apellido, nroPasaporte, fechaNacimiento);
		this.posicion = posicion;
		this.pie = pie;
		this.cantGoles = cantGoles;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public String getPie() {
		return pie;
	}

	public void setPie(String pie) {
		this.pie = pie;
	}

	public int getCantGoles() {
		return cantGoles;
	}

	public void setCantGoles(int cantGoles) {
		this.cantGoles = cantGoles;
	}

}