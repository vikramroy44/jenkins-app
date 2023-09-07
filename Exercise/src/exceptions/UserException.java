package exceptions;
// extends Exception for Checked Exception or Complietime exception
// extend RuntimeException for unchacked Exception(Run time Excepton)
public class UserException extends RuntimeException {
	
	
public UserException() {
	super("You can not Vote- Checked Exception");
}
public UserException(String msg) {
	super(msg);
}
}
