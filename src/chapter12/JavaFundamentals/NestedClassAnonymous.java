package chapter12.JavaFundamentals;

public class NestedClassAnonymous {

	abstract class SaleTodayOnly {
		abstract int eurosOff();
	}

	interface SaleTodayOnlyInterface {
		int eurosOff();
	}

	interface NoBody {
	}

	public static void main(String[] args) {
		// Anonynmus Class using Abstract class
		NestedClassAnonymous anonymous = new NestedClassAnonymous();
		System.out.println(anonymous.adimission(3));

		// Anonymous Class using Interface
		NestedClassAnonymous anonymousUsingInterface = new NestedClassAnonymous();
		System.out.println(anonymousUsingInterface.adimissionUsingInterface(10));

		// Anonymous Class directly in a parameter
		NestedClassAnonymous anonymousAsParameter = new NestedClassAnonymous();
		System.out.println(anonymousAsParameter.pay());

		// Anonymous Class with no body
		NoBody noBody = new NoBody() {
		};
	}

	public int adimission(int basePrice) {
		// Anonymous Class is a local class that needs extend other class or implement
		// an interface. Its your instance is create at the same time of its
		// implementation.
		SaleTodayOnly s = new SaleTodayOnly() {
			int eurosOff() {
				return 1;
			}
		};
		return basePrice - s.eurosOff();
	}

	public int adimissionUsingInterface(int basePrice) {

		// if an Anonymous Class is using a local variable inside the method, it needs
		// to be final or effectively final. Any other case, dont need to be final
		String name = "Lucas";
		SaleTodayOnlyInterface s = new SaleTodayOnlyInterface() {

			public int eurosOff() {
				System.out.println(name);
//				name = ""; //needs to be final
				return 1;
			}

			// it can has more than one method
			public int eurosAdd() {
				return 2;
			}
		};

		return basePrice - s.eurosOff();
	}

	/**
	 * Abstract class as a parameter to the Anonymous Class to be passed
	 * 
	 * @param basePrice
	 * @param s
	 * @return
	 */
	public int admission(int basePrice, SaleTodayOnly s) {
		return basePrice - s.eurosOff();
	}

	private int pay() {
		return admission(10, new SaleTodayOnly() {
			int eurosOff() {
				return 9;
			}
		});
	}
}
