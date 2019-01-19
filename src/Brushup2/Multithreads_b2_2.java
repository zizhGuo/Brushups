package Brushup2;

import java.lang.Thread;

public class Multithreads_b2_2 implements Runnable {

	private String info;
	int x = 0;

	public Multithreads_b2_2 (String info) {
		this.info = info;
	}

	public void run () {
		x=1;
		System.out.print(info);
	}

	public static void main (String args []) {
		if (args != null)	{
			for (int n = 0; n < args.length; ++ n)	{
				new Thread( new Multithreads_b2_2("" + n ) ).start();
			}
		}
	}

}
