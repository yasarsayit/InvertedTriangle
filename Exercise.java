package java101;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfDigits;

		Scanner input = new Scanner(System.in);
		System.out.print("Üçgeniniz kaç katlı olsun :");
		numberOfDigits = input.nextInt();

		for (int i = 1; i <= numberOfDigits; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * (numberOfDigits - (i - 1)) - 1; k++) {

				System.out.print("*");
			}
			System.out.println();

		}

	}

}
