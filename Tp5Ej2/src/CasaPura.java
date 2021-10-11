
public class CasaPura extends Casa{

	public CasaPura(String nombre) {
		super(nombre);
	}

	@Override
	public void addAlumno(Alumno alumno) {
		if (hayCupo()) {
			if (tieneTodasLasCualidades(alumno)) {
				if (tieneFamiliaresEnLaCasa(alumno)) {
					this.ingresarAlumno(alumno);	
				}else {
					System.out.println("El alumno " + alumno.getNombre() + " no tiene familiares en la casa " + getNombre());
				}
			}else {
				System.out.println("El alumno " + alumno.getNombre() + " no cumple con todos los requesitos de la casa " + getNombre());
			}
		}else {
			System.out.println("No hay cupo disponible en la casa " + getNombre());
		}
	}
	
	private boolean tieneFamiliaresEnLaCasa(Alumno alumno) {
		return alumno.tieneFamiliaresEnLaCasa(this);		
	}

	

}
