package Threads;

class Count implements Runnable{
	Thread mythread;
	Count(){
		mythread=new Thread(this,"my runnable thread");
		System.out.println("my thread created "+mythread);
		mythread.start();
	}
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("printing the count "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("my thread interrupted");
		}
		System.out.println("my thread is over");
	}
}
public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count cnt=new Count();
		try {
			while(cnt.mythread.isAlive()) {
				System.out.println("Main thread will be alive till the child"
						+ "thread is live");
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		System.out.println("main thread is over");
	}

}
