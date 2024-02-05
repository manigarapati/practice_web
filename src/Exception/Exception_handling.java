package Exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exception_handling {

	public static void main(String[] args)  {
		File f;
		FileWriter wr = null;
		try {
		 f = new File("E:\\checked.txt");
		 wr = new FileWriter(f);
		wr.write("we have to handle the exception");
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				wr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		System.out.println("statement 1");
		try {
		System.out.println(10/0);
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(e.toString());
		}
		System.out.println("statement 3");
	}

}
