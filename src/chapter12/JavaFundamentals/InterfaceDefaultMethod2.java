package chapter12.JavaFundamentals;

@FunctionalInterface//with this annotation, the interface must has only one abstract method, otherwise, compile error will appear
public interface InterfaceDefaultMethod2 {

//	default methods cannot be final, abstract or static
	default String defaultMethod() {// implicitly public
		return addInterfaceName(" with default method.");
	}

	String methodWhatever();
//	String methodWhatever2();//is not a functional interface (2 abstract methods

	static int staticMethod() {// without access modifiers, is implicitly public but can it can has other
								// modifiers
		return 2;
	}

	/**
	 * now Interfaces can has private methods to reduce code duplication. Private static as well.
	 * 
	 * @param s
	 * @return
	 */
	private String addInterfaceName(String s) {
		return "InterfaceDefaultMethod2" + s;
	}
	
	//these 3 methods don't count as abstract methods because all of them come from Object class
	String toString();
	boolean equals(Object o);
	int hashCode();
}
