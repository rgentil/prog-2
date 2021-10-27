package WorkBreakdownStructure;

public class Recurso {

	private String nombre;
	private String tipo;
	private String estado;
	
	public Recurso(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.estado = Util.LIBRE;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		if (this.tipo.equals(Util.EXCLUSIVO))
			this.estado = estado;
	}
	
	public boolean noEstaOcupado() {
		return getEstado().equals(Util.LIBRE);
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
