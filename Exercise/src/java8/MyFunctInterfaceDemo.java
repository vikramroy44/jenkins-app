package java8;

/*interface AdditionTest{
	
  int added(int a, int b);
}*/
public class MyFunctInterfaceDemo {
	public static void main(String[] args) {
		
	Addition addition=	(a,b)-> {
			return a+b;
		};
	int added = addition.add(5, 7);
	
	System.out.println(added);
}

}
