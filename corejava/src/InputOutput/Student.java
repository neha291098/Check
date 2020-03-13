package InputOutput;
import java.io.*;
public class Student implements Serializable{
	public String name;
	public String address;
	public transient int ssn;
	public int number;
	public void mailCheck() {
		System.out.println("mailing a check to "+name+" "+address);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.name="Michael Khan";
		s.address="Castle street, bangalore";
		s.ssn=11122333;
		s.number=101;
		try {
			FileOutputStream fileOut=new FileOutputStream("d:/java_bootcamp/student.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(s);
			out.close();
			fileOut.close();
			System.out.println("serialized data saved in student");
		}
		catch(IOException i) {
			System.out.println(i);
		}
	}

}
