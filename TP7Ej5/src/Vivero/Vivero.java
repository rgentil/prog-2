package Vivero;

import java.util.ArrayList;
import java.util.List;

import Criterios.Criterio;
import Criterios.CriterioAND;
import Criterios.CriterioNOT;
import Criterios.CriterioPorClasificacion;
import Criterios.CriterioPorNombre;
import Criterios.CriterioPorNombreVulgar;
import Criterios.CriterioPorProsperaMejor;
import Criterios.CriterioPorRiegoSuperior;
import Criterios.CriterioPorSolSuperior;

/*
5 - Vivero
Un vivero necesita un sistema que le permita cargar fichas de las diferentes plantas que
vende. Cada planta posee un nombre científico, una lista de nombres vulgares, una
clasificación superior, una familia y una clase. Las plantas pueden prosperar mejor en interior
o en exterior, tienen un requerimiento de sol que se indica con un número entero del 1 al 10
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

El sistema debe ser útil para los administradores del vivero para, por ejemplo, cuando llega
un cliente poder ofrecerle las plantas que cumplen con sus requerimientos:
a) Todas las plantas cuyo nombre científico incluya la palabra “auereum”
b) Todas las plantas a las que se conozca vulgarmente como “lengua de suegra”
c) Todas las plantas cuya clasificación sea “Crassula”
d) Todas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3
e) Todas las plantas que requieran un nivel de sol inferior a 4 y riego superior a 4
f) Todas las plantas de interior que necesiten poco riego (inferior a 3)
g) Cualquier combinación lógica de las formas anteriores
Los listados anteriores se deben retornar ordenados por el criterio de preferencia de cada
cliente. Por ejemplo, un cliente puede estar interesado en “crassulas”, ordenadas por el nivel
de sol requerido (primero las que requieran más sol), y si hay varias que requieren el mismo
nivel de sol, las que requieran menos agua deben mostrarse primero y, finalmente, por orden
alfabético del nombre científico. El cliente puede proporcionar un criterio de orden
(ascendente o descendente) de cualquiera de los atributos que se guardan de las plantas. */
public class Vivero {

	public static final int POCO_RIEGO = 3;
	
	private String nombre;
	List<Planta> plantas;

	public Vivero(String nombre) {
		this.nombre = nombre;
		this.plantas = new ArrayList<>();
	}

	private List<Planta> buscar(Criterio c) {
		ArrayList<Planta> resultado = new ArrayList<>();
		for (Planta planta : plantas) {
			if (c.cumple(planta) && !resultado.contains(planta) ){
				resultado.add(planta);
			}
		}
		return resultado;
	}

	// a) Todas las plantas cuyo nombre científico incluya la palabra “auereum”
	public List<Planta> buscarPorNombre(String nombre){
		return buscar(new CriterioPorNombre(nombre));
	}
	
	//b) Todas las plantas a las que se conozca vulgarmente como “lengua de suegra”
	public List<Planta> buscarPorNombreVulgar(String nombre){
		return buscar(new CriterioPorNombreVulgar(nombre));
	}
	
	//c) Todas las plantas cuya clasificación sea “Crassula”
	public List<Planta> buscarPorClasificacion(String nombre){
		return buscar(new CriterioPorClasificacion(nombre));
	}
	
	//d) Todas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3
	public List<Planta> buscarPorSolSuperiorAyRiegoInferiorA(int sol, int riego){
		Criterio porSol =  new CriterioPorSolSuperior(sol);
		Criterio porRiego = new CriterioNOT(new CriterioPorRiegoSuperior(riego));
		return buscar(new CriterioAND(porSol,porRiego));
	}

	//e) Todas las plantas que requieran un nivel de sol inferior a 4 y riego superior a 4
	public List<Planta> buscarPorSolInferiorAyRiegoSuperiorA(int sol, int riego){
		Criterio porSol =  new CriterioNOT(new CriterioPorSolSuperior(sol));
		Criterio porRiego = new CriterioPorRiegoSuperior(riego);
		return buscar(new CriterioAND(porSol,porRiego));
	}
	
	//f) Todas las plantas de interior que necesiten poco riego (inferior a 3)
	public List<Planta> buscarPorProsperaMejorPocoRiego(String prospera){
		Criterio prosperaMejor = new CriterioPorProsperaMejor(prospera);
		Criterio porRiego = new CriterioNOT(new CriterioPorRiegoSuperior(POCO_RIEGO));
		return buscar(new CriterioAND(prosperaMejor,porRiego));
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Planta> getPlantas() {
		return new ArrayList<Planta>(plantas);
	}

	public void add(Planta planta) {
		this.plantas.add(planta);
	}

}
