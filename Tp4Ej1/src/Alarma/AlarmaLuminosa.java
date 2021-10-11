package Alarma;

public class AlarmaLuminosa extends Alarma {

	private Luz luz;
	
	public AlarmaLuminosa() {
		super();
		luz = new Luz();
	}
	
	public boolean comprobar() {
		if (super.comprobar()) {
			luz.encender();
			return true;
		}
		return false;
		
	}
	
	public Luz getLuz() {
		return luz;
	}

	public void setLuz(Luz luz) {
		this.luz = luz;
	}
	
}
