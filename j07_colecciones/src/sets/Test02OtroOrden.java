package sets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test02OtroOrden {
	
	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>(new StringComparatorCantLetters());
//										TreeSet(Comparator) 
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
		
//		Ordena por largo de la palabra de mayor a menor
		Set<String> set2 = new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o2.length() - o1.length(); 
			}
		});
		
//		cargar el set02 con los valores que tiene cargado set
		
		set2.addAll(set);
		
		for (String s : set2) {
			System.out.println(s);
		}
		
		
		
	}

}
