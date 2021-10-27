package WorkBreakdownStructure;

public class RecursoExclusivo extends Recurso {

	private String estado;
	
	public RecursoExclusivo(String nombre, String tipo) {
		super(nombre, tipo);
		this.estado = Util.LIBRE;
	}

	public String getEstado() {
		return this.estado;
	}

	@Override
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public boolean noEstaOcupado() {
		return this.estado.equals(Util.LIBRE);
	}

}
