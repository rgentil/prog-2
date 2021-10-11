
public class Temporada {
	
	private Episodio[] episodios;
	private int numero;
	
	public Temporada(int numero, int cantEpisodios) {
		this.episodios = new Episodio[cantEpisodios];
		this.numero = numero;
	}

	//Obtener el total episodios vistos de una temporada particular.
	public int totalEpisodiosVisto(){
		int contador = 0;
		for (Episodio episodio : episodios) {
			if (episodio.isVisto()) {
				contador ++;
			}
		}
		return contador;		
	}
	
	//Obtener el promedio de las calificaciones dadas para una temporada particular.
	public double promerdioPorTemporada() {
		double resultado = 0;
		double total = 0;
		int contador = 0;
		for (Episodio episodio : episodios) {
			if (episodio.isVisto()) {
				total += episodio.getCalificacion();
				contador ++;
			}
		}
		if (total != 0 && contador != 0) {
			resultado = total/contador;
		}
		return resultado;
	}
	
	public boolean seVieronTodasLasSeries() {
		for (Episodio episodio : episodios) {
			if (!episodio.isVisto()) {
				return false;
			}
		}
		return true;
	}
	
	public Episodio[] getEpisodios() {
		return episodios;
	}

	public void setEpisodios(Episodio[] episodios) {
		this.episodios = episodios;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
