package chapter12.JavaFundamentals;

public class NestedClassLocal {

	private int length = 3;

	public void calculate() {
		
		final int width = 20;
		
		class MyLocalClass{
			public void multiply(){
				System.out.println(length * width);
			}
		}
		
		MyLocalClass m = new MyLocalClass();
		m.multiply();
	}

	public static void main(String[] args) {
		NestedClassLocal n = new NestedClassLocal();
		n.calculate();
	}
}
