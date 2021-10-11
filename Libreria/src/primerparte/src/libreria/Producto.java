package primerparte.src.libreria;
public class Producto {

	private String nombre;
	private String autor;
	private double precio;
	
	public Producto(String nombre, String autor, double precio) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
	}

	public double getPrecio(Cliente c) {
		if (c == null) {
			return this.getPrecio();	
		}else {
			return this.getPrecio() - (c.getDescuento()*this.getPrecio())/100;
		}
		 
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		try {
			Producto p = (Producto) obj;
			return this.getNombre().equals(p.getNombre()) && this.getAutor().equals(p.getAutor());
		}catch(Exception e) {
			return false;
		}
	}
	
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}	*/
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
