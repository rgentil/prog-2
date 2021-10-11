package primerparte.src.libreria;

public class ClienteBuenardo extends Cliente{

	public ClienteBuenardo(String nombre, String apellido, String direccion, long dni) {
		super(nombre, apellido, direccion, dni);
	}

	@Override
	public boolean leGusta(Libro libro) {
		return true;
	}
	
	

}
