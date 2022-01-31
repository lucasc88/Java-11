package chapter4.makingDecisions;

public class MakingDecisions {

	public static void main(String[] args) {
		// Only convertible int, byte, short, char, strings or enum variables are
		// permitted.
		// boolean, long, float, double and each their associated wrapper classes are
		// not supported by switch.
		final var y = 97;
		int w = 2;
		var x = 'a';
		switch (x) {
		case y:
			w = 3;
			break;
		default:
			break;
		}

		int[][] list = { { 1, 13 }, { 5, 2 }, { 2, 2 } };
		int searchValue = 2;
		int[] results = searchForValue(list, searchValue);

		if (results == null) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + results[0] + "," + results[1] + ")");
		}

		int checkDate = 0;
		while (checkDate < 10) {
			checkDate++;
			if (checkDate > 100) {
				break;
				// checkDate++; // UNREACHABLE CODE, DOES NOT COMPILE
			}
		}
		System.out.println(1 % 2);
		System.out.println();
		methodCrazyLoop();
	}

	private static int[] searchForValue(int[][] list, int v) {
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == v) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}

	static void methodCrazyLoop() {
		int count = 0;
		BUNNY: for (int row = 1; row <= 3; row++)
			RABBIT: for (int col = 0; col < 3; col++) {
				if ((col + row) % 2 == 0)
//					break RABBIT;
					continue RABBIT;//continue BUNNY is the equivalent of break RABBIT
				count++;
			}
		System.out.println("methodCrazyLoop count " + count);
	}
	
}