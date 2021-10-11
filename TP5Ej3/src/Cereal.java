public class Cereal extends Activo{
	
	private String nombre;
	private boolean restriccionSiembra;
	
	public Cereal(String nombre, boolean restriccionSiembra) {
		super();
		this.nombre = nombre;
		this.restriccionSiembra = restriccionSiembra;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isRestriccionSiembra() {
		return restriccionSiembra;
	}

	public void setRestriccionSiembra(boolean restriccionSiembra) {
		this.restriccionSiembra = restriccionSiembra;
	}

	@Override
	protected boolean sePuedeSembrar(Activo activo) {
		try {
			Lote l = (Lote)activo;
			if (this.isRestriccionSiembra() && l.getSuperficie() < 50) {
				return false;
			}
			if (!contieneTodosLosMinerales(activo.minerales)){
				return false;
			}
			
		}catch (Exception e) {
			return false;
		}
		return true;
	}
	

}
