package Threads;

//Java program to illustrate yield() method

class MyThread1 extends Thread
{
 public void run()
 {
     for (int i=0; i<5 ; i++)
         System.out.println(Thread.currentThread().getName()
                             + " in control");
 }
}

//Driver Class
public class YieldDemo
{
 public static void main(String[]args)
 {
     MyThread1 t = new MyThread1();
     t.start();
     //Thread.yield();
     for (int i=0; i<5; i++)
     {
         // Control passes to child thread
         Thread.yield();

         // After execution of child Thread
         // main thread takes over
         System.out.println(Thread.currentThread().getName()
                             + " in control");
     }
 }
}
