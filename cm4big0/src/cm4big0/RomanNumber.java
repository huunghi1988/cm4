package cm4big0;

public class RomanNumber {
	public static void main(String[] args) {
		String romanNumber = "MCMXCIV";
		System.out.println("Roman number in decimal is : " + romanToInt(romanNumber));

	}

	public static int romanToInt(String string) {
		int result = 0;
		int preValue = 0;

		for (int i = string.length() - 1; i >= 0; i--) {

			char c = string.charAt(i);

			int transValue = 0;

			switch (c) {
			case 'I':
				transValue = 1;
				break;
			case 'V':
				transValue = 5;
				break;
			case 'X':
				transValue = 10;
				break;
			case 'L':
				transValue = 50;
				break;
			case 'C':
				transValue = 100;
				break;
			case 'D':
				transValue = 500;
				break;
			case 'M':
				transValue = 1000;
				break;
			}

			if (transValue <= preValue) {
				result -= transValue;
				
			} else {
				result += transValue;
				
			}

			preValue = transValue;

		}
		return result;

	}
}
