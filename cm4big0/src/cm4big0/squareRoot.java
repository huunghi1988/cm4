package cm4dataStructure;
import java.util.Scanner;

public class squareRoot {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("input number :");
	System.out.println("square root is "+ squareRootFuntion(sc.nextDouble()));
	
	
	
	
	
}
public static double squareRootFuntion(double num) {
	for (int i=1;i<num;i++) {
		if ((num/i)==i)
			{return i;
			}
	}
	return 0;
}

}
