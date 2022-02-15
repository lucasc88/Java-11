package chapter12.JavaFundamentals;

public interface InterfaceDefaultMethod1 {

	//default methods cannot be final, abstract or static
	default String defaultMethod() {//implicitly public
		return addInterfaceName("Interface 1 with default method.");
	}
	
	String methodWhatever();
	
	static int staticMethod() {//without access modifiers, is implicitly public but can it can has other modifiers
		return 1;
	}
	
	/**
	 * now Interfaces can has private methods to reduce code duplication
	 * 
	 * @param s
	 * @return
	 */
	private String addInterfaceName(String s) {
		return "InterfaceDefaultMethod1" + s;
	}
}
