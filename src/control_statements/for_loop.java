package control_statements;

import java.util.ArrayList;
import java.util.List;

public class for_loop {

	public static void main(String[] args) {
		/*
		 * //User user1 = new User(1, "Raju"); //User user2 = new User(2, "Kumar");
		 * //User user3 = new User(3, "Raj");
		 * 
		 * List<User> userList = new ArrayList();
		 * 
		 * userList.add(new User(1, "Raju")); // userList.add(new User(1, "Raju"));
		 * userList.add(new User(1, "Raju"));
		 * 
		 * List<User> userList1 = new ArrayList(); userList1.add(new User(10, "test"));
		 * userList1.add(new User(20,"test2"));
		 * 
		 * for(User user : userList) { System.out.println(user); }
		 */

		/*
		 * int i ; for(i=0;i<=10;i++) System.out.println("i value is"+i);
		 */

		/*
		 * int i=0;
		 * for(System.out.println(i);i<=10;System.out.println("value of inc/dec is"+i))
		 * { i++; System.out.println("final value for condition loop is "+i);
		 * 
		 * }
		 */

		/*
		 * int m[]= {1,2,3,4,5}; for(int
		 * i=0;i<=m.length;System.out.println("array length"+m.length)) {
		 * System.out.println("array value"+m[i]); i++; }
		 */

		
		/*
		 * int a[] = {1,2,3,4,5}; char c[]= {'a','e','i','o','u'}; String s[] =
		 * {"mani","manu","lohith","garapati"}; for(String x : s)
		 * System.out.println("value is"+x);
		 */
		 
		int a[][]= {{10,20,30},{20,30,40}};
		
		for(int x:a[0])

			System.out.println(x);
	
	}
}
