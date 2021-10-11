package cuerpotecnico;

import java.time.LocalDate;

public class CuerpoTecnico {

	private String nombre;
	private String apellido;
	private int nroPasaporte;
	private LocalDate fechaNacimiento;
	private String estado;

	public CuerpoTecnico(String nombre, String apellido, int nroPasaporte, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroPasaporte = nroPasaporte;
		this.fechaNacimiento = fechaNacimiento;
		this.estado = EstadoPersona.EN_PAIS_ORIGEN;
	}
	
	public boolean disponible() {
		return this.getEstado().equals(EstadoPersona.EN_PAIS_ORIGEN)
				&& !this.getEstado().equals(EstadoPersona.EN_CONCENTRACION);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNroPasaporte() {
		return nroPasaporte;
	}

	public void setNroPasaporte(int nroPasaporte) {
		this.nroPasaporte = nroPasaporte;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
