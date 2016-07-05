package ch01;

import util.InputValues;

public class NumberTriangle {

	public static void main(String[] args) {

		System.out.println("n 입력> ");
		int n = InputValues.readInt();
		
//		int n = 5;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
