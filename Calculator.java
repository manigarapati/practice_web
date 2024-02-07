package example;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		for(;;) {
			int operation=0;
		    do {
				System.out.println("Choose the Opertion");
				System.out.println("1.Addition");
				System.out.println("2.Subtraction");
				System.out.println("3.Multiplication");
				System.out.println("4.Division");
				System.out.println("5.Exit");
				operation=s.nextInt();
				if(operation == 5) System.exit(0);
				if(operation<=0 || operation>5) System.out.println("Invaild operation !!!");
			    }
			    while(operation<0 || operation>5);
					System.out.println("Enter First Number :");
					int num1=s.nextInt();
					System.out.println("Enter second Number :");
					int num2=s.nextInt();
					
					switch(operation) {
						case 1: System.out.println(num1+num2);
						break;
						case 2: System.out.println(num1-num2);
						break;
						case 3: System.out.println(num1*num2);
						break;
						case 4: System.out.println(num1/num2);
						break;
					}
			}
		

	}

}
