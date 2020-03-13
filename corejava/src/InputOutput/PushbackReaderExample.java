package InputOutput;
import java.io.*;
public class PushbackReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="this is an example of PushbackReader";
		StringReader stringReader=null;
		PushbackReader pushbackReader=null;
		try {
			stringReader=new StringReader(input);
			pushbackReader = new PushbackReader(stringReader,5);
			//read first character
			int ch=pushbackReader.read();
			System.out.println((char)ch);
			
			//push back first character
			pushbackReader.unread(ch);
			
			char[] c=new char[4];
			//get first four characters
			pushbackReader.read(c);
			System.out.println(c);
			
			//push back first four characters
			pushbackReader.unread(c,0,4);
			
			//read all characters
			c=new char[input.length()];
			pushbackReader.read(c);
			System.out.println(new String(c,0,input.length()));
			
			//pushbackReader.unread(c);
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				if(pushbackReader !=null) {
					pushbackReader.close();
				}
			}
				catch(IOException e) {
					System.out.println(e);
				}
			}
		}
	}


