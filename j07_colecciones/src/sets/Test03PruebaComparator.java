package sets;

import java.util.Comparator;

public class Test03PruebaComparator {
	public static void main(String[] args) {
		Comparator<String> comp = new StringComparatorCantLetters();
		
		System.out.println(comp.compare("un string muyyy largo", "uno corto"));
	}

}
