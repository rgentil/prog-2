package SistemaPapaNoel;

public class Ninio {

	private String nombre;
	private String apellido;
	private String dni;

	public Ninio(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}
	
	public boolean equals(Object o) {
		try {
			Ninio n = (Ninio)o;
			return this.getDni().equalsIgnoreCase(n.getDni()) && 
				   this.getApellido().equalsIgnoreCase(n.getApellido()) && 
				   this.getNombre().equalsIgnoreCase(n.getNombre());
		} catch (Exception e) {
			return false;
		}
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
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}	

}
