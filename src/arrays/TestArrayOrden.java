package arrays;

import java.util.Arrays;

import modelo.Cliente;

public class TestArrayOrden {
	
	public static void main(String[] args) {
		
		String[] ss = {"uno", "dos", "tres", "cuatro", "cinco"};
		
		for(int i = 0; i< ss.length; i++) {
			System.out.println(ss[i]);
		}
		System.out.println();
		
	
		Arrays.sort(ss);
		
		
		for(int i = 0; i< ss.length; i++) {
			System.out.println(ss[i]);
		}
		System.out.println();
		
		
		Cliente c1 = new Cliente(1787, "Adriana", "Jimenez", "Perez");
		Cliente c2 = new Cliente(154, "Susana", "Jimenez", "Perez");
		Cliente c3 = new Cliente(16, "Pedro", "Alexis", "Perez");
		Cliente c4 = new Cliente(654, "juan", "Jimenez", "Perez");
		
		Cliente[] clis = {c1, c2, c3, c4};
		
		Arrays.sort(clis);
		
		for (int i = 0; i < clis.length; i++) {
			System.out.println(clis[i]);
		}
		
		
		
	}
	

}
