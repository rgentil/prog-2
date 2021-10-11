package Main;

import Alarma.Alarma;
import Alarma.AlarmaLuminosa;

public class MainAlarma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alarma a1 = new Alarma();
		
		//a1.setApertura(true);
		
		a1.comprobar();
		
		AlarmaLuminosa a2 = new AlarmaLuminosa();
		
		a2.setRompimiento(true);
		a2.comprobar();
		
		a2.getLuz().click();

	}

}
