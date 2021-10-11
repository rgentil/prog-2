package Alarma;

public class Luz {

	private boolean prendida;

	public Luz(){
		prendida = false;
	}
	
	public void click(){
		this.setPrendida(!prendida);
		if (this.isPrendida()) {
			System.out.println("Prendida");
		}else {
			System.out.println("Apagada");
		}
	}
	
	public void encender(){
		this.setPrendida(true);
		System.out.println("Luz Encendida!!!");
	}
	
	public boolean isPrendida() {
		return prendida;
	}

	public void setPrendida(boolean prendida) {
		this.prendida = prendida;
	}
	
}
