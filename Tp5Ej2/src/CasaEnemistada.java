import java.util.ArrayList;

public class CasaEnemistada extends Casa{

	private ArrayList<Casa> enemistades;
	
	public CasaEnemistada(String nombre) {
		super(nombre);
		enemistades = new ArrayList<Casa>();		
	}

	@Override
	public void addAlumno(Alumno alumno) {
		if (hayCupo()) {
			if (tieneTodasLasCualidades(alumno)) {
				if (noTengaCualidadesDeOtraCasa(alumno)) {
					this.ingresarAlumno(alumno);	
				}else {
					System.out.println("El alumno " + alumno.getNombre() + " cualidades de otra casa enemiga" + getNombre());
				}
			}else {
				System.out.println("El alumno " + alumno.getNombre() + " no cumple con todos los requesitos de la casa " + getNombre());
			}
		}else {
			System.out.println("No hay cupo disponible en la casa " + getNombre());
		}
	}
	
	private boolean noTengaCualidadesDeOtraCasa(Alumno alumno) {
		for (Casa casaEnemiga : enemistades) {
			if (casaEnemiga.tieneTodasLasCualidades(alumno)) {
				return true;
			}
		}
		return false;
		
	}

}
