package Oops;

public class Testencapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation acc=new Encapsulation();  
	    //setting values through setter methods  
	    acc.setAcc_no(7560504000L);  
	    acc.setName("Sonoo Jaiswal");  
	    acc.setEmail("sonoojaiswal@javatpoint.com");  
	    acc.setAmount(500000f);  
	    //getting values through getter methods  
	    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount()); 
	}

}
