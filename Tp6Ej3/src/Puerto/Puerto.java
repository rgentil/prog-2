package Puerto;
import Colas.Cola;
import Transportes.Transporte;

public class Puerto {
	
	private Cola camiones;
	private Cola barcos;
	
	public Puerto() {
		camiones = new Cola();
		barcos = new Cola();
	}
	
	public void cargar() {
		Transporte camion = camiones.getPrimero();
		Transporte barco = barcos.getPrimero();
		
		if (camion != null && barco != null) {
			camiones.sacarCola();
			barcos.sacarCola();
			barco.setCarga(camion.getCarga());
		}
	}
	
	public void agregarTransporte(Transporte t, Cola c) {
		c.agregarTransporte(t);
	}

}
