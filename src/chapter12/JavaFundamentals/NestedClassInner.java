package chapter12.JavaFundamentals;

public class NestedClassInner {

	private String repeat = "Inner class accessing outer class filed";

	protected class Inner {
	
		//static fields in the Inner class only if they are final
		private static final int repeat = 3;

		public void go() {
			System.out.println(NestedClassInner.this.repeat);
			for (int i = 0; i < repeat; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public void callInner() {
		Inner i = new Inner();
		i.go();
	}
	
	public static void main(String[] args) {
		NestedClassInner n = new NestedClassInner();
		n.callInner();
		Inner i = new NestedClassInner(). new Inner();
		i.go();
	}
}
