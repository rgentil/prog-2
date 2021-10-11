import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private String apellido;
	
	private ArrayList<String> cualidades;
	private ArrayList<Alumno> familiares;
	
	private Casa casa;

	public Alumno(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cualidades = new ArrayList<String>();
		this.familiares = new ArrayList<Alumno>();
	}

	public String getNombre() {
		return nombre;
	}
		
	public boolean tieneCualidad(String cualidad) {
		return cualidades.contains(cualidad);
	}
	
	public boolean tieneFamiliaresEnLaCasa(Casa casa) {
		for (Alumno familiar : familiares) {
			if (familiar.getCasa().equals(casa)) {
				return true;
			}
		}
		return false;
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
	
	public Casa getCasa() {
		return casa;
	}

	public void setCasa(Casa casa) {
		this.casa = casa;
	}
	
	
}
