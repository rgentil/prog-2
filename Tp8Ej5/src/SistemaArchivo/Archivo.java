package SistemaArchivo;

public class Archivo extends ArchivoSistema{

	private double tamanio;
	
	public Archivo(String nombre, double tamanio) {
		super(nombre);
		this.tamanio = tamanio;
	}

	@Override
	public double getTamanio() {
		return this.tamanio;
	}

	@Override
	public int getCantidadDeArchivos() {
		return 1;
	}

	@Override
	public int getCantidadElementos() {
		return this.getCantidadDeArchivos();
	}


}
