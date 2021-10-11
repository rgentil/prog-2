package Alarma;

public class Alarma {

	private boolean rompimiento;
	private boolean apertura;
	private boolean movimiento;
	
	private Timbre timbre;
	
	public Alarma() {
		rompimiento = apertura = movimiento = false;
		timbre = new Timbre();
	}
	
	public boolean comprobar() {
		if (isRompimiento() || isApertura() || isMovimiento()) {
			System.out.println("DANGEEEEEERRRRRRRR.");
			timbre.hacerSonar();
			return true;
		}
		System.out.println("Todo en orden por las casas.");
		return false;
	}

	public Timbre getTimbre() {
		return timbre;
	}

	public void setTimbre(Timbre timbre) {
		this.timbre = timbre;
	}

	public boolean isRompimiento() {
		return rompimiento;
	}

	public void setRompimiento(boolean rompimiento) {
		this.rompimiento = rompimiento;
	}

	public boolean isApertura() {
		return apertura;
	}

	public void setApertura(boolean apertura) {
		this.apertura = apertura;
	}

	public boolean isMovimiento() {
		return movimiento;
	}

	public void setMovimiento(boolean movimiento) {
		this.movimiento = movimiento;
	}
}
