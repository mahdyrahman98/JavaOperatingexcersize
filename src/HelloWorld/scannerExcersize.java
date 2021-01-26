package HelloWorld;

import java.util.ArrayList;
import java.util.Scanner;

public class scannerExcersize {

	public static void number() {
		int first, second, add, subtract, multiply;
		float devide;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Two Numbers : ");
		
		

		first = scan.nextInt();
		second = scan.nextInt();
		
		//System.out.println(";Enter add or subtract or multiply or divide");
		
		

		add = first + second;
		subtract = first - second;
		multiply = first * second;
		devide = (float) first / second;

		System.out.println("Sum = " + add);
		System.out.println("Difference = " + subtract);
		System.out.println("Multiplication = " + multiply);
		System.out.println("Division = " + devide);
	}

	public static void person() {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name");
		String name = scan.next();

		System.out.println("Enter your age");
		int age = scan.nextInt();

		System.out.println("What is your job title");
		String job = scan.next();
		job += scan.nextLine();

		System.out.println(name + " " + age + " " + job);

		ArrayList<Object> Information = new ArrayList<Object>();

		Information.add(name);
		Information.add(age);
		Information.add(job);

		System.out.println(Information);

	}
	
	public static void menu () {
		
		
	}
}
