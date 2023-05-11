package cm4Big0Day4;

public class ReplaceLetter {
	public static void main(String[] args) {

		String string = "baaaabbaabbbaa";
		String string1 = "baaaabbaabbba";
		String string2="baaaaa";
		String string3 = "baabab";
		
		replaceLetter(string);
		replaceLetter(string1);
		replaceLetter(string2);
		replaceLetter(string3);

		
	}

	public static void replaceLetter(String string) {
		int count = 0;
		int length = string.length();
		System.out.println(string);
		for (int i = 1; i < length - 1; i++)
			if ((string.charAt(i-1) == string.charAt(i) && (string.charAt(i) == string.charAt(i + 1)))) {
				count++;
				//System.out.println(i);
				string = string.substring(0,i+1) + (string.charAt(i+1) == 'b' ? 'a' : 'b') + string.substring(i + 2);
				//System.out.println(string);
			
			}

		System.out.println(string);
		System.out.println(count);
		

	}
}
