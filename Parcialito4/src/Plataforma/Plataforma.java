package Plataforma;

import java.util.ArrayList;
import java.util.List;

import Criterios.Criterio;
import Criterios.CriterioAND;
import Criterios.CriterioNOT;
import Criterios.CriterioOR;
import Criterios.CriterioPorActor;
import Criterios.CriterioPorAnioEstrenoMenor;
import Criterios.CriterioPorDirector;
import Criterios.CriterioPorDuracionMenor;
import Criterios.CriterioPorGenero;
import Criterios.CriterioPorTitulo;
import Criterios.CriterioRentabilidadComun;

public class Plataforma {

	private String nombre;
	private List<Pelicula> peliculas;
	private Criterio citerioDeRentabilidad;

	public Plataforma(String nombre) {
		super();
		this.nombre = nombre;
		this.peliculas = new ArrayList<Pelicula>();
		
		citerioDeRentabilidad = new CriterioRentabilidadComun();		
	}
	
	public boolean tienePelicula(Pelicula p) {
		return this.peliculas.contains(p);
	}
	
	public void setCriterioRentabilidad(Criterio nuevoCriterio) {
		this.citerioDeRentabilidad = nuevoCriterio;
	}
	
	public void addPelicula(Pelicula p) {
		if (!tienePelicula(p)) {
			if (citerioDeRentabilidad.cumple(p)) {
				this.peliculas.add(p);
			}
		}
	}
	
	private List<Pelicula> buscar(Criterio criterio){
		List<Pelicula> resultado = new ArrayList<Pelicula>();
		for(Pelicula pelicula : this.peliculas) {
			if (criterio.cumple(pelicula)) {
				resultado.add(pelicula);
			}
		}
		return resultado;		
	}
	
	//● Buscar todas las películas que en el título contenga la palabra “luna”.
	public List<Pelicula> buscarPorTitulo(String titulo){
		return buscar(new CriterioPorTitulo(titulo));
	}
	
	//● Buscar todas las películas que contengan un género específico (por ejemplo, “terror”).
	public List<Pelicula> buscarPorGenero(String genero){
		return buscar(new CriterioPorGenero(genero));
	}
	
	//● Buscar todas las películas en las que haya actuado Will Smith y cuyo director NO haya sido Martin Scorsese.
	public List<Pelicula> buscarPorActorYDirector(String actor, String director){
		Criterio c1 = new CriterioPorActor(actor);
		Criterio c2 = new CriterioPorDirector(director);
		return buscar(new CriterioAND(c1, c2));
	}
	
	//● Buscar todas las películas que se hayan grabado antes del 2015 y cuya duración sea menor a 95 minutos.
	public List<Pelicula> buscarPorAnioMenorYDuracionMenor(int anio, int duracion){
		Criterio c1 = new CriterioPorAnioEstrenoMenor(anio);
		Criterio c2 = new CriterioPorDuracionMenor(duracion);
		return buscar(new CriterioAND(c1, c2));
	}
	
	public List<Pelicula> buscarAnd(Criterio c1, Criterio c2){
		return buscar(new CriterioAND(c1, c2));
	}
	
	public List<Pelicula> buscarOr(Criterio c1, Criterio c2){
		return buscar(new CriterioOR(c1, c2));
	}
	
	public List<Pelicula> buscarNot(Criterio c1){
		return buscar(new CriterioNOT(c1));
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
