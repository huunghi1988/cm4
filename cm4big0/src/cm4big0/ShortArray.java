package cm4big0;

import java.util.Arrays;

public class ShortArray {
	public static void main(String[] args) {

		// giving an array containing 0,1,2 only. write a function to short array in
		// O(n) time
		int[] array = { 1, 0, 0, 0, 0, 1, 2, 2, 1 };
		int[] shortArray = new int[array.length];
		//Arrays.fill(shortArray, 0);
		int countOne = 0;
		int countTwo = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				countOne = countOne + 1;
			}

			else if (array[i] == 2) {
				countTwo = countTwo + 1;
			}
		}

		Arrays.fill(shortArray, array.length - countTwo, array.length, 2);
		Arrays.fill(shortArray, array.length - countTwo - countOne, array.length - countTwo, 1);
		
		System.out.println("Sorted array : "+Arrays.toString(shortArray));
		System.out.println("O(3n)=>O(n)");
	}
}
