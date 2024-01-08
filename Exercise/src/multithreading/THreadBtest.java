package multithreading;

public class THreadBtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadB b = new ThreadB();
		//Thread t = new Thread(b);
		Thread t = new Thread(b, "Calling from Main");
		t.start();
		String name = t.getName();
		System.out.println(name);

	}

}
