import java.util.ArrayList;
import java.util.List;

public class ColaElementos {
	
	private List<Elemento> elementos;
	
	public ColaElementos() {
		elementos = new ArrayList<Elemento>();		
	}
	
	public int getSize() {
		return elementos.size();
	}
	
	public boolean tieneElementos() {
		return elementos.size() > 0;
	}
	
	public Elemento getPrimero() {
		return elementos.remove(0);
	}
	
	public List<Elemento> getElementos(){
		return new ArrayList<>(elementos);
	}
	
	public void agregar(Elemento eAgregar) {
		int i = 0;
		boolean encontro = false;
		while (i < getSize()  && !encontro) {
			Elemento elemento = elementos.get(i);
			if (elemento.compararElemento(eAgregar)) {
				elementos.add(i,eAgregar);
				encontro = true;
			}else {
				i++;
			}		
		}
		
		if(!encontro) {
			elementos.add(eAgregar);
		}
	}

	
}
