package agricola;
import java.time.LocalDate;

public class Frio extends Producto {
	 
	//código del organismo de supervisión alimentaria  
	private String codigoOrganismoSA;
	
	//temperatura de mantenimiento recomendada
	private double tempMantReco;
	
	public Frio(String nombre, LocalDate fechaVencmiento, int nroLote, String granjaOrigen, LocalDate fechaEnvasado, String codigoOrganismoSA, double tempMantReco) {
		super(nombre, fechaVencmiento, nroLote, granjaOrigen, fechaEnvasado);
		this.codigoOrganismoSA = codigoOrganismoSA;
		this.tempMantReco = tempMantReco;
	}
	
	public String getEtiqueta() {
		return super.getEtiqueta() + "----FRIO---- C.O.S.A: " + this.getCodigoOrganismoSA() + " T.M.R.: " + this.getTempMantReco(); 
	}
	
	public String getCodigoOrganismoSA() {
		return codigoOrganismoSA;
	}
	
	public void setCodigoOrganismoSA(String codigoOrganismoSA) {
		this.codigoOrganismoSA = codigoOrganismoSA;
	}
	
	public double getTempMantReco() {
		return tempMantReco;
	}
	
	public void setTempMantReco(double tempMantReco) {
		this.tempMantReco = tempMantReco;
	}
	
	
	
}
