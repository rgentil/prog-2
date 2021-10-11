package procesadores2;

public class ComportamientoMemoria extends Comportamiento {


	public boolean esMayor(Tarea t1, Tarea t2) {
		return t1.getMemoria() > t2.getMemoria();
	}

}
