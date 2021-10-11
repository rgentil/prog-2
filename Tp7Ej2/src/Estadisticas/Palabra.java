package Estadisticas;

public class Palabra implements Comparable<Palabra>	{

	private String nombre;
	private int cantOcurrencia;
	
	public Palabra(String nombre, int cantOcurrencia) {
		super();
		this.nombre = nombre;
		this.cantOcurrencia = cantOcurrencia;
	}
	
	public Palabra(String nombre) {
		super();
		this.nombre = nombre.toUpperCase();
		this.cantOcurrencia = 1;
	}
	
	public void masUna() {
		this.cantOcurrencia ++;
	}
	
	@Override
	public boolean equals(Object p) {
		try {
			return this.getNombre().equals( ((Palabra)p).getNombre() );
		}catch(Exception e){
			return false;
		} 
	}
	
	@Override
	public int compareTo(Palabra p) {
		return this.getNombre().compareTo(p.getNombre());
	}
	
	@Override
	public String toString() {
		return "\nPalabra = " + this.getNombre() + " Cantidad de ocurrencias = " + this.getCantOcurrencia() ;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantOcurrencia() {
		return cantOcurrencia;
	}
	
	public void setCantOcurrencia(int cantOcurrencia) {
		this.cantOcurrencia = cantOcurrencia;
	}
}
