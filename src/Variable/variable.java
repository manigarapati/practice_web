package Variable;

public class variable extends Variable_types {
	static int y =100;
	int z= 300;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variable  v =  new variable();
		v.m1();
	}
	public void m1() {
		System.out.println(super.i);//either instance or static variable &
	// use by using the extends or implement  classes only 
		System.out.println(Variable_types.x); // only for static variable
		System.out.println(this.z);
		System.out.println(y);
	}

}
