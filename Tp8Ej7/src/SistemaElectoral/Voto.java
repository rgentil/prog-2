package SistemaElectoral;
import java.time.LocalDateTime;

/*
Cuando un votante se presenta a emitir su voto, se debe controlar que el mismo se encuentre en el padrón correspondiente. 
Si se cumple esta condición, se registra el voto de la persona, que puede contener una referencia a un candidato o ser un voto en blanco
 (sin referencia a ningún candidato). 
 
Adicionalmente el voto guarda la hora en que se emitió el mismo (el momento en el que se crea el voto).

Nota: Todos los votos emitidos se guardan en la mesa, aunque sean en blanco 
	(es decir,siempre existe el voto, es lo mismo que sucede con un sobre en una elección real) 
*/
public abstract class Voto {
	
	private Candidato candidato;
	private LocalDateTime horaVoto;
	
	public Voto(Candidato candidato) {
		this.candidato = candidato;
		this.horaVoto = LocalDateTime.now();
	}

	public boolean votoA(Candidato c) {
		return this.candidato.equals(c);
	}
	
	public boolean votoEnBlanco() {
		return this.candidato == null;
	}
	
	public Candidato getCandidato() {
		return candidato;
	}

	public LocalDateTime getHoraVoto() {
		return horaVoto;
	}
	
	
}
