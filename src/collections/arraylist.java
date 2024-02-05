package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class arraylist {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		
		
		al.add(12);
		al.add("lohith");
		al.add('l');
		al.add(20.55f);
		al.add(true);
		System.out.println(al);
		System.out.println(al.size());
		
		
		LinkedList ll = new LinkedList(al);
		System.out.println("linkedlist " + ll);
		
		Vector v = new Vector(al);
		System.out.println("vector "  + v);
		
		ArrayList l=new ArrayList();
		
		l.add(12);
		l.add("add");
		System.out.println(l);
		
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(2, "replace");
		System.out.println(al);
		System.out.println(l.retainAll(al));
		System.out.println(al);
		System.out.println(l);
		System.out.println(al.size()  +  l.size());
		System.out.println(al.contains(12));
		System.out.println(al.containsAll(l));
		System.out.println(al.isEmpty());
		
		ArrayList a = new ArrayList();
		a.add(12);
		a.add(1);
		a.add(24);
		a.add(20);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		System.out.println(a.get(1));
		a.set(1, 20);
		System.out.println(a);
		
		ArrayList<student> s= new ArrayList<student>();
		s.add(new student(1," lohith"));
		s.add(new student(2,"mani"));
		s.add(new student(1,"as"));
		for(student S :s) {
			System.out.println(S.no + ""  + S.name);
		}
		
		}

}
