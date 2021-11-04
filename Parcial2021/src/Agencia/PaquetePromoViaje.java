package Agencia;

import java.time.LocalDate;

public class PaquetePromoViaje extends PaqueteSimple{

	private double porcentaje;//0.5
	private LocalDate fechaDesde;
	private LocalDate fechaHasta;

	public PaquetePromoViaje(int idPaquete, int cantPasajeros, String datoAlojamiento, String ciudadOrigen,
			String ciudadDestino, double costo, double porcentaje, LocalDate fechaDesde, LocalDate fechaHasta) {
		super(idPaquete, cantPasajeros, datoAlojamiento, ciudadOrigen, ciudadDestino, costo);
		this.porcentaje = porcentaje;
		this.fechaDesde = fechaDesde;
		this.fechaHasta = fechaHasta;
	}
	
	private boolean aplicarDescuento() {
		return  this.getFechaPagoAcordada() != null &&
			   (this.getFechaPagoAcordada().compareTo(this.getFechaDesde()) > 0) &&
			   (this.getFechaPagoAcordada().compareTo(this.getFechaHasta()) < 0);
	}
	
	public double getCosto() {
		if (aplicarDescuento()) {
			return getCosto() * this.getPorcentaje();
		}else {
			return getCosto();
		}
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public LocalDate getFechaDesde() {
		return fechaDesde;
	}

	public void setFechaDesde(LocalDate fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public LocalDate getFechaHasta() {
		return fechaHasta;
	}

	public void setFechaHasta(LocalDate fechaHasta) {
		this.fechaHasta = fechaHasta;
	}
	
}
