package chapter12.JavaFundamentals;

public class Conversion {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		int i = 1234567890;
		float f = i;// loss the precision when it's pass from int to double
		System.out.println(i);
		System.out.println(f);
		System.out.println(i - (int) f);

		// if the String variable modification is not assigned for a variable, the
		// modofication will be lost even using new String()
		String blank = " "; // one space
		String line = blank + "hello" + blank + blank;// 8 length
		line.concat("world");
		String newLine = line.trim();// 5 length
		System.out.println(line.length() + " + " + newLine.length());
		System.out.println(line + " " + newLine);

		// StringBuilder is an object, so you can just modify without assign for a
		// variable
		StringBuilder sb = new StringBuilder("Lucas");
		sb.append('c');
		System.out.println(sb);// toString Method is already implemented in StringBuilder
		System.out.println(new String("L"));// toString Method is already implemented in String

		Integer dataWrapper = new Integer(5);
		Integer value = wiggler(dataWrapper);
		System.out.println(dataWrapper + value);// 5 + 15
	}

	public static Integer wiggler(Integer x) {
		Integer y = x + 10;
		x++;
		System.out.println(
				"Integer object is passes in this method but the modification will be lost after its run: " + x);
		return y;
	}
}