package Sistema;
import java.time.LocalDate;
import java.util.ArrayList;

import Productos.Item;

public class Cliente{
	
	private String nombre;
	
	private ArrayList<Alquiler> alquileres;
	
	public Cliente(String nombre) {
		this.setNombre(nombre);
		this.alquileres = new ArrayList<Alquiler>();
	}

	public boolean tieneDeudas() {
		for (Alquiler alquiler : alquileres) {
			if (alquiler.getFechaFin().isBefore(LocalDate.now())) {
				return true;
			}
		} 
		return false;
	}

	public void alquilar(Item i) {
		if (i.puedeAlquilarse()) {
			i.alquilar();
			Alquiler a = new Alquiler(i,LocalDate.now().plusDays(10));
			agregarItem(a);
		}		
	}
	
	public void devolver(Item i) {
		i.devolucion();	
	}	
	
	public void agregarItem(Alquiler alquiler) {
		this.alquileres.add(alquiler);
	}
	
	public void sacarItem(Alquiler alquiler) {
		this.alquileres.remove(alquiler);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
	
}