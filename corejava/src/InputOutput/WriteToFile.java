package InputOutput;
import java.io.*;
public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer=new FileWriter("d:/java_bootcamp/names.txt",false);
			BufferedWriter bwr=new BufferedWriter(writer);
			bwr.write("james");
			bwr.newLine();
			bwr.write("hobert");
			bwr.close();
			//bwr.flush();
			System.out.println("successfully written to a file");
			
			
		}
		catch(IOException ioe) {
			System.out.println(ioe);
		}
	}

}
