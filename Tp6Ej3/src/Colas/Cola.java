package Colas;

import java.util.ArrayList;

import Transportes.Transporte;

public class Cola {

	protected ArrayList<Transporte> transportes;

	public Cola() {
		this.transportes = new ArrayList<Transporte>();
	}

	public boolean agregarTransporte(Transporte t) {
		try {
			int i = 0;
			boolean encontro = false;
			while (i < transportes.size() && !encontro) {
				if (transportes.get(i).esMayor(t)) {
					i++;
				} else {
					encontro = true;
				}
			}
			transportes.add(i, t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Transporte getPrimero() {
		if (existe()) {
			return transportes.get(0);
		}
		return null;
	}

	private boolean existe() {
		return (transportes != null && transportes.size() > 0);
	}

	public void sacarCola() {
		transportes.remove(0);
	}

}