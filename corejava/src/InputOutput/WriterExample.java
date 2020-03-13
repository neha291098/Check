package InputOutput;

import java.io.*;

public class WriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Writer w=new FileWriter("d:/java_bootcamp/data.txt");
			String content="she sells sea shells in the sea";
			w.write(content);
			w.close();
			System.out.println("data written");
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
