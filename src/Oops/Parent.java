package Oops;

public class Parent {

	static String name ="Lohith";
	int salary =20000;
	public static void main(String args[]){
	System.out.println("parent Main method");
	m2();
	Child.m1();
	Child c = new Child();
	c.m3();
	}

	public static void m2(){
	System.out.println("executed the method m2");
	}
	public void m11(int a , float b) {
		System.out.println(a +"executed parent class" + b);
	}
	public static void m12(String s ,int i) {
		System.out.println(s + "static method is overhiding method" +i);
	}
		
	}


