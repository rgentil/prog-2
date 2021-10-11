import java.util.ArrayList;

public abstract class Casa {

	/*
	Cada una de las casas cuenta con un conjunto de cualidades que deben tener los alumnos para poder pertenecer a dicha casa 
	y una cantidad máxima de alumnos que pueden aceptar.
	*/
	private String nombre;
	private ArrayList<String> cualidades;
	private ArrayList<Alumno> alumnos;
	private int cupo;
	
	public Casa(String nombre) {
		this.setNombre(nombre);
		this.cupo = 100;
		this.cualidades = new ArrayList<String>();
		this.alumnos = new ArrayList<Alumno>();
		
	}
	
	public boolean equals(Object o1) {
		try {
			return this.nombre.equals(((Casa) o1).getNombre());	
		}catch(Exception e){
			return false;
		}
		 
	}
	
	public boolean hayCupo() {
		return getCupo() < alumnos.size();
	}
	
	public abstract void addAlumno(Alumno alumno);
	
	public boolean tieneTodasLasCualidades(Alumno alumno) {
		for (String cualidad : cualidades) {
			if (!alumno.tieneCualidad(cualidad)) {
				return false;
			}
		}
		return true;
	}
	
	public void addCualidad(String cualidad) {
		this.cualidades.add(cualidad);
	}
	
	public void ingresarAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
	}
	
	public int getCupo() {
		return cupo;
	}

	public void setCupo(int cupo) {
		this.cupo = cupo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}