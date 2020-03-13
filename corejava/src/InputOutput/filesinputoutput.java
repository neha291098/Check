package InputOutput;
import java.io.*;
public class filesinputoutput
{
	public static void main(String[] args)
    {
	   String obj1  = "abc";
       byte b[] = obj1.getBytes();
       ByteArrayInputStream obj2 = new ByteArrayInputStream(b);
       for (int i = 0; i < 2; ++ i)
       {
           int c;
           while((c = obj2.read()) != -1)
           {
        	   if(i == 0)
               {
        	       System.out.print(Character.toUpperCase((char)c));
                   obj2.write(1); 
        	   }
           }
           System.out.print(obj2);
       }
    }
}