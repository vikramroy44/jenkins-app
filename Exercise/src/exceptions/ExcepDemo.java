package exceptions;

public class ExcepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// we have to use throws keyword in case of checked exception only.
		//Throws can declare multiple Exception in method signature but throw can handle only one at a time
		// throw new keyword in both case.
		// try catch block in both case
		int age=16;
		try {
		 if(age<18) {
			 throw new UserException("Your age criteria is not met");
		 }
		 else {
			 System.out.println("You can Vote");
		 }
		}
		catch(UserException e) {
			e.printStackTrace();
		}
        System.out.println("Job done!!!");
	}

}
