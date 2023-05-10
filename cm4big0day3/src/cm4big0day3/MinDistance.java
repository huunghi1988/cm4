package cm4big0day3;

import java.util.Arrays;

public class MinDistance {

	public static void main(String[] args) {
		int[] arr = { 7,1,3,4,1,7 };
		System.out.println(Arrays.toString(arr));
		System.out.println("minDistance: " + findMinDistance(arr));
		
	}

	public static int findMinDistance(int[] arr) {
		int min = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					min = Math.min(min, j - i);
				}
			}
		}
		return min;
	}
}

//O(n^2)
