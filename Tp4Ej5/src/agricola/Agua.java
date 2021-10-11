package agricola;
import java.time.LocalDate;

public class Agua extends Frio {
	
	// Salinidad del agua con que se realizó la congelación en gramos de sal por litro de agua.
	private double porcSalinidad;

	public Agua(String nombre, LocalDate fechaVencmiento, int nroLote, String granjaOrigen, LocalDate fechaEnvasado,
			String codigoOrganismoSA, double tempMantReco, double porcSalinidad) {
		super(nombre, fechaVencmiento, nroLote, granjaOrigen, fechaEnvasado, codigoOrganismoSA, tempMantReco);
		this.porcSalinidad = porcSalinidad;
	}
	
	public Agua(String nombre, LocalDate fechaVencmiento, int nroLote, String granjaOrigen, LocalDate fechaEnvasado,
			String codigoOrganismoSA, double tempMantReco) {
		super(nombre, fechaVencmiento, nroLote, granjaOrigen, fechaEnvasado, codigoOrganismoSA, tempMantReco);
		this.porcSalinidad = 0.1;
	}
	
	public String getEtiqueta() {
		return super.getEtiqueta() + "---AGUA--- %Salinidad: " + this.getPorcSalinidad(); 
	}

	public double getPorcSalinidad() {
		return porcSalinidad;
	}

	public void setPorcSalinidad(double porcSalinidad) {
		this.porcSalinidad = porcSalinidad;
	}
	
	
}
