package Filtros;

import Entidades.TemaMusical;
import Participantes.ElementoEquipo;

public class FiltroParticipantePorTemaMusical extends Filtro {

	private TemaMusical temaMusical;
	
	private int cantInstrumentosNecesarios;
	
	public FiltroParticipantePorTemaMusical(TemaMusical temaMusical) {
		this.temaMusical = temaMusical;
		cantInstrumentosNecesarios = 0;
	}

	@Override
	public boolean cumple(ElementoEquipo participante) {
		
		Filtro porIdioma = new FiltroParticipantePorIdioma(temaMusical.getIdioma());
		
		Filtro porGenero = new FiltroParticipantePorGeneroLista(temaMusical.getGenerosMusicales());
		
		int totalDeInstrumentosRequeridosConocen = participante.getTotalDeInstrumentosRequeridosConocen(temaMusical.getInstrumentosNecesarios()); 
			
		return porIdioma.cumple(participante) && 
			porGenero.cumple(participante) && 
			totalDeInstrumentosRequeridosConocen >= this.getCantInstrumentosNecesarios();
		
	}

	public int getCantInstrumentosNecesarios() {
		return cantInstrumentosNecesarios;
	}

	public void setCantInstrumentosNecesarios(int cantInstrumentosNecesarios) {
		this.cantInstrumentosNecesarios = cantInstrumentosNecesarios;
	}	
	
}