package ProcesadoresDinamico;

public class ColaTareaCPU extends ColaTarea {

	@Override
	public boolean esMayor(Tarea t1, Tarea t2) {
		return t1.getCpu() > t2.getCpu();
	}

}
