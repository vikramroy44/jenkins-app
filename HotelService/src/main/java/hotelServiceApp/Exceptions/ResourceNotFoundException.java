package hotelServiceApp.Exceptions;

public class ResourceNotFoundException  extends RuntimeException{

	public ResourceNotFoundException() {
		super("Hotel with given id is not present");
		// TODO Auto-generated constructor stub
	}

	public ResourceNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	

}
