package ch01;

import util.InputValues;

public class SumToInput {
	public static void main(String[] args) {
		// 0부터 입력된 n까지의 합

		System.out.print("입력> ");
		int input = InputValues.readInt();
		int sum = 0;

		for (int i = 0; i <= input; i++) {
			sum += i;
		}
		System.out.println("0부터 " + input + "까지의 합: " + sum);

	}
}
