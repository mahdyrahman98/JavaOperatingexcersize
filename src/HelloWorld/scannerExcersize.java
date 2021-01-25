package HelloWorld;

import java.util.Scanner;
public class scannerExcersize {
	
	
		public static void number() {
	    int first, second, add, subtract, multiply;
	    float devide;
	    @SuppressWarnings("resource")
		Scanner Scanner= new Scanner(System.in);

	    System.out.print("Enter Two Numbers : ");
	    first = Scanner.nextInt();
	    second = Scanner.nextInt();

	    add = first + second;
	    subtract = first - second;
	    multiply = first * second;
	    devide = (float) first / second;

	    System.out.println("Sum = " + add);
	    System.out.println("Difference = " + subtract);
	    System.out.println("Multiplication = " + multiply);
	    System.out.println("Division = " + devide);
	  }
	}

	
	


