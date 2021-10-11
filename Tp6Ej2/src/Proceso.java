public class Proceso extends Elemento {
	
	private int reqMemoria;

	public Proceso(String nombre, int reqMemoria) {
		super(nombre);
		this.reqMemoria = reqMemoria;
	}
	
	public int getReqMemoria() {
		return reqMemoria;
	}

	public void setReqMemoria(int reqMemoria) {
		this.reqMemoria = reqMemoria;
	}

	@Override
	public boolean compararElemento(Elemento e) {
		return this.getReqMemoria() > ((Proceso)e).getReqMemoria();
	}

	@Override
	public String toString() {
		return "Proceso Nombre = " + this.getNombre() + " Req Memoria =" + this.getReqMemoria();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())	
			return false;
		Proceso other = (Proceso) obj;
		return reqMemoria == other.reqMemoria && this.getNombre().equals(other.getNombre());
	}	
	
	

}
