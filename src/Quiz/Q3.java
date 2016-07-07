package Quiz;

public class Q3 {
	public static void main(String[] args) {

		String num[] = new String[100];

		for (int i = 1; i < num.length; i++) {
			// 배열에 String형태로 숫자를 저장
			num[i] = String.valueOf(i);
		}
		

		for (int i = 1; i < num.length; i++) {
			int count = 0; // 3,6,9의 갯수를 저장

			char a[] = num[i].toCharArray();
			// String형의 숫자를 char형으로 변환하여 배열에 저장

			for (int j = 0; j < a.length; j++) {
				if (a[j] == '3' || a[j] == '6' || a[j] == '9') {
					count++;
					// 3,6,9의 숫자의 개수만큼 카운트를 증가
				}
			}

			if (count > 0) {
				//count가 1 이상일때만 진입
				System.out.print(num[i] + "> ");

				for (int k = 0; k < count; k++) {
					System.out.print("짝");
					//count의 개수만큼 "짝"을 출력
				}
				System.out.println();
				//개행
			}

		}
	}
}
