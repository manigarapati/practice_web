package String;

public class stringexample {
	public static void main(String[] args) {
		String s = "mani";
		String ss = s.concat("kanta");
		System.out.println(s);
		System.out.println(ss);
		
		StringBuffer sb= new StringBuffer("lohith");
		sb.append("Garapati");
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("dathatreya");
		sb1.append("Garapati");
		System.out.println(sb1);
		
		String s1 = "lohith";
		String s2 = "lohith";
		String s3 = new String("lohith");
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s2); //string will refer the scp(string constact pool area)
		System.out.println(s1 == s3);// new string will refers the heap area
	}
}
