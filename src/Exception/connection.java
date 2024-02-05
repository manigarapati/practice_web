package Exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.ConnectException;

public class connection {

	public static void main(String[] args) throws IOException {
		/*
		 * connection c = new connection(); c.getconnection();
		 */
		File f;
		FileWriter wr = null;
		try {
		 f = new File("E:\\checked.txt");
		 wr = new FileWriter(f);
		wr.write("we have to handle the exception");
		System.out.println(10/0);
		wr.close();
		}catch(Exception e) {
			System.out.println("value is not vaild" +e.toString());
			throw new IOException("value is not vaild" + e.getMessage());
		}
	}

	private void getconnection() {
		// TODO Auto-generated method stub
		
	}

}
