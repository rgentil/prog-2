import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
	
	/*
	Atributos: nombre, edad, fecha de nacimiento, DNI, sexo, peso y altura
	*/
	
	private String nombre;
	private String apellido;
	private int edad;
	private LocalDate fechaNacimiento;
	private int DNI;
	private String sexo;
	private double peso;
	private double altura;
	
	/*Valores por defecto:
		● El DNI es un valor obligatorio, no posee valor por defecto.
		● En caso de la fecha de nacimiento será el 1 de enero de 2000.
		● Sexo será Femenino por defecto.
		● El nombre por defecto es N y el apellido es N.
		● El peso y la altura son 1 por defecto.
		Acorde a lo anterior se deben crear los constructores. Con DNI, con DNI nombre y
		apellido, con DNI nombre apellido y Fecha de nacimiento.....
	*/
	
	public Persona(int DNI){
		this.DNI = DNI;
		this.fechaNacimiento = LocalDate.of(2000,1,1);
		this.edad = this.getAnios(this.fechaNacimiento);
		this.sexo = "Femenino";
		this.nombre = "N";
		this.apellido = "N";
		this.peso = 1.0;
		this.altura = 1.0;		
	}
	
	public Persona(int DNI, String nombre, String apellido){
		this(DNI);
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Persona(int DNI, String nombre, String apellido, LocalDate fechaNacimiento){
		this(DNI, nombre, apellido);
		this.fechaNacimiento = fechaNacimiento;
	}
	
	/*
	La responsabilidad de la clase es la siguiente:
	*/
	
	public double getIndiceMazaCorpora(){
		/* Cálculo del índice de masa Corporal. Una persona sabe calcular cuál es su índice de masa corporal el cual es peso / altura 2*/
		return this.peso / (this.altura * this.altura);
	}
	
	public boolean estaEnForma(){
		/*
		Saber si está en forma. Está en forma si el índice de masa corporal se encuentra
		entre 18,5 y 25 (esto es solo un ejemplo para probar la funcionalidad).
		*/
		double indice1 = (double) 18.5;
		double indice2 = (double) 25.0;
		double im = this.getIndiceMazaCorpora();
		int resultado1 = this.comparar(indice1,im);
		int resultado2 = this.comparar(im,indice2);
		return resultado1 == 1 && resultado2 == 1;
	}
	
	private int comparar(double f1, double f2){
		int resultado = 0;
		if (f1 == f2) {
			resultado = 0;
		}
		else {
			if (f1 < f2) {
				resultado = 1;
			}
			else {
				if (f1<f2) {
					resultado = 2;
				}
			}
		}	
		return resultado;
	}
	
	public boolean isBirthDay(){
		/*Saber si está cumpliendo años.*/
		LocalDate hoy = LocalDate.now();
		Period period = Period.between(this.getFechaNacimiento(), hoy);
		
		String dateString = this.getFechaNacimiento().format(DateTimeFormatter.ofPattern("dd MM yyyy"));
		
		String hoyString = hoy.format(DateTimeFormatter.ofPattern("dd MM yyyy"));
		
		System.out.println("Fecha de nacimiento: "  + dateString + ". Hoy es " + hoyString );
		return (period.getYears() == 0);
	}
	
	public boolean esMayorDeEdad(){
		//Saber si es mayor de edad. Una persona es mayor de edad si es mayor de 18 años
		return this.getAnios(this.fechaNacimiento) >= 18;
	}
	
	private int getAnios(LocalDate fecha){
		LocalDate hoy = LocalDate.now();
		Period period = Period.between(fecha, hoy);
		return period.getYears();
	}
	
	public boolean puedeVotar(){
		//Saber si puede votar. Es necesario ser mayor de 16 años.
		return this.getAnios(this.fechaNacimiento) >= 16;
		
	}
	
	public boolean tieneCoorencia(){
		//Saber si es coherente. Que la fecha de nacimiento coincida con la edad.
		return this.edad == this.getAnios(this.fechaNacimiento);
	}
	
	public String getInfo(){
		/*Mostrar toda la información del objeto. Es decir devolver un String con la información del mismo.*/
		String info = " Nombre: " + this.getNombre() + " Apellido: " + this.getApellido() + " Edad: " + this.getEdad() +
				   " Fecha Nacimiento: " + this.getFechaNaciomientoString() + " Sexo: " + this.getSexo() + " Peso: " + this.getPeso() + " Altura: " + this.getAltura();
		return info;
	}
	
	/*Métodos set de cada parámetro, excepto de DNI.*/
	
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getFechaNaciomientoString() {
		return this.getFechaNacimiento().format(DateTimeFormatter.ofPattern("dd MM yyyy"));
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getDNI() {
		return DNI;
	}
	


}
