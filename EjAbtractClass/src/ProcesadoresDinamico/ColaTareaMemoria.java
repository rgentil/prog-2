package ProcesadoresDinamico;

public class ColaTareaMemoria extends ColaTarea {

	@Override
	public boolean esMayor(Tarea t1, Tarea t2) {
		return t1.getMemoria() > t2.getMemoria();
	}
}
