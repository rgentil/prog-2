package SistemaElectoral;

public class Candidato implements Comparable<Candidato>{

	//Los candidatos poseen un nombre, un partido político y una agrupación.
	private String nombre, partidoPolitcio, agrupacion;

	public Candidato(String nombre, String partidoPolitcio, String agrupacion) {
		super();
		this.nombre = nombre;
		this.partidoPolitcio = partidoPolitcio;
		this.agrupacion = agrupacion;
	}

	@Override
	public boolean equals(Object o) {
		try {
			Candidato c = (Candidato) o;
			return this.getNombre().equalsIgnoreCase(c.getNombre()) &&
				   this.getPartidoPolitcio().equalsIgnoreCase(c.getPartidoPolitcio()) &&
				   this.getAgrupacion().equalsIgnoreCase(c.getAgrupacion()) ;
			
		} catch (Exception e) {
			return false;
		}
	}

	//	5. Obtener un listado de todos los candidato que se presentan a la elección, ordenado
	//		por partido político si son del mismo partido ordenarlos por agrupación; y si son de la
	//		misma agrupación ordenarlos por nombre.
	@Override
	public int compareTo(Candidato o) {
		int aux = this.getPartidoPolitcio().compareTo(o.getPartidoPolitcio());
		if (aux == 0) {
			aux = this.getAgrupacion().compareTo(o.getAgrupacion());
			if (aux == 0) {
				aux = this.getNombre().compareTo(o.getNombre());
			}
		}
		return aux;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPartidoPolitcio() {
		return partidoPolitcio;
	}

	public void setPartidoPolitcio(String partidoPolitcio) {
		this.partidoPolitcio = partidoPolitcio;
	}

	public String getAgrupacion() {
		return agrupacion;
	}

	public void setAgrupacion(String agrupacion) {
		this.agrupacion = agrupacion;
	}

}
