package InputOutput;

import java.io.*;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			BufferedReader br=new BufferedReader(new FileReader("d:/java_bootcamp/countries.txt"));
			String line="";
			
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}	
			System.out.println("after reset"+line);
			br.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}

}
