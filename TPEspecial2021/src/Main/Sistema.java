package Main;

import Entidades.Coach;
import Entidades.ElementoEquipo;
import Entidades.Grupo;
import Entidades.Solista;

public class Sistema {

	public static void main(String[] args) {
	
		ElementoEquipo participante1 = new Solista("Participante1", "Apellido1",33);
		ElementoEquipo participante2 = new Solista("Participante2", "Apellido1",18);
		ElementoEquipo participante3 = new Solista("Participante3", "Apellido1",25);
		Grupo grupo1 = new Grupo("Los Palmeras");
		grupo1.addIntegrante(participante1);
		grupo1.addIntegrante(participante2);
		grupo1.addIntegrante(participante3);
		
		Grupo equipo1 = new Grupo("Equipo 1");
		equipo1.addIntegrante(grupo1);
		
		Coach coach1 = new Coach("Coach1","Apellido del coach");
		
		coach1.addParticipante(equipo1);
		
		coach1.addParticipante(new Solista("Participante3", "Apellido1",25));
		
		ElementoEquipo participante4 = new Solista("Participante4", "Apellido4",69);
		
		coach1.addParticipante(participante4);
		
		
	}

}
