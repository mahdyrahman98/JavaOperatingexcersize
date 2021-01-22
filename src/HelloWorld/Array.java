package HelloWorld;

public class Array {

	public static int looparray[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

	public static void loops() {

		for (int i : looparray) {
			System.out.println("Number: " + i);
		}

	}

	public static void anotherLoop() {

		for (int i : looparray) {
			System.out.println("Number: " + i * 10);

		}
	}

	public static String[] stringArray = { "red", "orange", "yellow", "green", "blue" };

	public static void stringArray() {
		for (String str : stringArray) {
			System.out.println(str);
		}
	}

	public static int bigArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

	public static void bigArray() {
		for (int b : bigArray) {
			System.out.println(b * b);

		}
	}

	public static boolean evenOdd(int num1) {
		if (num1 % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}
	
	

}