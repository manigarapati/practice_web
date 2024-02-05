package Oops;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading L = new Overloading();
		L.m1(1234d, 12);
		L.m1(12,12.00f );
	}
	public void m1(int a, float b) {
		System.out.println(a+b);
	}
	public void m1(double f , int i) {
		System.out.println(f*i);
	}

}
