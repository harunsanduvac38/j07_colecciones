package sets;

import java.util.Set;
import java.util.TreeSet;

public class Test02OtroOrden {
	
	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>(new StringComparatorCantLetters());
		
		set.add("uno");
		set.add("dos");
		set.add("tres");
		set.add("cuatro");
		set.add("cinco");		
		set.add("AS");
		set.add("ZAPATO");
		set.add("Ávila");
		set.add("ágil");
		set.add("5");
		
		
		for(String s:set) {
			System.out.println(s);
		}
		
		
		
		
	}

}
