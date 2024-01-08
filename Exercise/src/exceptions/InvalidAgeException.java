package exceptions;
// when extends Exception ie checked or compiletime exception use try catch block with validateAge function otherwise throw compilation error

public class InvalidAgeException extends RuntimeException {

	public InvalidAgeException(String str) {
		// TODO Auto-generated constructor stub
		super(str);
	}
        public InvalidAgeException() {
        	super("Your age is Below 18");
        }
}
