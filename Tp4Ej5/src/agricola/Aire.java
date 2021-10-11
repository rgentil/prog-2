package agricola;
import java.time.LocalDate;

public class Aire extends Frio {
	//Composición del aire con que fue congelado (% de nitrógeno, % de oxígeno, % de dióxido  de carbono y % de vapor de agua).
	private double porcNitrogeno;
	private double porcOxigeno;
	private double porcDioxidoCarbono;
	private double porcVaporAire;
	
	public Aire(String nombre, LocalDate fechaVencmiento, int nroLote, String granjaOrigen, LocalDate fechaEnvasado,
			String codigoOrganismoSA, double tempMantReco, double porcNitrogeno, double porcOxigeno,
			double porcDioxidoCarbono, double porcVaporAire) {
		super(nombre, fechaVencmiento, nroLote, granjaOrigen, fechaEnvasado, codigoOrganismoSA, tempMantReco);
		this.porcNitrogeno = porcNitrogeno;
		this.porcOxigeno = porcOxigeno;
		this.porcDioxidoCarbono = porcDioxidoCarbono;
		this.porcVaporAire = porcVaporAire;
	}
	
	public Aire(String nombre, LocalDate fechaVencmiento, int nroLote, String granjaOrigen, LocalDate fechaEnvasado,
			String codigoOrganismoSA, double tempMantReco) {
		super(nombre, fechaVencmiento, nroLote, granjaOrigen, fechaEnvasado, codigoOrganismoSA, tempMantReco);
		this.porcNitrogeno = 0.1;
		this.porcOxigeno = 0.1;
		this.porcDioxidoCarbono = 0.1;
		this.porcVaporAire = 0.1;
	}
	
	public String getEtiqueta() {
		return super.getEtiqueta() + "---AIRE--- %NI: " + this.getPorcNitrogeno() + " %O: " + this.getPorcOxigeno() + ""
				+ " %DC: " + this.getPorcDioxidoCarbono() + " %VA: " + this.getPorcVaporAire(); 
	}
	
	public double getPorcNitrogeno() {
		return porcNitrogeno;
	}
	public void setPorcNitrogeno(double porcNitrogeno) {
		this.porcNitrogeno = porcNitrogeno;
	}
	public double getPorcOxigeno() {
		return porcOxigeno;
	}
	public void setPorcOxigeno(double porcOxigeno) {
		this.porcOxigeno = porcOxigeno;
	}
	public double getPorcDioxidoCarbono() {
		return porcDioxidoCarbono;
	}
	public void setPorcDioxidoCarbono(double porcDioxidoCarbono) {
		this.porcDioxidoCarbono = porcDioxidoCarbono;
	}
	public double getPorcVaporAire() {
		return porcVaporAire;
	}
	public void setPorcVaporAire(double porcVaporAire) {
		this.porcVaporAire = porcVaporAire;
	}
	
	
}
