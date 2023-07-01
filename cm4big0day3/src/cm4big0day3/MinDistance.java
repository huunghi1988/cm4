package cm4big0day3;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class MinDistance {

	
public static void minGap(int[] arr)
{
	HashSet<Integer> minGap = new HashSet<Integer>();
	for (int i = 0; i < arr.length; i++) {
		if (minGap.contains(arr[i])) {
			minGap.add(arr[i]);
		} 
		System.out.println(minGap.toString());
	}



}
	public static void main(String[] args) {
		int[] arr = { 7, 1, 3, 4, 1, 7 };

		String string = "baaaabbaabbba";
		String string2="baaaaa";
		String string1 = "baabab";
		//replaceLetter(string1);
		replaceLetter(string);
		//System.out.println(Arrays.toString(arr));
		//System.out.println("minDistance: " + Arrays.toString(selectionShort(arr)));

	}

	public static void replaceLetter(String string) {
		int count = 0;
		int length = string.length();
		System.out.println(string);
		for (int i = 1; i < length - 2; i++)
			if ((string.charAt(i-1) == string.charAt(i) && (string.charAt(i) == string.charAt(i + 1)))) {
				count++;
				System.out.println(i);
				//System.out.println(string.substring(0,i +2));
				string = string.substring(0,i+1) + (string.charAt(i+1) == 'b' ? 'a' : 'b') + string.substring(i + 2);
				System.out.println(string);
				//i = Math.max(0, i - 1);
				//length--;
			}

		System.out.println(string);
		System.out.println(count);

	}

	public static int[] selectionShort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[min])
					min = j;

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		return arr;
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

	public static int findMinimumDistanceBetweenIdenticalNumbers(int[] array) {
		Arrays.sort(array); // sort the array in ascending order
		System.out.println(Arrays.toString(array));
		int minDistance = Integer.MAX_VALUE;
		System.out.println(minDistance);

		for (int i = 1; i < array.length; i++) {
			if (array[i] == array[i - 1]) { // check if the current element is the same as the previous element
				int distance = i - (i - 1);
				if (distance < minDistance) {
					minDistance = distance;
				}
			}
		}
		if (minDistance == array[array.length - 1]) {
			return -1;
		} else {
			return minDistance;
		}
	}

	public static int[] sortArray(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 0; j < arr.length - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		return arr;
	}

}

//O(n^2)
