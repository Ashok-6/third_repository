// multithreading: this process executing multiple of threads simultaneously

package java.multithreding.d13;
public class mul_thread extends Thread {
	
	public void run() {
		System.out.println("ashok");
	}

	public static void main(String[]args)  {
		
		mul_thread m1=new mul_thread();
		
		//m1.run();
		m1.start();
		
	}

	
}
