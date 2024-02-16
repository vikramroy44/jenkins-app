package exceptions;

public class MultiCatch {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		try {
			
			int i = 20/0;
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmetic Exception" + e);
		}catch (Exception e) {
			System.out.println("CAth Exception");
		}
	}

}
