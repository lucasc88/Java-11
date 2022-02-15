package chapter12.JavaFundamentals;

public interface InterfaceDefaultMethod2 {

//	default methods cannot be final, abstract or static
	default String defaultMethod() {// implicitly public
		return addInterfaceName(" with default method.");
	}

	String methodWhatever();

	static int staticMethod() {// without access modifiers, is implicitly public but can it can has other
								// modifiers
		return 2;
	}

	/**
	 * now Interfaces can has private methods to reduce code duplication
	 * 
	 * @param s
	 * @return
	 */
	private String addInterfaceName(String s) {
		return "InterfaceDefaultMethod2" + s;
	}
}
