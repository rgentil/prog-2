public class Serie {
	
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	
	private Temporada[] temporadas;
	
	public Serie(String titulo, String descripcion, String creador, String genero, int cantTemporadas) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		this.temporadas = new Temporada[cantTemporadas];
	}
	
	//Obtener el total episodios vistos de una temporada particular.
	/*
	public int totalEpisodiosVistoTemporada(Temporada temporada) {
		return temporada.totalEpisodiosVisto();
	}
	*/
	
	//Obtener el total de episodios vistos de una serie.
	public int totalEpisodiosVistoSerie(){		
		int resultado = 0;
		for (Temporada temporada : temporadas) {
			resultado += temporada.totalEpisodiosVisto();
		}
		return resultado;
	}
	
	//Obtener el promedio de las calificaciones dadas para una serie.
	public double promedio() {
		double resultado = 0;
		double contadorPromedios = 0;
		for (Temporada temporada : temporadas) {
			contadorPromedios += temporada.promerdioPorTemporada();
		}
		if (contadorPromedios != 0 && this.cantTemporadas() != 0 ) {
			resultado = contadorPromedios / this.cantTemporadas();
		}
		return resultado;
	}
	
	private int cantTemporadas() {
		int cantidad = 0;
		if (this.temporadas != null || this.temporadas.length > 0) {
			cantidad = this.temporadas.length;
		}
		return cantidad; 		
	}
	
	//Determinar si se vio todos los episodios de la serie.
	public boolean seVieronTodasLasTemporads() {
		for (Temporada temporada : temporadas) {
			if (!temporada.seVieronTodasLasSeries()) {
				return false;
			}
		}
		return true;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Temporada[] getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(Temporada[] temporadas) {
		this.temporadas = temporadas;
	}
	
	
}