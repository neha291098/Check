package InputOutput;

import java.io.*;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		String s = "testohh";
		char buf[] = new char[s.length()];
		s.getChars(0, s.length(), buf, 0);
                
		System.out.println(buf);		
		System.out.println(buf.length);	
		                
		CharArrayReader in = new CharArrayReader(buf);
		BufferedReader f = new BufferedReader(in);
		int c, d = 0;
		f.mark(s.length()+2);// won't work with s.length() as it has been 
								//parsed
								
		while ((c = f.read()) != -1) {
			System.out.println(c);
			d++;
		}
		System.out.println("d = " + d);
		
		f.reset();
		
	}
}
