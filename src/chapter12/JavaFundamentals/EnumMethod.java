package chapter12.JavaFundamentals;

public enum EnumMethod {
	
	// firstly the Enum Values, after the Constructors, Variables and Methods
	// otherwise a compile error will happen

	WINTER {
		public String getHours() {
			return "9am / 3pm";
		}
	},
	SUMMER {
		public String getHours() {
			return "9am / 7pm";
		}
	},
	SPRING, FALL;

	public String getHours() {
		return "9am / 5pm";
	}

}
