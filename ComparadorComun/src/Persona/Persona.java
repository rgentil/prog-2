package Persona;
import java.time.LocalDate;

public class Persona implements Comparable<Persona>{

	private String nombre;
	private int cantHijos;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, int cantHijos, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.cantHijos = cantHijos;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@Override
	public int compareTo(Persona o) {
		return this.getNombre().compareTo(o.getNombre());
	}
	
	@Override
	public boolean equals(Object o) {
		Persona p = (Persona)o;
		return this.getNombre().equals(this.getNombre()) &&
			   this.getFechaNacimiento().equals(p.getFechaNacimiento()) &&
			   this.getCantHijos() == p.getCantHijos();
	}

	@Override
	public String toString() {
		return " Nombre = " + this.getNombre() + ", Número de hijos = " + this.getCantHijos() + ", Fecha Nacimiento = " + this.getFechaNacimiento() + "\n";
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
		
	
}
