package cuerpotecnico;

import java.time.LocalDate;

public class Entrenador extends CuerpoTecnico {

	private String certFederacion;
	
	public Entrenador(String nombre, String apellido, int nroPasaporte, LocalDate fechaNacimiento) {
		super(nombre, apellido, nroPasaporte, fechaNacimiento);
		this.certFederacion = "Sin federación";
	}

	public Entrenador(String nombre, String apellido, int nroPasaporte, LocalDate fechaNacimiento,String certFederacion) {
		super(nombre, apellido, nroPasaporte, fechaNacimiento);
		this.certFederacion = certFederacion;
	}

	public String getCertFederacion() {
		return certFederacion;
	}

	public void setCertFederacion(String certFederacion) {
		this.certFederacion = certFederacion;
	}

}
