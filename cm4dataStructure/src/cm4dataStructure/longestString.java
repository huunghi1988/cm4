package cm4dataStructure;

public class longestString {
	public static void main(String[] args) {
		// String[] strs = { "flower", "flow", "floight", "flo" };
		String[] strs = { "flower", "fl", "fl", "" };

		longestCommonPrefix(strs);

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
		//array longer than 1
		if (strs.length > 1) {
			// get shortest string length
			int shortestString = strs[0].length();

			for (int i = 1; i < (strs.length); i++) {
				if (strs[i].length() < shortestString)
					shortestString = strs[i].length();
			}

			int index = 0;
			for (int i = 0; (i < shortestString && strs[0].charAt(i) == strs[strs.length - 1].charAt(i)); i++) {

				{
					index = i + 1;
				}

			}
			System.out.println("longest prefix is : " + strs[0].substring(0, index));
			// 1 loop => 0(n)
			System.out.println("BigO is O(n)");
		}
	}
}