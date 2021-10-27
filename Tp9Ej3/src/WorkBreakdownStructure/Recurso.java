package WorkBreakdownStructure;

public abstract class Recurso {

	private String nombre;
	private String tipo;
	
	public Recurso(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getEstado() {
		return Util.LIBRE;
	}
	
	public abstract void setEstado(String estado);
	
	public boolean noEstaOcupado() {
		return false;
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Recurso r = (Recurso) o;
			return this.getNombre().equals(r.getNombre()) && this.getTipo().equals(r.getTipo());	
		} catch (Exception e) {
			return false;
		}		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
