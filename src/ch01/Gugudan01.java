package ch01;

public class Gugudan01 {
	public static void main(String[] args) {

		int i = 1;

		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.println(i + "*" + j + "=" + i * j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}