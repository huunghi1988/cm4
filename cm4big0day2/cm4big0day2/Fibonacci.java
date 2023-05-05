package cm4big0day2;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input number: ");
		System.out.println("Fibonacci is "+ findFibonacci(sc.nextInt()));
		//O(N)
		
	}
	public static int findFibonacci(int number)
	{
		int a=1;
		int b=1;
		int c;
		if (number == 0) {
	         return a;
	      }
	      for (int i = 2; i <= number; i++) {
	         c = a + b;
	         a = b;
	         b = c;
	      }
	      return b;
	}

}
