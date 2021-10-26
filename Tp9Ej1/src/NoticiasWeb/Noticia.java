package NoticiasWeb;

import java.util.ArrayList;
import java.util.List;

import Filtros.Filtro;

//posee un título, un listado de palabras claves, una introducción, el texto, el autor, y un link asociado.
public class Noticia extends ElementoWeb {

	private String titulo;
	private List<String> palabrasClave;
	private String introducion;
	private String texto;
	private String autor;
	private String link;
	
	public Noticia(String titulo, String introducion, String texto, String autor, String link) {
		super();
		this.titulo = titulo;
		this.introducion = introducion;
		this.texto = texto;
		this.autor = autor;
		this.link = link;
		this.palabrasClave = new ArrayList<String>();
	}
	
	public boolean tienePalabraClave(String palabraClave) {
		return this.palabrasClave.contains(palabraClave);
	}
	
	public void addPalabraClave(String palabraClave) {
		if (!tienePalabraClave(palabraClave)) {
			this.palabrasClave.add(palabraClave);
		}
	}
	
	public List<String>getCopiaPalabrasClave(){
		return new ArrayList<String>(this.palabrasClave);
	}
	
	@Override
	public int getCantNoticias() {
		return 1;
	}	
	
	@Override
	public ElementoWeb copia() {
		Noticia noticia =  new Noticia(this.getTitulo(), this.getIntroducion(), this.getTexto(), this.getAutor(), this.getLink());
		for (String p : this.palabrasClave) {
			noticia.addPalabraClave(p);
		}
		return noticia;
	}
	
	@Override
	public ElementoWeb copia(Filtro filtro) {
		if (filtro.cumple(this)) {
			Noticia noticia =  new Noticia(this.getTitulo(), this.getIntroducion(), this.getTexto(), this.getAutor(), this.getLink());
			for (String p : this.palabrasClave) {
				noticia.addPalabraClave(p);
			}
			return noticia;
		}
		return null;
	}
	
	@Override
	public List<Noticia> buscarNoticia(Filtro f) {
		List<Noticia> aux = new ArrayList<Noticia>();
		if (f.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}
	
	@Override
	public List<String> listar() {
		List<String> aux = new ArrayList<>();
		aux.add(this.getLink() + "\n");
		return aux;
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Noticia not = (Noticia) o;
			return this.getAutor().equals(not.getAutor()) &&
					this.getTexto().equals(not.getTexto()) &&
					this.getTitulo().equals(not.getTitulo()) &&
					this.getIntroducion().equals(not.getIntroducion()) &&
					this.getLink().equals(not.getLink());	
		} catch (Exception e) {
			return false;
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIntroducion() {
		return introducion;
	}

	public void setIntroducion(String introducion) {
		this.introducion = introducion;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
