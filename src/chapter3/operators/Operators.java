package chapter3.operators;

public class Operators {

	public static void main(String[] args) {
		int x = (int) 1.0f;
		float y = 1.0f;

		// ternary operator
		int i = 1;
		int j = 2;
		int result = i < j ? i++ : j++;// only i is run
		System.out.println("i: " + i + ", j:" + j);

		System.out.println(1 < 2 ? "one is smaller than 2" : 2);

		int q = (short) 1;
		q = q++;
		System.out.println("q: " + q);
		float w = 2.3f;
		System.out.println(q + w);

		short goat = 2;
		goat += 9999999.0;// compound operators has automatically cast
		System.out.println("goat: " + goat);

		short asd = (byte) (double) 2.0;

		//ternary operation inside other ternary operation
		System.out.println(asd >= 2 ? --asd >= 2 ? "Yes" : "No" : "No");
	}

}
