package InputOutput;
import java.io.*;
public class DataIoDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		DataInputStream d=new DataInputStream(new FileInputStream("d:"
				+ "/java_bootcamp/test.txt"));
		DataOutputStream out=new DataOutputStream(new FileOutputStream("d:"
				+ "/java_bootcamp/test1.txt"));
		String count;
		while((count=d.readLine())!=null) {
			String u=count.toUpperCase();
			System.out.println(u);
			out.writeBytes(u+",");
			d.close();
			out.close();
		}
		
	}

}
