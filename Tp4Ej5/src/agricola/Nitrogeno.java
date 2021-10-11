package agricola;
import java.time.LocalDate;

public class Nitrogeno extends Frio {

	//Información del método de congelación empleado y del tiempo de exposición al nitrógeno
	private String metodoCongelacion;
	private double tiempoExposicion;
	
	public Nitrogeno(String nombre, LocalDate fechaVencmiento, int nroLote, String granjaOrigen,
			LocalDate fechaEnvasado, String codigoOrganismoSA, double tempMantReco, String metodoCongelacion,
			double tiempoExposicion) {
		super(nombre, fechaVencmiento, nroLote, granjaOrigen, fechaEnvasado, codigoOrganismoSA, tempMantReco);
		this.metodoCongelacion = metodoCongelacion;
		this.tiempoExposicion = tiempoExposicion;
	}
	
	public Nitrogeno(String nombre, LocalDate fechaVencmiento, int nroLote, String granjaOrigen,
			LocalDate fechaEnvasado, String codigoOrganismoSA, double tempMantReco) {
		super(nombre, fechaVencmiento, nroLote, granjaOrigen, fechaEnvasado, codigoOrganismoSA, tempMantReco);
		this.metodoCongelacion = "Standar";
		this.tiempoExposicion = 1.0;
	}
	
	public String getEtiqueta() {
		return super.getEtiqueta() + "---NITROGENO--- %Modo Congelación: " + this.getMetodoCongelacion() + " %Tiempo de Exposición: " + this.getTiempoExposicion() + " hs."; 
	}
	
	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}
	
	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}
	
	public double getTiempoExposicion() {
		return tiempoExposicion;
	}
	
	public void setTiempoExposicion(double tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}
	
	
	
	
}
