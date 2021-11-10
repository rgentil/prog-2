package CondicionesDeBatalla;

public class CondicionBatallaPersonalCompuesta extends CondicionBatallaPersonal {
	
	private CondicionBatallaPersonal c1;
	private CondicionBatallaPersonal c2;
	
	public CondicionBatallaPersonalCompuesta(CondicionBatallaPersonal c1, CondicionBatallaPersonal c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public int resultado() {
		int aux = c1.resultado();
		if (aux == 0 && c2 != null) {
			aux = c2.resultado();
		}
		return aux;
	}
		
	
}
