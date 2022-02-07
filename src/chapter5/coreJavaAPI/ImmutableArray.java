package chapter5.coreJavaAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImmutableArray {

	private static String [] stringArray = {"Lucas", "Jhon"};
	
	public static void main(String...args) {
		List<String> list = Arrays.asList(stringArray);//it's just a copy
		
		List<String> listOf = List.of(stringArray);//Immutable List
		
		System.out.println("list size (copy from array): " + list.size());
		System.out.println("listOf size (copy from array - Immutable List): " + list.size());
		
		//add or remove will throw UnsupportedOperationException because is changing the original array size, but set is possible
		list.set(1, "Lucas again");
//		list.add("Lucas UnsupportedOperationException");
//		listOf.set(0, "Lucas trying set in Immutable List: UnsupportedOperationException");//Immutable List
		
		System.out.print("stringArray: ");
		for (String string : stringArray) {
			System.out.print(" " + string);
		}
		System.out.println();
		
		System.out.println(list);
		
		String asd = "asd";
		asd += 'd';//String allows character concatanation
		
		int[] java = new int[1];
		System.out.println(java[0]);
	}
}
