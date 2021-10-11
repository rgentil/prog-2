package Main;

import Alarma.Alarma;
import Alarma.AlarmaLuminosa;
import Alarma.Sensor;

public class MainAlarma {

	public static void main(String[] args) {
		Alarma a1 = new Alarma();
		
		a1.comprobar();
		
		AlarmaLuminosa a2 = new AlarmaLuminosa();
		
		Sensor s1 = new Sensor("Rompimiento","Baño");
		Sensor s2 = new Sensor("Apertura","Baño");
		Sensor s3 = new Sensor("Movimiento","Cocina");
		Sensor s4 = new Sensor("Movimiento","Habitación");
		
		a2.agregarSensor(s1);
		a2.agregarSensor(s2);
		a2.agregarSensor(s3);
		a2.agregarSensor(s4);
		
		a2.comprobar();
		
		s2.setDisparo(true);
		
		a2.comprobar();
		
		//a2.getLuz().click();

	}

}
