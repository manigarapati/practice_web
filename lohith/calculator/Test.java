import java.util.Scanner;
public class Test  {
	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		
		Scanner s = new Scanner(System.in);
		for(;;){
		
		
		int operation = 0;
		do {
		System.out.println("Choose operation:");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Exit");
		operation=s.nextInt();
		if(operation == 5){
			System.exit(0);
		}
		if(operation<1 || operation>5){
			System.out.println("Invalid operation!!!");
		}	
		}
		while(operation<1 || operation>5);
		System.out.println("Enter the first number:");
		int num1=s.nextInt();	
		System.out.println("Enter the second number:");
		int num2=s.nextInt();
		float result=0F;
		switch(operation){
			case 1:	result = calculator.add(num1, num2);
				break;
			case 2: result = calculator.sub(num1, num2);
				break;
			case 3: result = calculator.multiply(num1, num2);
				break;
			case 4: result = calculator.divide(num1, num2);
				break;
			default: result = 0;
				
		}
		System.out.println("Result :  " +result);
		}

		
	}
}