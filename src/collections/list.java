package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<student> s= new ArrayList<student>();
		student s1 = new student(1,"lohith");
		student s2 = new student(2,"mani");
		s.add(new student(1," lohith"));
		s.add(new student(2,"mani"));
		s.add(new student(1,"as"));
		s.add(s1);
		s.add(s2);
		
		Iterator<student> itr = s.iterator();
		
		
		while(itr.hasNext()) {
			student st = (student)itr.next();
			System.out.println(st.no + "   " + st.name);
		}
		
		for(student S :s) {
			System.out.println(S.no + "  " + S.name);
	}
		
ArrayList<student> userList = new ArrayList();
		
		
		userList.add(new student(10, "test"));
		userList.add(new student(20,"test2"));
		
		for(student user : userList) {
			System.out.println(user.no + "  "  + user.name);
		}
	}
}


