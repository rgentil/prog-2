package Productos;

public abstract class Item {
	
	private double precio;
	
	public Item(double precio) {
		super();
		this.precio = precio;
		
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public abstract boolean puedeAlquilarse();
	
	public abstract void alquilar();
	
	public abstract void devolucion();
	
	public abstract boolean equals(Object o); 
	
}
