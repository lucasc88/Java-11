package chapter5.coreJavaAPI;

import java.util.Arrays;

public class Core {

	
	public static void main(String[]  args) {
		arrayCreation();
	}
	
	static public void arrayCreation() {
		//6 differents ways
		int[] numbers1 = new int[] {2,1,3,2,4};
		int[] numbers2 = {2,1,3,2,4};
		int [] numbers3 = {2,1,3,2,4};
		int []numbers4 = {2,1,3,2,4};
		int numbers5[] = {2,1,3,2,4};
		int numbers6 [] = {2,1,3,2,4};
		
		int[] x,y;//2 arrays
		int z[],u;//z array, u is a normal int
		
		String stringArray [] = {"L"};
		Object[] o = stringArray;
//		o[0] = new StringBuilder();//compile-time error
//		System.out.println(o[0]);//run-time ArrayStoreException cuz it's orinally String[]
		
		System.out.println("Mismatch method");
		int mismatch = Arrays.mismatch(stringArray, new String[]{"L","C"});
		System.out.println("mismatch at position: " + mismatch);
		
		int parseInt = Integer.parseInt("2");//parseInt() returns primitive
		Integer valueOf = Integer.valueOf("2");// valueof() returns wrapper class
	
	}
}
