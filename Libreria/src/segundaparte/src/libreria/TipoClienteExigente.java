package segundaparte.src.libreria;

public class TipoClienteExigente implements TipoCliente {

	@Override
	public boolean leGusta(Cliente c, Libro l) {
		return c.leGustaAutor(l.getAutor()) && c.leGustaGenero(l.getGeneroLiterario());
	}

}
