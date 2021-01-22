package HelloWorld;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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

	public static void arrayList() {

		ArrayList<String> fruitList = new ArrayList<>();

		fruitList.add("mango");
		fruitList.add("apple");
		fruitList.add("banana");
		fruitList.add("kiwi");
		fruitList.add("orange");

		fruitList.remove("kiwi");
		System.out.println(fruitList.get(2));

		System.out.println(fruitList);

		fruitList.set(0, "dates");
		fruitList.set(3, "strawberry");
		System.out.println(fruitList);

		Collections.sort(fruitList);
		Collections.reverse(fruitList);
		System.out.println(fruitList);
		System.out.println(fruitList.size());
		
		
		
		

	}

}