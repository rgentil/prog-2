package Principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Vendedor implements Comparable<Vendedor>{

	private String nombre;
	private String apellido;
	private int edad;
	private List<Venta> ventas;

	public Vendedor(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.ventas = new ArrayList<Venta>();
	}
	
	public int compareTo(Vendedor v) {
		int aux = this.getApellido().compareTo(v.getApellido());
		if (aux == 0) {
			//aux =  Integer.compare(this.getEdad(), v.getEdad()); Funciona, pero se prefiere con -
			aux =  this.getEdad() - v.getEdad();
		}
		return aux;
	}
	
	public String toString() {
		return "\nVendedor: nombre= " + this.nombre + " apellido= " + this.apellido + ", edad= " + this.edad + ", Lista de ventas = " + this.ventas ;
	}

	public boolean equals(Object objeto) {
		try {
			Vendedor vendedor = (Vendedor) objeto;
			return this.getNombre().equals(vendedor.getNombre()) && 
				   this.getApellido().equals(vendedor.getApellido()) && 
				   this.getEdad() == vendedor.getEdad();
		}catch(Exception e) {
			return false;
		}
	}

	public void addVenta(Venta venta) {
		this.ventas.add(venta);
	}
	
	public boolean TieneVenta(Venta venta) {
		return this.ventas.contains(venta);
	}
	
	public int getCantidadTotalDeVentas() {
		return ventas.size();
	}
	
	public int getCantidadVentasPeriodo(LocalDate desde, LocalDate hasta) {
		int contador = 0;
		for(Venta venta : this.ventas) {
			if (venta.getFechaVenta().isAfter(desde) && venta.getFechaVenta().isBefore(hasta)) {
				contador ++;
			}
		}
		return contador;
	}
	
	public int getCantidadProductosVendidosPeriodo(LocalDate desde, LocalDate hasta) {
		int contador = 0;
		for(Venta venta : this.ventas) {
			if (venta.getFechaVenta().isAfter(desde) && venta.getFechaVenta().isBefore(hasta)) {
				contador += venta.getCantidad();
			}
		}
		return contador;
	}
	
	public double getGananciaTotal() {
		double ganancia = 0;
		for(Venta venta : this.ventas) {
			ganancia += venta.getGanancia();
		}
		return ganancia;
	}
	
	public double getGananciaTotalEnPeriodo(LocalDate desde, LocalDate hasta) {
		double ganancia = 0;
		for(Venta venta : this.ventas) {
			if (venta.getFechaVenta().isAfter(desde) && venta.getFechaVenta().isBefore(hasta)) {
				ganancia += venta.getGanancia();
			}
		}
		return ganancia;
	}
	
	public double getRatioVentas(LocalDate desde, LocalDate hasta) {
		double valor = this.getGananciaTotalEnPeriodo(desde,hasta);
		int cant = this.getCantidadProductosVendidosPeriodo(desde, hasta);
		return valor / cant;
	}
	
	public double getPonderacion(LocalDate desde, LocalDate hasta) {
		double valor = this.getCantidadVentasPeriodo(desde,hasta);
		return valor / this.getEdad();
	}

	public boolean vendioElProducto(String codigo) {
		for(Venta venta : this.ventas) {
			if (venta.getProducto().getCodigo().equals(codigo)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean realizoVentaEnPeriodo(LocalDate desde, LocalDate hasta) {
		for(Venta venta : this.ventas) {
			if (venta.getFechaVenta().isAfter(desde) && venta.getFechaVenta().isBefore(hasta)) {
				return true;
			}
		}
		return false;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
