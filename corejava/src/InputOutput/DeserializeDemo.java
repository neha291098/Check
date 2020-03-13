package InputOutput;
import java.io.*;
public class DeserializeDemo {
	 public static void main(String [] args)
	   {
	      Student e = null;
	      try
	      {
	         FileInputStream fileIn = new FileInputStream("d:/java_bootcamp/student.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         e = (Student) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return;
	      }
	      System.out.println("Deserialized Employee...");
	      System.out.println("Name: " + e.name);
	      System.out.println("Address: " + e.address);
	      System.out.println("SSN: " + e.ssn);
	      System.out.println("Number: " + e.number);
	    }
}
