package Transportes;

public class Barco extends Transporte{

	private String nombre;
	private int capacidad;
	
	public Barco(String nombre, int capacidad, String carga) {
		super(carga);
		this.nombre = nombre;
		this.capacidad = capacidad;
	}
	
	@Override
	public boolean esMayor(Transporte t) {
		try {
			Barco b = (Barco)t;
			return this.capacidad > b.getCapacidad();	
		} catch (Exception e) {
			return false; 
		}
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}	
	
}
