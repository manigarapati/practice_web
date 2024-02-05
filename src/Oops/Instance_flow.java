package Oops;

public class Instance_flow {

	int i = 100;

	public static void main(String[] args) {
		System.out.println("main method()!!!");
		Instance_flow i = new Instance_flow();
		Instance_flow i2 = new Instance_flow();
		//Instance_flow i3 = new Instance_flow();
		 i.m1();
		 m2();
	}

	
	String s;

	{
		System.out.println("Inside the Instance block!!!");
	}
	static {
		System.out.println("static block");
	}
	public static void m2() {
		System.out.println("static method");
	}

	public void m1() {

		System.out.println("Inside the m1()!!");
	}

	Instance_flow(){
		System.out.println("Second Instance block!!!");
	}
	

}
