// implements runnable interface

package java.multithreding.d13;
public class Mul2 implements Runnable {
	public void run() {
		System.out.println("thread is running..");
	}
	public static void main(String[]args) {
		Mul2 m1=new Mul2();
		m1.run();
	}


}
