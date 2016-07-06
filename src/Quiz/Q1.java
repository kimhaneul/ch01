package Quiz;

import util.InputValues;

public class Q1 {

	public static void main(String[] args) {

		System.out.print("숫자 입력> ");
		int test_num = InputValues.readInt();

		if ((test_num % 3) == 0) {
			System.out.println("3의 배수입니다");
		} else {
			System.out.println("3의 배수가 아닙니다");
		}
	}
}
