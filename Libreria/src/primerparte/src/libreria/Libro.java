package primerparte.src.libreria;

public class Libro extends Producto {
	
	private int cantPaginas;
	private String generoLiterario;
	private String resumen;
	
	public Libro(String nombre, String autor, double precio, int cantPaginas, String generoLiterario, String resumen) {
		super(nombre, autor, precio);
		this.cantPaginas = cantPaginas;
		this.generoLiterario = generoLiterario;
		this.resumen = resumen;
	}
	
	public int getCantPaginas() {
		return cantPaginas;
	}
	
	public void setCantPaginas(int cantPaginas) {
		this.cantPaginas = cantPaginas;
	}
	
	public String getGeneroLiterario() {
		return generoLiterario;
	}
	
	public void setGeneroLiterario(String generoLiterario) {
		this.generoLiterario = generoLiterario;
	}
	
	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}


}
