package Wrapper_classes;

public class UtilityTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Valueof(); =-= primitive types to wrapper classes object type
		Integer i = Integer.valueOf(10);
		Integer i1=Integer.valueOf("120");
		Character ch = Character.valueOf('p');
		Boolean b = Boolean.valueOf(true);
		System.out.println(ch);
		System.out.println(i);
		System.out.println(b);
		
		// Typevalue(); =-= wrapper class object type to primitive type
		int I = i.intValue();
		System.out.println(I);
		char c=ch.charValue();
		boolean bb = b.booleanValue();
		System.out.println(c +"   "+ bb);
		System.out.println(i1.shortValue());
		
		
		// tostring =-= wrapper class object type to string value
		String s=i.toString();
		System.out.println("  hi  " +s);
		String ss=b.toString();
		
		
		System.out.println(ss);
		
		String s1=Integer.toString(I);
		System.out.println(s1);
		
		//parseType =-= string objct to data type
		
		int i5 = Integer.parseInt(s1);
		System.out.println(i5);
	}

}
