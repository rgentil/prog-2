package ProcesadoresDinamico;

public class ColaTareaPrioridad extends ColaTarea {

	@Override
	public boolean esMayor(Tarea t1, Tarea t2) {
		return t1.getPrioridad() > t2.getPrioridad();
	}

}
