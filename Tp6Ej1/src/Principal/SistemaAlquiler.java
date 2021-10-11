package Principal;
import java.util.ArrayList;

import Productos.Item;
import Sistema.Cliente;

public class SistemaAlquiler {

	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public void mostrarDeudores() {
		ArrayList<Cliente> clientesDeudores = this.getClientesDeudores();
		System.out.println("Cientes deudores: ");
		System.out.println("-----------------------------------------------------------------");
		if (clientesDeudores.size() < 1) {
			System.out.println("NO SE REGISTRAN");
		}else {
			for (Cliente cliente : clientesDeudores) {
				System.out.println(cliente.getNombre());
			}
		}
	}
	
	public ArrayList<Cliente> getClientesDeudores(){
		ArrayList<Cliente> clientesDeudores = new ArrayList<Cliente>();
		for (Cliente cliente : clientes) {
			if (cliente.tieneDeudas()) {
				clientesDeudores.add(cliente);
			}
		}
		return clientesDeudores;		
	}	
	
	public void alquilar(Cliente c, Item i) {
		c.alquilar(i);
	}
	
	public void devolver(Cliente c, Item i) {
		c.devolver(i);
	}
	
}
