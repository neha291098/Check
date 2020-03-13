package InputOutput;

import java.io.*;
import java.io.IOException;


public class ReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			InputStreamReader reader=new FileReader("d:/java_bootcamp/data.txt");
			int data=reader.read();
			while(data!=-1) {//-1 when stream ends
				System.out.print((char)data);
				data=reader.read();
			}
			reader.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
