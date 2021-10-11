package primerparte.src.libreria;

public class ClienteExigente extends Cliente {

	public ClienteExigente(String nombre, String apellido, String direccion, long dni) {
		super(nombre, apellido, direccion, dni);
	}

	@Override
	public boolean leGusta(Libro libro) {
		return super.leGustaAutor(getApellido()) && leGustaGenero(libro.getGeneroLiterario());
	}

	
}
