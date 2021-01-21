package HelloWorld;

public class Conditionals {

	public static void division() {

		int num5 = 72;
		int num6 = 12;
		int result2 = num5 / num6;
		System.out.println(result2);

		if (num5 < num6) {
			System.out.println("division can be performed");
		} else {
			System.out.println("division cannot be performed");
		}

	}

	public static void results() {

		int p1 = 80;
		int b1 = 120;
		int c1 = 100;
		int total = p1 + b1 + c1;
		System.out.println(total);
		int mark = total * 100 / 450;
		System.out.println(mark);

		if (mark < 60) {
			System.out.println("fail");
		} else {
			System.out.println("pass");
		}

		if (p1 >= 60 || b1 >= 60 || c1 >= 60) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

	public static void flowcharta() {
		int a = 1;
		int b = 2;

		boolean x = true;

		if (x = false) {
			System.out.println(a + b);
		} else {
			System.out.println(a * b);
		}

	}

	public static void flowchartb(int a) {

		if (a > 2000) {
			System.out.println("A");
			if (a > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (a > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}

		} else if (a < 2000) {
			System.out.println("1");
			if (a > 100) {
				System.out.println("3");
				if (a > 600) {
					System.out.println(5);

				} else {
					System.out.println(4);
					if (a > 500) {
						System.out.println(6);

					} else {
						System.out.println(7);
					}

				}

			}

		}
	}

	public static void blackjack(int c, int d) {

		if (c + d > 21) {
			System.out.println('0');
		} else {
			System.out.println(c + d);
		}

	}

	public static void uniqueSum(int q, int w, int z) {

		if (q == w || w == z || z == q) {
			System.out.println("0");
		} else {
			System.out.println(q + w + z);

		}

	}

	public static void tax(int y) {
		if (y < 14999) {
			System.out.println(y);
		} else if (y > 15000 && y < 19999) {

			System.out.println(y * 0.9);
		} else if (y > 20000 && y < 29999) {
			System.out.println(y * 0.85);
		} else if (y > 30000 && y < 44999) {
			System.out.print(y * 0.8);
		} else if (y > 45000) {
			System.out.println(y * 0.75);
		}
	}

	public static void numbers(int y) {

	}
}
