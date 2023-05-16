package cm4Big0Day5;

import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class BirthdayCakeCandles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input number of candles : ");
		int num = sc.nextInt();
		List<Integer> candle = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			System.out.println("input candle : ");
			candle.add(sc.nextInt());
		}
		System.out.println("number of candles tallest :" + birthdayCakeCandles(candle));
	}

	public static int birthdayCakeCandles(List<Integer> candles) {
		int maxHeight = candles.get(0);
		int count = 1;

		for (int i = 1; i < candles.size(); i++) {
			if (candles.get(i) > maxHeight) {
				maxHeight = candles.get(i);
				count = 1;
			} else if (candles.get(i) == maxHeight) {
				count++;
			}
		}
		return count;
	}
}
