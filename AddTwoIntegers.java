package AddTwoIntegers;

import java.util.Scanner;

public class AddTwoIntegers {
	public static void main(String [] args) {
		int a, b;
		Scanner kboard = new Scanner(System.in);
		System.out.println("Enter first number:");
		a = kboard.nextInt();
		System.out.println("Enter second number:");
		b = kboard.nextInt();
		int c = a + b;
		System.out.println("c = " + c);
	}

}
