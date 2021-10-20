package SistemaArchivo;
import java.time.LocalDate;
import java.util.List;

import Filtros.Criterio;

public abstract class ArchivoSistema {

	private String nombre;
	private LocalDate fechaCreacion;
	
	public ArchivoSistema(String nombre) {
		super();
		this.nombre = nombre;
		this.fechaCreacion = LocalDate.now();
	}
	
	public abstract double getTamanio();
	
	public abstract int getCantidadDeArchivos();
	
	public abstract int getCantidadElementos();
	
	public abstract List<ArchivoSistema> buscar(Criterio c);
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

}
