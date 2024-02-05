package operators;

public class Arithematic_operators {

	public static void main(String args[]) {
		
		int a= 20;
		int b = 14;
		int c = 19;
		int d = 25;
		char ch = '@';
		System.out.println("addation is "+(a+b));
		System.out.println("subtraction is " +(a-b));
		System.out.println("multiplication is " +(a*b));
		System.out.println("division is " + (a/b));
		System.out.println("module is " +(a%b));
		System.out.println("checking order " + (a+b-a*b/a));
		System.out.println("checking order " + (a+b-c*d/a));
		System.out.println("char value is" + ch++);
		System.out.println(ch);
	}
}
