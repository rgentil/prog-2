package Sistema;
import java.time.LocalDate;

import Productos.Item;

public class Alquiler {
	
	private Item item;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	
	public Alquiler(Item item, LocalDate fechaFin) {
		super();
		this.item = item;
		this.fechaInicio = LocalDate.now();
		this.fechaFin = fechaFin;	
	}
	
	public boolean equals(Object o) {
		return this.item.equals( ((Alquiler)o).getItem() );
	}
	
	public Item getItem() {
		return item;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}
	
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

}
