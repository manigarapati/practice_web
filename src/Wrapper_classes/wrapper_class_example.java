package Wrapper_classes;

public class wrapper_class_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i= new Integer(0);
		Integer i1= new Integer("10");
		//Integer i2= new Integer("hello");// String NumberFormatException.java:67 
		System.out.println(i);
		Float f= new Float(10);
		Float f1= new Float("10.0f");
		Float f2= new Float("10.00D");
		System.out.println(f);
		System.out.println(f1);
		System.out.println(f2);
		
		Character c = new Character('p');
		System.out.println(c);
		
		Boolean b = new Boolean(true);
		Boolean b1 = new Boolean("hi"); // what ever you write default value is false
		System.out.println(b);
		System.out.println(b1);
	}

}
