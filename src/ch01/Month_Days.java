package ch01;

public class Month_Days {
	public static void main(String[] args) {

		int month = 7;
		int day = 0;

		if (month == 1) {
			day = 31;
		}
		else if (month == 2) {
			day = 28;
		}
		else if (month == 3 ){
			day = 31;
		}
		else if (month == 4) {
			day = 30;
		}
		else if (month == 5) {
			day = 31;
		}
		else if (month == 6) {
			day = 30;
		}
		else if (month == 7) {
			day = 31;
		}
		else if (month == 8) {
			day = 31;
		}
		else if (month == 9) {
			day = 30;
		}
		else if (month == 10) {
			day = 31;
		}
		else if (month == 11) {
			day = 30;
		}
		else if (month == 12) {
			day = 31;
		}
		
		System.out.println(month + "월은" + day + "일까지 있습니다.");

	}
}
