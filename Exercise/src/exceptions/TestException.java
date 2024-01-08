package exceptions;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
		validateAge(16);
	} catch (InvalidAgeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	private static void validateAge(int age) throws InvalidAgeException {
		// TODO Auto-generated method stub
		if(age<18) {
			throw new InvalidAgeException();
		}
		else {
			System.out.println("Welcome, You can vote!! ");
		}
		
	}

}
