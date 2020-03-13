package InputOutput;

import java.io.*;

public class InputStringFileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStream is=new FileInputStream("d:/java_bootcamp/"
					+ "countries.txt");
			OutputStream os=new FileOutputStream("d:/java_bootcamp/"
					+ "countries_copy.txt");
			System.out.println(is.available());
			  byte[] buffer = new byte[1024];
	            int bytesRead;
	            //read from is to buffer
	            while((bytesRead = is.read(buffer)) !=-1){
	                os.write(buffer, 0, bytesRead);
	            }
	            System.out.println("File Copied");
			

	            is.close();
	            //flush OutputStream to write any buffered data to file
	            os.flush();
	            os.close();
	        } 
		catch (IOException e) {
	            e.printStackTrace();      
	            }   
		}
	}