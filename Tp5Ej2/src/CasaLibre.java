
public class CasaLibre extends Casa {
	
	public CasaLibre(String nombre) {
		super(nombre);
	}

	@Override
	public void addAlumno(Alumno alumno) {
		if (hayCupo()) {
			if (this.tieneTodasLasCualidades(alumno)) {
				this.ingresarAlumno(alumno);
			}else {
				System.out.println("El alumno " + alumno.getNombre() + " no cumple con todos los requesitos de la casa " + getNombre());
			}
		}else {
			System.out.println("No hay cupo disponible en la casa " + getNombre());
		}
	}	
	

}
