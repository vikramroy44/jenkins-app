package multithreading;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method Executing");
		Thread thread = new Thread1("Thread Vikram");
		Thread thread2 = new Thread(new Thread2(),"TestThread");
		System.out.println(thread.getState());
		thread.setDaemon(true);
		thread.setPriority(8);
		//System.out.println(thread.getState());
		thread.start();
		thread2.start();
		//System.out.println(thread.getState());
		System.out.println("Main Thread Ending");
		System.out.println(thread.isAlive());
		
		System.out.println(thread.getState());

	}

}
