package Exception;

public class runtime_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runtime_stack r = new runtime_stack();
		r.m1();
		System.out.println("main method");
		
	}

	/*
	 * public static void m1() { m2(); System.out.println(" m1 method"); } public
	 * static void m2() { m3(); System.out.println(" m2 method"); } public static
	 * void m3() { System.out.println(" m3 method"); }
	 */
	public  void m1() {
		m2();
		System.out.println(" m1 method");
	}
	public  void m2() {
		m3();
		System.out.println(" m2 method");
	}
	public  void m3() {
		System.out.println(" m3 method");
	}
}
