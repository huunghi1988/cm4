package cm4big0;

import java.util.Arrays;

public class LongestPrefix {
	public static void main(String[] args) {
		String[] strs3 = { "flower", "flow", "floight", "flo" };
		String[] strs = { "faa", "fbbbb", "fab" };
		String[] strs2 = { "flll", "fl", "fa" };

		longestCommonPrefix(strs);

		longestCommonPrefix(strs2);
		longestCommonPrefix(strs3);

		System.out.println("BigO is O(n)");
	}

	public static void longestCommonPrefix(String[] strs) {
		// array null
		if (strs.length == 0) {
			System.out.println("Array is null");
			return;
		}
		// array has only 1
		if (strs.length == 1) {
			System.out.println("no prefix ");
			return;
		}
		// array longer than 1
		if (strs.length > 1) {
			// get shortest string length
			int shortestString = strs[0].length();

			for (int i = 1; i < (strs.length); i++) {
				if (strs[i].length() < shortestString)
					shortestString = strs[i].length();
			}

			System.out.println(shortestString);
			int index = 0;

			Arrays.sort(strs);
			while (index < shortestString && strs[0].charAt(index) == strs[strs.length - 1].charAt(index)) {
				index++;

			}

			System.out.println(Arrays.toString(strs));
			System.out.println("longest prefix is : " + strs[0].substring(0, index));
			// 2 loop => O(2n)=>O(n)

		}
	}

}
