package Transportes;
import java.time.LocalDate;

public class Camion extends Transporte{

	private String patente;
	private LocalDate fechaCarga;
	
	public Camion(String patente, LocalDate fechaCarga, String carga) {
		super(carga);
		this.patente = patente;
		this.setFechaCarga(fechaCarga);
	}
	
	@Override
	public boolean esMayor(Transporte t) {
		try {
			Camion c = (Camion)t; 
			return this.fechaCarga.isBefore(c.getFechaCarga());	
		} catch (Exception e) {
			return false;
		}		
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public LocalDate getFechaCarga() {
		return fechaCarga;
	}

	public void setFechaCarga(LocalDate fechaCarga) {
		this.fechaCarga = fechaCarga;
	}


}
