import java.util.ArrayList;

public abstract class Activo {
	
	protected ArrayList<String> minerales;
	
	protected abstract boolean sePuedeSembrar(Activo activo);	
	
	public boolean contieneTodosLosMinerales(ArrayList<String> ms) {
		for (String m : ms) {
			if (!minerales.contains(m)) {
				return false;
			}			
		}
		return true;		
	}
}
