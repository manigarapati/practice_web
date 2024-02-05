package Oops;

public final class Overriding extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.m11(2,3.4f);
		Overriding O = new Overriding();
		O.m11(8, 18.3f);
		Parent P = new Overriding();
		P.m11(23, 22.3f); // for regular method it will cal the run time Object reference
		P.m12("lohith", 24);// for static it will calls the class reference
		m12("loki", 25);
	}
	@Override
	public void m11(int a , float b) {
		System.out.println(a +"overriden class is executed" + b);
	}
	public static void m12(String s , int i) {
		System.out.println(s +"static is overhiding  in overrding method" + i);
	}

}
