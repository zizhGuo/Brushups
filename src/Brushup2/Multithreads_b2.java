package Brushup2;
import java.lang.Thread;

public class Multithreads_b2 extends Thread{
    private int info;
    static int x = 0;
    
    public Multithreads_b2(int info) {
    	this.info = info;
    }
    
    public void run() {
    	if (info == 1) {
    		try {
				x = 3;
    			sleep(200);
			} catch (Exception e) {
			}
    	}
    	else {
    		x = 1;
    	}
    }
	public static void main(String[] args) {
        Multithreads_b2 td1 = new Multithreads_b2(1);
        Multithreads_b2 td2 = new Multithreads_b2(2);
        td1.start();
        td2.start();
        System.out.println(x);
        //System.err.println(x);
	}

}

