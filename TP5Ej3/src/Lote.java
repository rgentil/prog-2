import java.util.ArrayList;

public class Lote extends Activo{

	private double superficie;
	
	public Lote(double superficie) {
		super();
		this.superficie = superficie;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public String tipolote(ArrayList<String> mineralesPrimarios) {
		for (String mp : mineralesPrimarios) {
			if (!minerales.contains(mp))
				return "Común";
		}
		return "Especial";
	}

	@Override
	protected boolean sePuedeSembrar(Activo activo) {
		try {
			Cereal c = (Cereal)activo;
			if (c.isRestriccionSiembra() && this.superficie < 50) {
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