package cm4big0day2;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int [] arr= {1,4,5,7,8,22,23,44,57,58,104};
		int index= searchNumber(44,arr);
		System.out.println(index);
		
	}
	public static int searchNumber(int number,int[] arr)
	{int b=0;
	for (int i=0;i<arr.length;i++)
		if (number==arr[i])
				return i;
	return -1;
	}

}
