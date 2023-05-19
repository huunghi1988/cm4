package cm4Big0Day6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factor {
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input n: ");
		int n = sc.nextInt();
		System.out.println("Please input k: ");
		int k = sc.nextInt();

		System.out.println(findkthfactor(n, k));
	}

	public static int findkthfactor(int n, int k) {
		List<Integer> list = new ArrayList<Integer>();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				list.add(i);
				count++;
			}
			if (0<k && count >= k) {
				return list.get(k-1);
			}
		}
		return -1;
	}
}

