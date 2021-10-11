
public abstract class Elemento {
	
	private String nombre;

	public Elemento(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public abstract boolean compararElemento(Elemento e);

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
