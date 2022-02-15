package chapter12.JavaFundamentals;

public class InterfaceDefaultMethod implements InterfaceDefaultMethod1, InterfaceDefaultMethod2 {

	public static void main(String[] args) {
		// if you want to call a interface default method, this is the correct
		// overwritten: return InterfaceDefaultMethod1.super.defaultMethod();
		InterfaceDefaultMethod interfaceDefaultMethod = new InterfaceDefaultMethod();
		System.out.println(interfaceDefaultMethod.defaultMethod());
		System.out.println("Interface static method " + InterfaceDefaultMethod1.staticMethod());
		System.out.println("Interface static method " + InterfaceDefaultMethod2.staticMethod());
	}

	/**
	 * Method interface implementation
	 */
	@Override
	public String methodWhatever() {
		return null;
	}

	@Override
	public String defaultMethod() {
//		return "Default method overwritten by class";
		return InterfaceDefaultMethod1.super.defaultMethod();
	}
}
