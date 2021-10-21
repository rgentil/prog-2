package SistemaPapaNoel;

import java.util.ArrayList;
import java.util.List;

public class Carta {
	
	public static final String TROZO_CARBON = "Trozo de carbón";
	
	//Cada carta posee un remitente y una lista de regalos solicitados (un regalo es simplemente un String).
	
	private Ninio remitente;
	private List<String> regalos;
	
	public Carta(Ninio remitente) {
		super();
		this.remitente = remitente;
		regalos = new ArrayList<String>();		
	}

	public int cantRegalos() {
		return regalos.size();
	}
	
	public boolean tieneRegalo(String regalo) {
		return regalos.contains(regalo);
	}
	
	public void addRegalo(String regalo){
		if(!tieneRegalo(regalo)) {
			regalos.add(regalo);
		}
	}

	public boolean esNinioMalo() {
		return this.regalos.contains(TROZO_CARBON);
	}
	
	public void convertir() {
		regalos = new ArrayList<String>();
		regalos.add(TROZO_CARBON);
	}
	
	public Ninio getRemitente() {
		return remitente;
	}

	public void setRemitente(Ninio remitente) {
		this.remitente = remitente;
	}


}
