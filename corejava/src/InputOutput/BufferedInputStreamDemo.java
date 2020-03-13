package InputOutput;
import java.io.*;
public class BufferedInputStreamDemo {
	public static void main(String... ar)
	{
	try
	{
	FileInputStream fis= new FileInputStream("D:/java_bootcamp/test.txt");
	BufferedInputStream bis= new BufferedInputStream(fis); //A local buffer is created which is big-
								//enough to hold chunk of bytes read out of file TextBook.txt

	System.out.println("Bytes available to read = "+ bis.available());

	int c;
	while( (c=bis.read())!=-1) //reading local buffer(one byte at a time) until EOF is reached
	System.out.print((char)c);

	bis.close();
	fis.close();
	}
	catch(IOException e)
	{
	System.out.println(e);
	}

	}
}
