package operators;

public class InstanceOf_Operator {

	public static void main(String[] args) {
		String s = new String();
		Object o = new Object();
		System.out.println( s instanceof String);
		System.out.println(null instanceof String);
		System.out.println(o instanceof Object);
	}

}
