package InputOutput;

import java.io.*;

public class PushbackReaderDemo {
	 public static void main(String[] args) throws IOException
	    {
	        byte[] array = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
	        PushbackReader reader = new PushbackReader(new InputStreamReader(new ByteArrayInputStream(array)), array.length); // LINE A
	        int j;
	        while((j = reader.read()) != -1) 
	        {
	            System.out.print((char)j);    
	        }
	        
	        for(int i = 0; i < array.length; i++)
	        {
	            reader.unread((int)(array[i])); 
	        }
	        
	        System.out.println();
	        j = 0;
	        while((j = reader.read()) != -1)
	        {
	            System.out.print((char)j);    
	        }
	        reader.close(); 
	    }
}
