public class MainPersona {

	public static void main(String[] args) {
		
		System.out.println("Arrancamos");
		
		Persona p1 = new Persona (29597431, "Ricardo", "Gentil");
		
		System.out.println("Se creo DNI:" + p1.getDNI() + " Nombre: " + p1.getNombre() + " Apellido: " +  p1.getApellido());
		
		p1.setAltura(1.80);
		p1.setPeso(75.0);
		
		System.out.println("Indice Maza Corpora es: " + p1.getIndiceMazaCorpora());
		
		if (p1.estaEnForma()){
			System.out.println("Fitnes");			
		}else{
			System.out.println("Claramente no esta en forma");
		}
		
		if (p1.isBirthDay()){
			System.out.println("------------------Feliz cumpleaños!!!!!!!!!!!!");			
		}else{
			System.out.println("--------------No es hoy.----------------");
		}
		
		if (p1.esMayorDeEdad()){
			System.out.println("------------------Claro que es mayor");			
		}else{
			System.out.println("--------------Pendejo.----------------");
		}

		if (p1.puedeVotar()){
			System.out.println("------------------Puede votar!");			
		}else{
			System.out.println("--------------No vota.----------------");
		}

		if (p1.tieneCoorencia()){
			System.out.println("Tiene cuerencia");			
		}else{
			System.out.println("Cuerencia por favor");
		}
		
		System.out.println(p1.getInfo());
		//p1.compararFechas();
	
		
		
	}
}
