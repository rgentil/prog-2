package NoticiasWeb;

import java.util.ArrayList;
import java.util.List;

import Filtros.Filtro;

public class Categoria extends ElementoWeb {

	private String nombre;
	private String descripcion;
	private String imagen;
	private List<ElementoWeb> elementos;
	
	public Categoria(String nombre, String descripcion, String imagen) {
		this.setNombre(nombre);
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.elementos = new ArrayList<ElementoWeb>();
	}
	
	public boolean tieneElemento(ElementoWeb e) {
		return this.elementos.contains(e);
	}
	
	public void addElemento(ElementoWeb e) {
		if(!tieneElemento(e)) {
			this.elementos.add(e);
		}
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Categoria cat = (Categoria) o;
			return this.getDescripcion().equals(cat.getDescripcion()) && this.getImagen().equals(cat.getImagen());	
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public int getCantNoticias() {
		int aux = 0;
		for (ElementoWeb elementoWeb : elementos) {
			aux += elementoWeb.getCantNoticias();
		}
		return aux;
	}
	
	public boolean tieneElementos() {
		return !this.elementos.isEmpty();
	}
		
	@Override
	public ElementoWeb copia() {
		Categoria copia = new Categoria(this.getNombre(), this.getDescripcion(),this.descripcion);
		for (ElementoWeb elementoWeb : elementos) {
			copia.addElemento(elementoWeb.copia());
		}
		return copia;
	}
	
	@Override
	public ElementoWeb copia(Filtro filtro) {
		//Creo lo que voy a devolver si alguno de mis hijos cumple la condicion
		Categoria copia = new Categoria(this.getNombre(), this.getDescripcion(),this.descripcion);
		
		//Recorre mis hijos
		for (ElementoWeb elementoWeb : elementos) {
			//Consulto para cada metodo copia con el filtro
			ElementoWeb aux = elementoWeb.copia(filtro);
			
			///si alguno cumple
			if (aux != null) {
				//le agrego a la copia el elemento
				copia.addElemento(aux);
			}
			//y si tiene elementos la copia la devuelvo, sino null
			if (copia.tieneElementos()) {
				return copia;
			}			
		}
		return null;
	}
	
	@Override
	public List<Noticia> buscarNoticia(Filtro f) {
		List<Noticia> aux = new ArrayList<Noticia>();
		for (ElementoWeb elementoWeb : elementos) {
			aux.addAll(elementoWeb.buscarNoticia(f));
		}
		return aux;
	}
	
	@Override
	public List<String> listar() {
		List<String> aux = new ArrayList<>();
		aux.add(this.getNombre() + "\n");
		for (ElementoWeb elementoWeb : elementos) {
			List<String> n = elementoWeb.listar();
			for(String s:n) {
				 aux.add(this.getNombre() + "/" + s + "\n");
			}
		}
		return aux;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
