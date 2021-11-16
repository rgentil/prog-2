package Entidades;

public class TemaMusicalFinal extends TemaMusical {

	private int cantRestrictivoDeInterpretes;
	
	public TemaMusicalFinal(String titulo, String idioma, int cantRestrictivoDeInterpretes) {
		super(titulo, idioma);
		this.cantRestrictivoDeInterpretes = cantRestrictivoDeInterpretes;
	}
	
	@Override
	public boolean puedeInterpretarsePor(ElementoEquipo participante) {
		return super.puedeInterpretarsePor(participante) 
			   && 
			   this.cumpleCondicionCantInterpretes(participante);
	}
	
//	Sin embargo, para los temas de la final se debe chequear además de lo anterior que la
//	banda/grupo/solista posea al menos un miembro que toque un instrumento de los necesarios
//	para interpretar el tema. Este requisito es más restrictivo para otros temas, que requieren, por
//	ejemplo, 2 miembros o incluso 3, que sepan tocar algún instrumento necesario para
//	interpretar el tema.
	private boolean cumpleCondicionCantInterpretes(ElementoEquipo participante) {
		if ( this.getInstrumentosNecesarios().isEmpty()) { 
			return true;
		}else {
			for (String instrumento : this.getInstrumentosNecesarios()) {
				int total = participante.cantParticipantesQueTocanElInstrumento(instrumento);
				if (total >= this.getCantRestrictivoDeInterpretes()) {
					return true;
				}
			}
			return false;
		}		
	}

	public int getCantRestrictivoDeInterpretes() {
		return cantRestrictivoDeInterpretes;
	}

	public void setCantRestrictivoDeInterpretes(int cantRestrictivoDeInterpretes) {
		this.cantRestrictivoDeInterpretes = cantRestrictivoDeInterpretes;
	}	
	

}
