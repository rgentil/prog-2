package Alarma;

import java.util.ArrayList;

public class Alarma {

	private Timbre timbre;

	protected ArrayList<Sensor> sensores;

	public Alarma() {
		timbre = new Timbre();
		sensores = new ArrayList<Sensor>();
	}

	public void agregarSensor(Sensor s) {
		this.sensores.add(s);
	}

	public void eliminarSensor(Sensor s) {
		this.sensores.remove(s);
	}

	public boolean comprobar() {
		boolean avisar = false;
		for (Sensor sensor : sensores) {
			if (sensor.isDisparo()) {
				avisar = true;
				System.out.println("Se disparó la zona " + sensor.getZona() + " - sensor de " + sensor.getTipo());
			}
		}
		if (avisar) {
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

	//No hacer esto porque rompe el encapsulamiento
	/*
	public ArrayList<Sensor> getSensores() {
		return sensores;
	}*/
	/*
	public void setSensores(ArrayList<Sensor> sensores) {
		this.sensores = sensores;
	}
	 */
	
	//ESTO DEPENDE DEL CASO ESTA BIEN O NO
	/*
	public ArrayList<Sensor> getSensores() {
		return new ArrayList<Sensor>();
	}
	*/
}
