package collections;

import java.util.LinkedHashSet;

public class Linkedhashsetexample {
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs= new LinkedHashSet<>();
		lhs.add(100);
		lhs.add(100);
		lhs.add(200);
		lhs.add(200);
		lhs.add(12);
		lhs.add(393);
		lhs.add(983);
		System.out.println(lhs);
	}
}
