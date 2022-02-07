package chapter6.lambdasFunctionalInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambdas {

	public static void main(String[] args) {

		//Consumer
		Consumer<String>  consumer = x -> System.out.println("Consumer: " + x);
		consumer.accept("Hello consumer");
		
		//Predicate
		Predicate<String> checker = s -> s.startsWith("L");
		System.out.println("Pridicate: " + checker.test("Lucas"));
		
		//Supplier
		Supplier<Integer> supplier = () -> new Random().nextInt();
		System.out.println("Supplier: " + supplier.get());
		
		//Comparator
		Comparator<Integer> ints = (i1, i2) -> i1 - i2;
		System.out.println("Comparator: " + ints.compare(supplier.get(), supplier.get()));
		
		
		//complete lambda expression
		Predicate<String> predicate = (String x) -> {
			x+= " De Castro";
			return x.contains("Lucas De Castro");
		};
		System.out.println(predicate.test("Lucas"));
		
		
		List<String> list = new ArrayList<>();
		list.add("c");
		list.add("a");
		list.add("b");
		list.add("d");
		
		methodRemoveIf(list);
		System.out.println("Removed letter d: " + list);
		
		methodSort(list);
		System.out.println("Sorted: " + list);
		
		list.forEach(x -> System.out.println(x));
		
		//using Map
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 1);
		map.put("C", 1);
		map.keySet().forEach(x -> System.out.println("Map only key: " + x));
		map.values().forEach(x -> System.out.println("Map only values: " + x));
	}


	private static void methodRemoveIf(List<String> list) {
		list.removeIf(x -> x.contains("d"));
	}
	
	private static void methodSort(List<String> list) {
		list.sort((x, y) -> x.compareTo(y));
	}
	
}
