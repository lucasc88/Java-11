package chapter12.JavaFundamentals;

public class TestEnum {

	public static void main(String[] args) {
		//constructor is call only once to intialize the attribute 
		Season.FALL.printExpectedVisitors();
		Season.SUMMER.printExpectedVisitors();
		Season.WINTER.printExpectedVisitors();
		Season.SPRING.printExpectedVisitors();
		Season.WINTER.printExpectedVisitors();
		Season.SUMMER.printExpectedVisitors();
	}
}
