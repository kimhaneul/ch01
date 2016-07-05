package ch01;

public class ArrayEquals {

	public static void main(String[] args) {
		int a1[] = { 1, 2, 3, 5, 8 };
		int a2[] = { 1, 2, 3, 5, 8 };

		System.out.println(equals(a1, a2));

	}

	public static boolean equals(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		} else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					return false;
				}
			}
		}
		return true;
	}

}
