package Oops;

public class Child extends Parent {
	public static void main(String args[]){
		System.out.println("child Main method");
		m1();
		Parent.m2();
		Child c = new Child();
		c.m3();
		System.out.println("salary is"+c.salary);

		}


		public static void m1(){
		System.out.println("executed the method m1");
		}

		public void m3(){
		System.out.println("Object is created because their is no static in  method");
		System.out.println("length of the Name"+name.length());
		}

}
