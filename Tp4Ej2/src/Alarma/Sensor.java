package Alarma;

public class Sensor {
	
	private String tipo;
	private String zona;
	private boolean disparo;
	
	public Sensor(String tipo, String zona) {
		this.tipo = tipo;
		this.zona = zona;
		this.disparo = false;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public boolean isDisparo() {
		return disparo;
	}

	public void setDisparo(boolean disparo) {
		this.disparo = disparo;
	}
	
	
}
