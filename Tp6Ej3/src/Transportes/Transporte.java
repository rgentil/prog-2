package Transportes;

public abstract class Transporte {
	
	private String carga;
	
	public Transporte(String carga) {
		this.carga = carga;
	}
	
	public abstract boolean esMayor(Transporte t);
	
	public String getCarga() {
		return carga;
	}

	public void setCarga(String carga) {
		this.carga = carga;
	}
}
