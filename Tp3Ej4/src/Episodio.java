
public class Episodio {

	private String titulo;
	private String descripcion;
	private boolean visto;
	private double calificacion;
	
	public Episodio(String titulo, String descripcion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.visto = false;
		this.calificacion = -1; 
	} 
	
	/*Ingresar la calificación de un episodio. Si el valor ingresado como calificación
	no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior.*/
	
	public void calificarEpisodio(double calificacion) {
		if (0.0 <= calificacion && calificacion <= 5.0) {
			this.setCalificacion(calificacion);
			this.setVisto(true);
		}else {
			System.out.println("No se puede usar el valor " + calificacion + "para validar");			
		}
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isVisto() {
		return visto;
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
}
