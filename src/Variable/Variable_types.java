package Variable;
	
public class Variable_types {
	static int x = 200;
	int a = 20; // class or instance variable (inside the class & use any where in the class)
	int i = 20;
	public static void main(String args[]) {
	Variable_types v = new Variable_types();	
	v.m1();	
	}
	
	public  void m1() {
		int i1 = 10; // local variable (inside the method & use only in the method itself)
		System.out.println("local variable " + i +"instance variable"+ a);
		System.out.println(this.i); // only for class or static  variable
		System.out.println(x);
		System.out.println(variable.y);// we can use with extend or implement using class name only for static variable
		System.out.println();
		
	}
}