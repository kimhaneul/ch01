package ch01;

import java.util.Scanner;

public class PrimeDetect {
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int divisor = 2;
		
		int num = stdin.nextInt();
		boolean is_Prime = true;
		
		
		while(divisor < num){
			if((num % divisor) == 0){
				is_Prime = true;
				break;
			}
			else{
				is_Prime = false;
			}
			divisor += 1;
		}
		
		if(is_Prime){
			System.out.println(num + "은 소수가 아님");
		}
		else{
			System.out.println(num + "은 소수");
		}
		
		
	}
}
