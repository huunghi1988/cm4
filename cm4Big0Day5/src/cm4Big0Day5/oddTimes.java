package cm4Big0Day5;

import java.util.List;
import java.util.ArrayList;

import java.util.Map;
import java.util.HashMap;

public class oddTimes {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15 };
		System.out.println(findOddTimesAppearNum(arr).toString());
	}

	public static ArrayList<Integer> findOddTimesAppearNum(int[] arr) {
		HashMap<Integer, Integer> countAppear = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (countAppear.containsKey(arr[i])) {
				countAppear.put(arr[i], countAppear.get(arr[i]) + 1);
			} else
				countAppear.put(arr[i], 1);

		}
		ArrayList<Integer> findOdd = new ArrayList<>();

		for (int i : countAppear.keySet()) {
			if ((countAppear.get(i) % 2 != 0))
				findOdd.add(i);

		}
		return findOdd;
	}

}
