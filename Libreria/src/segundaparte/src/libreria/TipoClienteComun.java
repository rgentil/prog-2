package segundaparte.src.libreria;

public class TipoClienteComun implements TipoCliente {

	@Override
	public boolean leGusta(Cliente c, Libro l) {
		return c.leGustaAutor(l.getAutor());
	}

}
