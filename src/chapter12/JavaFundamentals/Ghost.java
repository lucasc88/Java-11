package chapter12.JavaFundamentals;

public class Ghost {
	public static void boo() {
		System.out.println("Not scared");
	}

	protected final class Spirit {
		public void boo() {
			System.out.println("Booo!!!");
		}
	}

	public static void main(String... haunt) {
		//An attempt of Anonymous class creation using a final inner class as inheritance
		//if the final keyword were removed, the code would compile 
//		var g = new Ghost().new Spirit() {};
//		g.boo();
	}
}
