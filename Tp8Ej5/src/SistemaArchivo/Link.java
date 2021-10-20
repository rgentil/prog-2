package SistemaArchivo;

public class Link extends ArchivoSistema {

	//Los links son vínculos a otro archivo o directorio y tienen un nombre, una fecha de creación 
	// y su tamaño en disco es siempre igual a 1Kb.
	
	public static final double TAMANIO = 1;
	public static final String PREFIJO = "Acceso directo a ";
	
	private ArchivoSistema archivo;
	
	public Link(ArchivoSistema archivo) {
		super(PREFIJO + archivo.getNombre());
		this.archivo = archivo;
	}

	@Override
	public double getTamanio() {
		return TAMANIO;
	}

	@Override
	public int getCantidadDeArchivos() {
		return 0;
	}

	@Override
	public int getCantidadElementos() {
		return 1;
	}
	
	public ArchivoSistema getArchivo() {
		return archivo;
	}

	public void setArchivo(ArchivoSistema archivo) {
		this.archivo = archivo;
	}

}
