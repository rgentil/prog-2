
public class MainElectrodomestico {

	public static void main(String[] args) {
		
		Electrodomestico e1 = new Electrodomestico();
		e1.setNombre("TV");
		e1.setPrecioBase(250000.0);
		e1.setConsumoEnergetico(50000);
		
		System.out.println(e1.calcularBalance());
		System.out.println(e1.isAltaGama());
		System.out.println(e1.isBajoConsumo());
		
		Electrodomestico e2 = new Electrodomestico("Radio", 45.90);
		System.out.println(e2.calcularBalance());
		System.out.println(e2.isAltaGama());
		System.out.println(e2.isBajoConsumo());		

	}

}
