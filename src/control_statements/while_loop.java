package control_statements;

public class while_loop {

	public static void main(String args[]) {
		
		// TODO Auto-generated constructor stub
		/*
		 * int i=1; while(i<=10) { System.out.println(i);
		 * 
		 * i++; }
		 */
			
	/*
	 * do { if(i == 4) { i++; continue; }
	 * System.out.println("dowhile is executed"+i); i++; } while(i<=10);
	 */
	/*
	 * int i = 0;
	 * 
	 * while(i<=4) {
	 * 
	 * for(int j = i;j<=4;j++) { System.out.println("i  value is"+i);
	 * System.out.println("j value is" +j); } i++; }
	 */
	
	  int i = 0; 
	  do {
		  
	  System.out.println("i value is"+i++); 
	  
	  for(int j = i;j<=4;j++) {
		  
		  if(i== 2 && j == 3) {
			  System.out.println("continue executed sucessfully");
			  continue;
		  }
	  
	  System.out.println("j value is" +i  +j); }
	  
	  } while(i<=5);
	 
		
	

}
}
