package ch01;

import java.util.Scanner;

public class N_HelloWorld01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		int i = 0;
		
		while (i < count){
			System.out.println("hello world");
			i++;
		}
	}
}
