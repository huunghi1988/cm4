package cm4Big0Day5;

import java.util.List;
import java.util.ArrayList;

import java.util.Map;
import java.util.HashMap;

public class oddTimes {
	public static void main(String[] args) {
		System.out.println(countSquareIntegers(3, 9));
		System.out.println(countSquareIntegers(17, 99));
	}

	public static int countSquareIntegers(int a, int b) {
		int count = 0;
		int sqrtA = (int) Math.ceil(Math.sqrt(a));
		int sqrtB = (int) Math.floor(Math.sqrt(b));

		count = sqrtB - sqrtA + 1;

		return count;
	}}