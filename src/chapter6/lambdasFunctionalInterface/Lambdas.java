package chapter6.lambdasFunctionalInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambdas {

	private static String x;

	public static void main(String[] args) {

		// Consumer
		Consumer<String> consumer = x -> System.out.println("Consumer: " + x);
		consumer.accept("Hello consumer");

		// Predicate
		Predicate<String> checker = s -> s.startsWith("L");
		System.out.println("Pridicate: " + checker.test("Lucas"));

		// Supplier
		Supplier<Integer> supplier = () -> new Random().nextInt();
		System.out.println("Supplier: " + supplier.get());

		// Comparator
		Comparator<Integer> ints = (i1, i2) -> i1 - i2;
		System.out.println("Comparator: " + ints.compare(supplier.get(), supplier.get()));

		// complete lambda expression
		Predicate<String> predicate = (String x) -> {
			x += " De Castro";
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

		// using Map
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 1);
		map.put("C", 1);
		map.keySet().forEach(x -> System.out.println("Map only key: " + x));
		map.values().forEach(x -> System.out.println("Map only values: " + x));

		Predicate<Set<Float>> set = x -> true;

		List<Character> chars = new ArrayList<Character>();
		chars.add('a');
		chars.add('b');
		chars.add('c');
		chars.add('d');
		finalVariables(chars);
		
		
		method();
	}

	private static void methodRemoveIf(List<String> list) {
		list.removeIf(x -> x.contains("d"));
	}

	private static void methodSort(List<String> list) {
		list.sort((x, y) -> x.compareTo(y));
	}

	private static void finalVariables(List<Character> list) {
		char end = 'z';
		list.removeIf(c -> {
			char start = 'a';
			return start <= c && c <= end;
		});

		// this is external scope but after the lambda expression
		char start = 'a';
		char c = 'x';
		list = null;
//		end = '1';// end must to be final
	}

	private static void method() {
		x((var x) -> {
			System.out.println(x);
		}, (var x, var y) -> x.compareTo(y));
	}

	public static void x(Consumer<String> x, Comparator<Integer> y) {
		x.accept("Printing with var");
		System.out.println("1 is smallest than 2?" + y.compare(1, 2));
	}
}
