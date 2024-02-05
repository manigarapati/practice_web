package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet h = new HashSet();
		h.add(100);
		h.add("lohith");
		h.add('a');
		h.add(10.00f);
		h.add(108);
		System.out.println(h.hashCode());
		
		
		List l = new ArrayList();
		l.add(100);
		l.add("mani");
		l.add('l');
		l.add(23);
		System.out.println(l);
		
		HashSet hh= new HashSet(l);
		System.out.println(hh);
		
		HashSet hhh = new HashSet(5,0.3f);
		hhh.add("garapati");
		hhh.add(200);
		hhh.add(102);
		hhh.add(200);
		hhh.add(102);
		System.out.println(hhh);
		
		
	}

}
