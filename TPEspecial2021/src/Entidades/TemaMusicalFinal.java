package Entidades;

import java.util.List;

public class TemaMusicalFinal extends TemaMusical {

	private int cantRestrictivoDeInterpretes;
	
	public TemaMusicalFinal(String titulo, String idioma, int cantRestrictivoDeInterpretes) {
		super(titulo, idioma);
		this.cantRestrictivoDeInterpretes = cantRestrictivoDeInterpretes;
	}
	
	@Override
	public boolean puedeInterpretarse(ElementoEquipo participante) {
		return super.puedeInterpretarse(participante) && this.cumpleCondicionCantInterpretes(participante);
	}
	
	private boolean cumpleCondicionCantInterpretes(ElementoEquipo participante) {
		List<String> instrumentosParticipante = participante.getInstrumentos();
		List<String> instrumentosNecesarios = this.getInstrumentosNecesarios();
		instrumentosParticipante.retainAll(instrumentosNecesarios);
		return instrumentosParticipante.size() >= this.getCantRestrictivoDeInterpretes();
	}

	public int getCantRestrictivoDeInterpretes() {
		return cantRestrictivoDeInterpretes;
	}

	public void setCantRestrictivoDeInterpretes(int cantRestrictivoDeInterpretes) {
		this.cantRestrictivoDeInterpretes = cantRestrictivoDeInterpretes;
	}	
	

}
