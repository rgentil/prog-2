package Vivero;

/*
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
	(ascendente o descendente) de cualquiera de los atributos que se guardan de las plantas.
*/
public class MainVivero {

	public static void main(String[] args) {
		Vivero v1 = new Vivero("Las plantas verdes");

		Planta p1 = new Planta("Epipremnum aureum","Epipremnum","Interior","Araceae","Monocotyledoneae",2,6);
		p1.addNombreVulgar("potus");
		p1.addNombreVulgar("pothos");
		p1.addNombreVulgar("potos");
		
		Planta p2 = new Planta("Rosarios auereum rosarum","Crassula","Interior","Rosales","Rosacotaniedales",8,1);
		p2.addNombreVulgar("rosa");
		p2.addNombreVulgar("rosario");
		p2.addNombreVulgar("rosalinda");
		
		Planta p3 = new Planta("Limonerus Limonus","Limonera","","Limosna","Limonocluidena",1,1);
		p3.addNombreVulgar("Limon");
		p3.addNombreVulgar("pa el gancia");
		
		Planta p4 = new Planta("Dracaena trifasciata","Asparagaceae","Exterior","Dracaena trifasciata","Limonocluidena",6,3);
		p4.addNombreVulgar("lengua de suegra");
				
		v1.add(p1);
		v1.add(p2);
		v1.add(p3);
		v1.add(p4);
		
		System.out.println("Listado completo de plantas " + v1.getPlantas());
		
		//a) Todas las plantas cuyo nombre científico incluya la palabra “auereum”
		System.out.println("Nombre científico incluya la palabra 'auereum'" + v1.buscarPorNombre("auereum"));
		
		//b) Todas las plantas a las que se conozca vulgarmente como “lengua de suegra”
		System.out.println("Se conozca vulgarmente como 'lengua de suegra'" + v1.buscarPorNombreVulgar("lengua de suegra"));
		
		//c) Todas las plantas cuya clasificación sea “Crassula”
		System.out.println("Todas las plantas cuya clasificación sea 'Crassula'" + v1.buscarPorClasificacion("Crassula"));
		
		//d) Todas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3
		System.out.println("Requieran un nivel de sol superior a 5 y riego inferior a 3" + v1.buscarPorSolSuperiorAyRiegoInferiorA(5,3));
		
		//e) Todas las plantas que requieran un nivel de sol inferior a 4 y riego superior a 4
		System.out.println("Requieran un nivel de sol inferior a 4 y riego superior a 4" + v1.buscarPorSolInferiorAyRiegoSuperiorA(4,4));
		
		//f) Todas las plantas de interior que necesiten poco riego (inferior a 3)
		System.out.println("Plantas de interior que necesiten poco riego (inferior a 3)" + v1.buscarPorProsperaMejorPocoRiego("interior"));

		//g) Cualquier combinación lógica de las formas anteriores
		//???
	}

}
