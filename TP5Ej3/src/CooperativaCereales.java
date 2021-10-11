public class CooperativaCereales {

	public static void main(String[] args) {
		Activo lote = new Lote(60);
		Activo cereal = new Cereal("Trigo",false);
		
		System.out.println(lote.sePuedeSembrar(cereal));
		
		
	}
}
