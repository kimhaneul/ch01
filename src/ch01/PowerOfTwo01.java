package ch01;

import java.util.Scanner;

import util.InputValues;

public class PowerOfTwo01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int result = 1;
		System.out.print("승수: ");

		int pow = InputValues.readInt();

		int i = 0;
		while (i < pow) {
			result *= 2;
			i++;
		}
		System.out.println("2의" + pow + "제곱은" + result);
	}
}
