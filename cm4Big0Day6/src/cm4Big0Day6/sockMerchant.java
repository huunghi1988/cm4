package cm4Big0Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class sockMerchant {
	public static void main(String[] args) {
		List<Integer> ar = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input number of sock : ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("please input colours of  sock " + i + " ");
			ar.add(sc.nextInt());
		}
		System.out.println(ar.toString());
		System.out.println(findSockMerchant(n, ar));

	}

	public static int findSockMerchant(int n, List<Integer> ar) {
		int count = 0;
		Map<Integer, Integer> pairs = new HashMap<>();

		for (int i = 0; i < ar.size(); i++) {
			if (pairs.containsKey(ar.get(i))) {
				pairs.put(ar.get(i), pairs.get(ar.get(i)) + 1);
			} else {
				pairs.put(ar.get(i), 1);
			}
		}
		for (int i : pairs.keySet()) {
			if (pairs.get(i) % 2 != 0)
				count++;
		}

		return count;
	}
}
