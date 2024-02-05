package control_statements;

public class if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int j;
		
		for(i=1;i<10;i++) {
			for(j=i;j<10;j++) {
			if(i == 6|| j==7)	{
				continue;
			}
			System.out.println(i+""+j);
			}
		}
		
	}

}
