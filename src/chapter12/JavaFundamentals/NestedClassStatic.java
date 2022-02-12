package chapter12.JavaFundamentals;

public class NestedClassStatic {

	private String externalVariable = "asd";
	
	public static class Nested{
		
		private NestedClassStatic externalClass;//it needs to explicity the outer classe to use its fields
		private static int staticVar = 0;
		private int variable;
	}
	
	public static void main(String[] args) {
		Nested n = new Nested();
		System.out.println(Nested.staticVar);
		System.out.println(n.variable);
		System.out.println(n.externalClass.externalVariable);
				
	}
}
