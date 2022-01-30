package chapter2.javaBuildingBlocks;

public class VarVariable {

//	var trick = "hello"; // var is allowed only for local variable use

	public static void main(String[] args) {
//		var nullInitializationVariable = null;// is not permit null initialization
		
		var trick = 10L;
//		trick = null;//is not possible assign null for primitives types
		trick = 1;
//		trick = "is not allowed because in the begining is was defined as a long";

		// in this case, 1000000 is out of short type range
		var outRange = (short) 200;
		outRange = (byte) 127;
//		outRange = 1000000; does not compile

//		final var initializeWhenIsDeclared;//final can be used
//		initializeWhenIsDeclared = "final";//but var need to be initialized when declared

//		var a = 1, b = 2;//java does not allow var in multiple variable declarations

		var stringCanBeNull = "Lucas";
		stringCanBeNull = null;
		var primitiveTypeNo = 1;
//		primitiveTypeNo = null;//does not compile

		var var = 1;// var can be used as a variable name, but not as a Class name. Error compile

		// ugly binary variable
		double __$ = 0b11;
		System.out.println(__$);// prints 3.0


		//var can be assigned for Objects
		VarVariable varVariable = new VarVariable();
		var p = varVariable.new PoliceBox();
		var q = varVariable.new PoliceBox();
		p.color = "green";
		p.age = 1400;
		p = q;
		System.out.println("Q1=" + q.color);
		System.out.println("Q2=" + q.age);
		System.out.println("P1=" + p.color);
		System.out.println("P2=" + p.age);
		
		var string = "Lucas";
		string.length();
	}

	class PoliceBox {
		String color;
		long age;

		public void PoliceBox() {
			color = "blue";
			age = 1200;
		}
	}

}
