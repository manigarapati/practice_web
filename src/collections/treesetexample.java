package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;



public class treesetexample extends Linkedhashsetexample {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>(new ComparatorImpl());
		t.add(200);
		t.add(101);
		t.add(12);
		t.add(201);
		t.add(124);
		System.out.println(t);
		TreeSet<Integer> tt = new TreeSet<>(new ComparatorImpl());
		tt.add(201);
		tt.add(222);
		tt.add(12);
		tt.add(1);
		tt.add(300);
		System.out.println(tt);
		
		ArrayList a = new ArrayList();
		a.add(100);
		a.add(12);
		a.add(123);
		System.out.println(a);
		TreeSet<Integer> ttt = new TreeSet<>(new ComparatorImpl());
		ttt.addAll(a);
		System.out.println(ttt);
	}
}
 class ComparatorImpl implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		
		//return i1.compareTo(i2);
		return i2.compareTo(i1);
	}
	
}
