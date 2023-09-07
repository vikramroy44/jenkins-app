package UserServices.exceptions;

public class UserNotFoundException extends RuntimeException{
	
	public UserNotFoundException() {
		super("User Not found in database");
	}
	
	public UserNotFoundException(String msg) {
		super(msg);
	}

}
