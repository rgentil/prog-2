package Productos;

public class Vehiculo extends Item{
	private String marca;
	private double kms;
	private String patente;
	private String tipo;
	private boolean alquilado;

	public Vehiculo(double precio, String marca, double kms, String patente, String tipo) {
		super(precio);
		this.marca = marca;
		this.kms = kms;
		this.patente = patente;
		this.tipo = tipo;
		this.alquilado = false;
		
	}
	
	public boolean puedeAlquilarse() {
		return (!alquilado);
	}
	
	public void alquilar() {
		setAlquilado(true);
	}
	
	public void devolucion() {
		setAlquilado(false);
	}
	
	public boolean equals(Object o) {
		try {
			return this.patente.equals( ((Vehiculo)o).getPatente() );
		}catch(Exception e) {
			return false;
		}
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getKms() {
		return kms;
	}

	public void setKms(double kms) {
		this.kms = kms;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public boolean isAlquilado() {
		return alquilado;
	}

	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}

}
