package Vivero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Cada planta posee 
un nombre científico, 
una lista de nombres vulgares, 
una clasificación superior, 
una familia 
y una clase. 
Las plantas pueden prosperar mejor en interior o en exterior, 
tienen un requerimiento de sol que se indica con un número entero del 1 al 10
(1 para sombra, hasta 10 para sol pleno) y un requerimiento de agua que se indica de la
misma manera (1 para riesgo escaso y 10 para riego abundante).
Por ejemplo:
Nombre Científico: Epipremnum aureum
Nombres vulgares: potus, pothos o potos
Clasificación superior: Epipremnum
Familia: Araceae

Clase: Monocotyledoneae
Planta de interior
Riego: 3
Sol: 4
*/
public class Planta implements Comparable<Planta> {
	private String nombreCientifico;
	private List<String> nombreVulgares;
	private String clasificacionSuperior;
	private String prosperaMejor;//Interio, exterior, indefinido o vacio
	private String familia;
	private String clase;
	private int riego;
	private int sol;
	
	public Planta(String nombreCientifico, String clasificacionSuperior, String prosperaMejor, String familia, String clase, int sol,int riego) {
		this.nombreCientifico = nombreCientifico;
		this.nombreVulgares = new ArrayList<>();
		this.clasificacionSuperior = clasificacionSuperior;
		this.prosperaMejor = prosperaMejor;
		this.familia = familia;
		this.clase = clase;
		this.riego = riego;
		this.sol = sol;
	}

	@Override
	public int compareTo(Planta o) {
		return this.nombreCientifico.compareTo(o.getNombreCientifico());
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Planta p = (Planta)o;
			return clase.equals(p.clase) && clasificacionSuperior.equals(p.clasificacionSuperior)
					&& familia.equals(p.familia) && nombreCientifico.equals(p.nombreCientifico);
		} catch (Exception e) {
			return false;	
		}
	}

	@Override
	public String toString() {
		return "\nPlanta [nombreCientifico=" + nombreCientifico + ", nombreVulgares=" + nombreVulgares
				+ ", clasificacionSuperior=" + clasificacionSuperior + ", Prospera mejor=" + prosperaMejor + ", familia=" + familia + ", clase=" + clase
				+ ", sol=" + sol + ", riego=" + riego + "] \n";
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public boolean contieneNombreVulgar(String filtro) {
		for (String nombre : this.nombreVulgares) {
			if (nombre.equals(filtro)){
				return true;
			}
		}		
		return false;
	}
	
	private List<String> listaVulgaresOrdenados(){
		List<String> resultado = new ArrayList<>(this.nombreVulgares);
		Collections.sort(resultado);
		return resultado;
	}
	
	public int compararListaVulgares(Planta p1) {
		List<String> lnv1 = this.listaVulgaresOrdenados();
		List<String> lnv2 = p1.listaVulgaresOrdenados();		
		int aux = 0;
		for (String n1 : lnv1) {
			for (String n2 : lnv2) {
				aux = n1.compareTo(n2);
				if (aux != 0) {
					return aux;
				}
			}
		}
		return aux;
	}
	
	public void addNombreVulgar(String nombreVulgare) {
		this.nombreVulgares.add(nombreVulgare);
	}

	public String getClasificacionSuperior() {
		return clasificacionSuperior;
	}

	public void setClasificacionSuperior(String clasificacionSuperior) {
		this.clasificacionSuperior = clasificacionSuperior;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getRiego() {
		return riego;
	}

	public void setRiego(int riego) {
		this.riego = riego;
	}

	public int getSol() {
		return sol;
	}

	public void setSol(int sol) {
		this.sol = sol;
	}

	public String getProsperaMejor() {
		return prosperaMejor;
	}

	public void setProsperaMejor(String prosperaMejor) {
		this.prosperaMejor = prosperaMejor;
	}
	
}
