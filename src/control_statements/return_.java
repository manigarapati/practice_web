package control_statements;

/*public class return_ {

	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		int q=sum();
		System.out.println(q);
		
	}
	public static Integer sum() {
		Integer a=10;
		Integer b=10;
		return a+b;
	}*/


class Employee{  
	 float salary=40000;  
	}  
	class Programmer extends Employee{  
	 int bonus=10000;  
	 public static void main(String args[]){  
	   Programmer p=new Programmer();  
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
	}
