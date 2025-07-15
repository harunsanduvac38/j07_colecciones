package sets;

import java.util.Set;
import java.util.TreeSet;

import modelo.Cliente;

public class Test01TreeSet {
	
	public static void main(String[] args) {
		
		
	
		Set<String> set = new TreeSet<String>();
	
		set.add("uno");
		set.add("dos");
		set.add("tres");
		set.add("cuatro");
		set.add("cinco");		
		set.add("AS");
		set.add("ZAPATO");
		set.add("Ávila");
		set.add("ágil");
		set.add("45");
		
		
		for(String s:set) {
			System.out.println(s);
		}
		
		
		Set<Integer> setNums = new TreeSet<Integer>();
		setNums.add(123);
		setNums.add(543);
		setNums.add(3);
		setNums.add(33);
		setNums.add(654);
		setNums.add(8888);
		
		for(Integer num : setNums) {
			System.out.println(num);
		}
		
		Cliente c1 = new Cliente(1787, "Adriana", "Jimenez", "Perez");
		Cliente c2 = new Cliente(154, "Susana", "Jimenez", "Perez");
		Cliente c3 = new Cliente(16, "Pedro", "Alexis", "Perez");
		Cliente c4 = new Cliente(654, "juan", "Jimenez", "Perez");
//		System.out.println(c1);
		
		Set<Cliente> setClis = new TreeSet<Cliente>();
		setClis.add(c1);
		setClis.add(c2);
		setClis.add(c3);
		setClis.add(c4);
		
		
		for(Cliente cli : setClis) {
			System.out.println(cli);
		}
		
	
	}
}
