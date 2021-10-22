package Principal;

public class Producto {
	private String codigo;
	private String nombre;
	private double precio;
	
	public Producto(String codigo, String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String toString() {
		return "\nProducto: codigo= " + this.codigo + ", nombre= " + this.nombre + ", precio= " + this.precio;
	}

	public String getCodigo() {
		return codigo;
	}
		
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
