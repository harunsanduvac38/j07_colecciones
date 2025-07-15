package sets;

import java.util.Set;
import java.util.TreeSet;

import modelo.Cliente;

public class Test04ComparatorCliente {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(1787, "Adriana", "Jimenez", "Perez");
		Cliente c2 = new Cliente(154, "Susana", "Garcia", "Mirando");
		Cliente c3 = new Cliente(16, "Pedro", "Tralexis", "Pinto");
		Cliente c4 = new Cliente(654, "Juan", "Vacis", "Lopez");
		Cliente c5 = new Cliente(200, "Adriana", "Jimenez", "Perez");

		
		Cliente[] clis = {c1, c2, c3, c4};
		
		Set<Cliente> set = new TreeSet<Cliente>();
		
		set.add(c1);
		set.add(c2);
		set.add(c3);
		set.add(c4);
		set.add(c5);
		
		
		for (Cliente cliente: set) {
			System.out.println(cliente);
		}
		
		System.out.println("------");
		
		Set<Cliente> set02 = new TreeSet<Cliente>(Cliente.getComparatorApellidos());
		set02.addAll(set);
		
		for (Cliente cliente : set02) {
			System.out.println(cliente);

		}
		System.out.println();
		
		
	}

}
