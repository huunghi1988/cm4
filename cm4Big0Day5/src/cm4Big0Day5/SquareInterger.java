package cm4Big0Day5;

import java.util.Scanner;

public class SquareInterger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input number of testcase : ");
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			System.out.println("input a : ");
			int a = sc.nextInt();
			System.out.println("input b : ");
			int b = sc.nextInt();
			squareInterger(a, b);

		}

	}

	public static void squareInterger(int a, int b) {
		int count = 0;
		for (int j = (int) Math.sqrt(a); j <= (int) Math.sqrt(b); j++) {
			if (j * j >= a && j * j <= b) {
				count++;
			}

		}
		System.out.println("number of square interger is : " + count);
	}
}
