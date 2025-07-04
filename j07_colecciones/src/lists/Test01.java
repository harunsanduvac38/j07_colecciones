package lists;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	
	public static void main(String[] args) {
		
		List<String> lista1 = new ArrayList<String>();
		lista1.add("uno");
		lista1.add("dos");
		lista1.add("tres");
		lista1.add("cuatro");
		lista1.add("cinco");
		lista1.add("seis");
		lista1.add("siete");
		
		System.out.println(lista1.get(3));
		System.out.println(lista1.get(5));
		
	}

}
