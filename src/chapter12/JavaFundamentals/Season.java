package chapter12.JavaFundamentals;

public enum Season {
	
	WINTER("Low"), SPRING, SUMMER("High"), FALL;

	private final String expectedVisitors;
	
	Season(String string) {//implicity is private constructor
		System.out.println("Constructor printing it only one: " + string);
		this.expectedVisitors = string;
	}

	Season(){
		System.out.println("Constructor printing it only one without parameter");
		this.expectedVisitors = "Meduim";
	}
	
	public void printExpectedVisitors() {
		System.out.println(expectedVisitors);
	}
}
