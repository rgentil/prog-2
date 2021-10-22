package Principal;

import java.time.LocalDate;

public class Venta {
	
	private LocalDate fechaVenta;
	private String dniComprador;
	private Producto producto;
	private int cantidad;
	
	public Venta(String dniComprador, Producto producto, int cantidad) {
		this.dniComprador = dniComprador;
		this.producto = producto;
		this.fechaVenta = LocalDate.now();
		this.cantidad = cantidad;
	}

	public double getGanancia() {
		return producto.getPrecio() * cantidad;
	}
	
	public double getMonton() {
		return this.producto.getPrecio();
	}
	
	public String toString() {
		return "\nVenta: Dni= " + this.dniComprador + ", producto= " + this.producto + ", cantidad= " + this.cantidad + "Fecha " + this.fechaVenta;
	}

	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public String getDniComprador() {
		return dniComprador;
	}
	
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}	
	
	
	
}
