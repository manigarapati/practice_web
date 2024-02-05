package Arrays;



public class Array {
	int i[] = {1,2,3,4,5,5};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[][] = { {1,2,3,4,5,5},{1,2,3}};
		Array x= new Array();
		sum(i);
		System.out.println(i[1].length);
	}

	
	
	public static void sum(int a[][]) {
		int t = 0;
		for(int a1 : a[1]) {
			t=t+a1;
			System.out.println(t);
		}
	}
	
	

}
