package Entidades;

import java.util.Comparator;
import java.util.List;

import Comparadores.ComparadorAND;
import Comparadores.ComparadorPorCantidadGeneros;
import Comparadores.ComparadorPorCantidadIdiomas;
import Comparadores.ComparadorPorCantidadInstrumentos;
import Comparadores.ComparadorPorEdad;
import Filtros.Filtro;
import Filtros.FiltroAND;
import Filtros.FiltroOR;
import Filtros.FiltroParticipantePorEdadMayor;
import Filtros.FiltroParticipantePorGenero;
import Filtros.FiltroParticipantePorIdioma;
import Filtros.FiltroParticipantePorInstrumento;
import Filtros.FiltroParticipantePorTemaAInterpretar;

public class Main {

	public static void main(String[] args) {
	
		Solista participante1 = new Solista("Juan", "Garcia",33);
		participante1.addGeneroPreferencia("cumbia");
		participante1.addGeneroPreferencia("balada");
		participante1.addIdioma("español");
		participante1.addInstrumento("voz");
		participante1.addInstrumento("armónica");
		
		Solista participante2 = new Solista("Pepe", "Argento",46);
		participante2.addGeneroPreferencia("cumbia");
		participante2.addGeneroPreferencia("balada");
		participante2.addIdioma("español");
		participante2.addInstrumento("guitarra");
		participante2.addInstrumento("bajo");
		
		Solista participante3 = new Solista("Leo", "Matioli",45);
		participante3.addGeneroPreferencia("cumbia");
		participante3.addIdioma("español");
		participante3.addInstrumento("guitarra");
		participante3.addInstrumento("voz");
		
		Grupo grupo1 = new Grupo("Trinidad");
		grupo1.addIntegrante(participante1);
		grupo1.addIntegrante(participante2);
		
		Grupo equipo1 = new Grupo("Santafesinos");
		equipo1.addIntegrante(grupo1);
		equipo1.addIntegrante(participante3);
				
		Solista participante4 = new Solista("El chaqueño", "Palavechino",70);
		participante4.addGeneroPreferencia("folklore");
		participante4.addIdioma("español");
		participante4.addIdioma("ingles");
		participante4.addInstrumento("voz");
		participante4.addInstrumento("guitarra");
		
		Grupo equipo2 = new Grupo("El chaqueños y 10 mas");
		equipo2.addIntegrante(participante4);
				
		Coach coach1 = new Coach("Carlos","Bilardo");
		
		coach1.addParticipante(equipo1);
		coach1.addParticipante(equipo2);
		
		System.out.println("Detalles de ");
		System.out.println(coach1);
		System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");
		
		Solista participante5 = new Solista("Ricardo", "Dominguez",35);
		participante5.addGeneroPreferencia("rock");
		participante5.addGeneroPreferencia("folcklore");
		participante5.addGeneroPreferencia("cumbia");
		participante5.addIdioma("español");
		participante5.addIdioma("ingles");
		participante5.addIdioma("aleman");
		participante5.addInstrumento("voz");
		participante5.addInstrumento("guitarra");
		participante5.addInstrumento("bajo");
		
		Grupo equipo3 = new Grupo("Lo mas de zamora");
		equipo3.addIntegrante(participante5);
		
		Solista participante6 = new Solista("Coplanacu el primero", "de los dias",49);
		participante6.addGeneroPreferencia("folcklore");
		participante6.addIdioma("español");
		participante6.addInstrumento("voz");
		participante6.addInstrumento("guitarra");
		
		Solista participante7 = new Solista("Coplanacu el segundo", "de los dias",35);
		participante7.addGeneroPreferencia("folcklore");
		participante7.addIdioma("español");
		participante7.addInstrumento("voz");
		participante7.addInstrumento("guitarra");
		participante7.addInstrumento("acordeon");
		Grupo equipo4 = new Grupo("El duo coplanacu");
		equipo4.addIntegrante(participante6);
		equipo4.addIntegrante(participante7);
		
		Coach coach2 = new Coach("Marcelo", "Tinelli");
		coach2.addParticipante(equipo3);
		coach2.addParticipante(equipo4);
		
		System.out.println("Detalles de ");
		System.out.println(coach2);
		System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");
		
		TemaMusical tema1 = new TemaMusical("La balada del pistolero pistoleado", "ingles");
		tema1.addGeneroMusical("balada");
		tema1.addInstrumento("guitarra");
		
		TemaMusicalFinal temaFinal = new TemaMusicalFinal("A ver quien la sabe", "aleman",1);
		temaFinal.addGeneroMusical("rock");
		temaFinal.addInstrumento("bajo");
		
//		Un tema puede ser interpretado por una banda/grupo/solista si puede cantar en el idioma del
//		tema y al menos uno de los géneros está entre las preferencias del grupo/banda/solista
		Filtro condicionInterpretacion = new FiltroAND(new FiltroParticipantePorIdioma("ingles"), new FiltroParticipantePorGenero("balada"));
		tema1.setCondicionDeInterpretacion(condicionInterpretacion);
		
//		Sin embargo, para los temas de la final se debe chequear además de lo anterior que la
//		banda/grupo/solista posea al menos un miembro que toque un instrumento de los necesarios
//		para interpretar el tema. Este requisito es más restrictivo para otros temas, que requieren, por
//		ejemplo, 2 miembros o incluso 3, que sepan tocar algún instrumento necesario para
//		interpretar el tema.
		temaFinal.setCondicionDeInterpretacion(condicionInterpretacion);
		temaFinal.setCantRestrictivoDeInterpretes(3);
		
//		El jurado exigente sigue existiendo solo que ahora solo permite agregar a su equipo participantes
//		(solistas, grupos o bandas) que al menos toquen un determinado instrumento, conozcan ciertos
//		idiomas y/o prefieran un determinado género. Por ejemplo, sólo permite agregar participantes que
//		toquen la batería, puedan cantar en español e inglés, y que prefieran “pop”. Es posible que este
//		jurado cambie en tiempo de ejecución su restricción para aceptar participantes, aunque los
//		participantes ya aceptados no se eliminan si cambia su preferencia por nuevos participantes.
		Filtro requisitoIngreso =new FiltroOR(
				new FiltroAND(new FiltroParticipantePorInstrumento("guitarra"), new FiltroParticipantePorIdioma("ingles")),
				new FiltroParticipantePorGenero("balada")) 
				;
		coach1.setRequisitoIngreso(requisitoIngreso);
		
//		● Un listado de todos los instrumentos que pueden tocar los participantes de su equipo (no
//		debe haber repetidos)
		System.out.println("Todos los instrumentos del equipo de " +coach1.getNombreYApellido()+ "\n" + coach1.getIntrumentos());
		System.out.println("Todos los instrumentos del equipo de " +coach2.getNombreYApellido()+ "\n" + coach2.getIntrumentos());
		System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");
		
//		● Un listado de todos los idiomas que pueden cantar los participantes de su equipo (sin idiomas repetidos)
		System.out.println("Todos los idiomas del equipo de " +coach1.getNombreYApellido()+ "\n" + coach1.getIdiomas());
		System.out.println("Todos los idiomas del equipo de " +coach2.getNombreYApellido()+ "\n" + coach2.getIdiomas());
		System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");
		
//		● Un listado de géneros de preferencia de los participantes de su equipo (sin repetidos y ordenados alfabéticamente)
		System.out.println("Todos los generos del equipo de " +coach1.getNombreYApellido()+ "\n" + coach1.getGeneros());
		System.out.println("Todos los generos del equipo de " +coach2.getNombreYApellido()+ "\n" + coach2.getGeneros());
		System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");
		
//		● El promedio de edad de su equipo
		System.out.println(" Promedio de edad del equipo de " +coach1.getNombreYApellido()+ "\n" + coach1.getPromedioEdad());
		System.out.println(" Promedio de edad del equipo de " +coach2.getNombreYApellido()+ "\n" + coach2.getPromedioEdad());
		System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");
		
//		● Canten en un determinado idioma, por ejemplo “inglés”
		System.out.println(" Cantan en Ingles en el equipo de "
			+ coach1.getNombreYApellido()+ "\n" + coach1.buscarParticipantes(new FiltroParticipantePorIdioma("ingles")));
		System.out.println(" Cantan en Ingles en el equipo de "
				+ coach2.getNombreYApellido()+ "\n" + coach2.buscarParticipantes(new FiltroParticipantePorIdioma("ingles")));
		System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");
		
//		● Prefieren un determinado género, por ejemplo “rock”.
		System.out.println(" Prefieren rock en el equipo de "
				+ coach1.getNombreYApellido()+ "\n" + coach1.buscarParticipantes(new FiltroParticipantePorGenero("rock")));
		System.out.println(" Prefieren rock en el equipo de "
				+ coach2.getNombreYApellido()+ "\n" + coach2.buscarParticipantes(new FiltroParticipantePorGenero("rock")));
		System.out.println("\n");
		
//		● Canten en un determinado idioma y toquen un instrumento específico. Por ejemplo, “Aleman”	y “Guitarra”
		Filtro filtroAnd = new FiltroAND(new FiltroParticipantePorIdioma("aleman"), new FiltroParticipantePorInstrumento("guitarra"));
		System.out.println(" Cantan en aleman y tocan guitarra en el equipo de "
				+ coach1.getNombreYApellido()+ "\n" + coach1.buscarParticipantes(filtroAnd));
		System.out.println(" Cantan en aleman y tocan guitarra en el equipo de "
				+ coach2.getNombreYApellido()+ "\n" + coach2.buscarParticipantes(filtroAnd));
		System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");
		
//		● Todos los participantes mayores de una determinada edad.
		System.out.println(" Participantes mayores a 35 años en el equipo de "
				+ coach1.getNombreYApellido()+ "\n" + coach1.buscarParticipantes(new FiltroParticipantePorEdadMayor(35)));
		System.out.println(" Participantes mayores a 35 años en el equipo de "
				+ coach2.getNombreYApellido()+ "\n" + coach2.buscarParticipantes(new FiltroParticipantePorEdadMayor(35)));
		System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");
		
//		● Puedan Interpretar un determinado Tema Musical
		System.out.println(" Pueden interpretar el tema " + tema1 +" en el equipo de "
				+ coach1.getNombreYApellido()+ "\n" + coach1.buscarParticipantes(new FiltroParticipantePorTemaAInterpretar(tema1)));
		System.out.println(" Pueden interpretar el tema " + temaFinal +" en el equipo de "
				+ coach1.getNombreYApellido()+ "\n" + coach1.buscarParticipantes(new FiltroParticipantePorTemaAInterpretar(temaFinal)));
		
		System.out.println(" Pueden interpretar el tema " + tema1 +" en el equipo de "
				+ coach2.getNombreYApellido()+ "\n" + coach2.buscarParticipantes(new FiltroParticipantePorTemaAInterpretar(tema1)));
		System.out.println(" Pueden interpretar el tema " + temaFinal +" en el equipo de "
				+ coach2.getNombreYApellido()+ "\n" + coach2.buscarParticipantes(new FiltroParticipantePorTemaAInterpretar(temaFinal)));
		
		System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");
		
//		Una batalla implica que dos participantes (sea banda, grupo o solista) se enfrenten entre sí (puede ser incluso un solista
//		contra una banda). Si un participante gana una batalla contra otro participante se retorna 1, en el caso de empate un 0 y
//		en el caso de que pierda un -1.
		Comparator<ElementoEquipo> reglaBatalla = new ComparadorPorCantidadIdiomas();		
		Batalla batalla = new Batalla( reglaBatalla);
		System.out.println("Batalla entre " + equipo1 + "\n vs \n" + equipo3);
		ElementoEquipo ganador = batalla.getGanador(equipo1, equipo3);
		System.out.println("Ganador " +(ganador == null ? "Empate" : ganador));
		
		System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");
		reglaBatalla = new ComparadorPorCantidadInstrumentos();
		System.out.println("Batalla entre " + equipo2 + " \n vs \n " + equipo4);
		ganador = batalla.getGanador(equipo2, equipo4);
		System.out.println("Ganador " +(ganador == null ? "Empate" : ganador));
		
//		Como la producción es medio caprichosa existen diferentes formas de poder
//		determinar si un participante gana una batalla, que la producción puede cambiar en cualquier momento
//		dependiendo del rating que está teniendo el programa:
//		● Si la cantidad de instrumentos que toca es mayor que la de su oponente.
		reglaBatalla = new ComparadorPorCantidadIdiomas();
		
//		● Si la cantidad de géneros preferidos es menor que la de su oponente.
		reglaBatalla = new ComparadorPorCantidadGeneros();
		
//		● Si la cantidad de instrumentos que toca es mayor a la de su rival, y en caso de ser iguales se desempata por que que tiene mayor edad
		reglaBatalla = new ComparadorAND(new ComparadorPorCantidadInstrumentos(), new ComparadorPorEdad());
		
//		● Si la edad es mayor que la de su oponente y en caso de empate se decide por quién sabe más idiomas que su oponente
		reglaBatalla = new ComparadorAND(new ComparadorPorEdad(), new ComparadorPorCantidadIdiomas());
		
//		Como los jurados no quieren perder una desean poder contar con un mecanismo que les permita
//		dada la forma actual que se va a utilizar para determinar el ganador de una batalla, obtener un listado
//		de sus participantes ordenado de forma tal que los primeros miembros del listado sean los que les
//		ganen o empaten con los siguientes miembros (siempre dentro del mismo equipo del juez).
		List<ElementoEquipo> listadoOrdenado = coach1.getParticipantePorReglaBatalla(reglaBatalla);
		System.out.println("Listado ordenado por regla de Batalla " + listadoOrdenado);
		
	}

}
