package ch01;

public class Swap {
	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 30;

		if (n1 < n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		System.out.println("========================");

		int a1 = 120;
		int a2 = 70;
		int a3 = 150;

		if (a1 >= a2) {
			if (a1 >= a3) {
				System.out.println("최대값: " + a1);
			} else {
					System.out.println("최대값: " + a3);
				}
			}
		 else {
			if (a2 >= a3) {
				System.out.println("최대값: " + a2);
			} else {
				System.out.println("최대값: " + a3);
			}
		}

		 int a[] = { 20, 10, 50 };
		
		 for (int i = 0; i < a.length; i++) {
		 for (int j = 0; j < a.length; j++) {
		
		 if (a[i] < a[j]) {
		 int temp = a[i];
		 a[i] = a[j];
		 a[j] = temp;
		 }
		 }
		 }
		 System.out.println("최대값: " + a[a.length-1]);

	}
}
