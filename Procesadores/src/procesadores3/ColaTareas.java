package procesadores3;

import java.util.ArrayList;

public abstract class ColaTareas {

	protected ArrayList<Tarea> tareas;

	public ColaTareas() {
		tareas = new ArrayList<Tarea>();
	}

	public void vaciar() {
		tareas = new ArrayList<Tarea>();
	}

	public int getSize() {
		return tareas.size();
	}

	public Tarea obtenerPrimera() {
		if (tareas.size() > 0) {
			Tarea t1 = tareas.get(0);
			tareas.remove(0);
			return t1;
		} else {
			return null;
		}

	}

	public abstract boolean esMayor(Tarea t1, Tarea t2);

	public void agregarTarea(Tarea t1) {
		boolean encontro = false;
		int i = 0;
		while (!encontro && i < tareas.size()) {

			if (this.esMayor(t1, tareas.get(i))) {
				encontro = true;
				tareas.add(i, t1);
			}
			i++;
		}

		if (!encontro) {
			tareas.add(t1);
		}

	}

}
