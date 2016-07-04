package ch01;

public class Month_Day_Switch {
	public static void main(String[] args) {

		int month = 7;
		int day = 0;

		switch (month) {
		case 1:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 3:
			day = 31;
			break;
		case 4:
			day = 30;
			break;
		case 5:
			day = 31;
			break;
		case 6:
			day = 30;
			break;
		case 7:
			day = 31;
			break;
		case 8:
			day = 31;
			break;
		case 9:
			day = 30;
			break;
		case 10:
			day = 31;
			break;
		case 11:
			day = 30;
			break;
		case 12:
			day = 31;
			break;
		default:
		}

		System.out.println(month + "월은" + day + "일까지 있습니다.");
	}
}
