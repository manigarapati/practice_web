package operators;

public class euality_operator {

	public static void main(String[] args) {
		
		String s = new String();
		String s1 = "lohith";
		/*
		 * if(s == s1) System.out.println("both are in same area"); else
		 * System.out.println("s1 is stored in heap area and s is stored in s");
		 */
		
		/*
		 * if(s.equals(s1) ) System.out.println("not double equality and used .equals");
		 * else System.out.println("s1 is stored in heap area and s is stored in s");
		 */
		String s2 = new String();
		/* System.out.println( s.equals(s2) ); */
		
		char c = 'a';
		int a = 97;
		System.out.println( c == a);
	}

}
