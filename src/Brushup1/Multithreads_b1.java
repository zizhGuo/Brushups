package Brushup1;
import java.lang.Thread;

public class Multithreads_b1 {

	public static void main(String[] args) {
//		MyThread md = new MyThread();	
//		new Thread(md).start();
//		new Thread(md).start();
//		new Thread(md).start();
	}

}

class MyThread implements Runnable{
	private int ticket = 5;
	public void run() {
		for (int i=0;i<10;i++)
		{
			if(ticket > 0){
				System.out.println("ticket = " + ticket--);
			}
		}

	}
}

class YourThread extends Thread{

	private int ticket = 5;
	public void run(){
		for (int i=0;i<10;i++)
		{
			if(ticket > 0){
				System.out.println("ticket = " + ticket--);
			}
		}
	}
}
