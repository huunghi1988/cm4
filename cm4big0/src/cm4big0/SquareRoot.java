package cm4big0;

import java.util.Scanner;

public class SquareRoot {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("input number :");
	System.out.println("square root is "+ squareRootFuntion(sc.nextInt()));
	System.out.println("O(n)");
	
}
public static int squareRootFuntion(int num) {
	for (int i=1;i<num;i++) {
		if ((num/i)==i)
			{return i;
			}
	}
	return 0;

}
}
