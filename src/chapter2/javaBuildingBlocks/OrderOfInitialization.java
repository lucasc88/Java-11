package chapter2.javaBuildingBlocks;

/**
 * It runs in order that instance variables and instance initializers appear.
 * 
 */
public class OrderOfInitialization {

	{
		i = "4";
//		System.out.println(i);//I can't run the variable before it has been declared
		i = "5";
	}

	public OrderOfInitialization() {
		i = "3";
	}

	public static void main(String... strings) {
		System.out.println(new OrderOfInitialization().i);
	}

	private String i = "1";

	{
		i = "2";
		System.out.println(i);
	}

}
