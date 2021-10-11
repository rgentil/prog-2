
public class Computadora extends Elemento{

	private int velocidad;
	private Proceso proceso;
	
	public Computadora(String nombre,int velocidad) {
		super(nombre);
		this.velocidad = velocidad;
		this.proceso = null;
	}
	
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public boolean compararElemento(Elemento e) {
		return this.getVelocidad() > ((Computadora)e).getVelocidad();
	}
	
	public String toString() {
		return "Computadora nombre = " + this.getNombre() + " Velocidad = " + this.getVelocidad() + "\n"; 
	}
	
	public boolean equals(Object o) {
		try {
			Computadora c = ((Computadora)o);
			return this.getNombre().equals(c.getNombre()) && this.getVelocidad() == c.getVelocidad();
		}catch(Exception e) {
			return false;
		}
	}

	public void procesar(Proceso p) {
		this.setProceso(p);	
	}

	public Proceso getProceso() {
		return proceso;
	}

	public void setProceso(Proceso proceso) {
		this.proceso = proceso;
	}
	
}
