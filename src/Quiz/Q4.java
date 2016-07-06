package Quiz;

import java.util.Random;

import util.InputValues;

public class Q4 {
	public static void main(String[] args) {

//		int quiz = 50;
		int quiz=0;
		int i = 0; // while문을 위한 변수
		
		while (true) {
			if(i == 0){
				//처음에만 실행된다
				 Random r = new Random();
				 quiz = r.nextInt(100) + 1;
				 //정답을 랜덤으로 생성
				System.out.println("\n=========================================\n수를 결정하였습니다. 맞추어보세요" + quiz);
			}
			
			
			System.out.print(i + ">>");
			// 몇번째인지 출력

			int answer = InputValues.readInt();
			// 입력받는 숫자

			if (quiz == answer) {
				// 입력한 숫자가 문제와 맞았을경우 입력을종료
				System.out.println("\n맞았습니다");

				System.out.print("다시 하시겠습니까 (y/n) >> ");
				String answer_exit = InputValues.readString();
				// 게임을 다시할것인지 묻는다
				
				if (answer_exit.equals("y")) {
					// 게임을 다시할 경우 (y가 입력됬을때)
					// i를 0으로 바꾸고 while문을 처음부터 실행한다
					i = 0;
					continue;
				} else {
					// 게임을 종료할 경우 (n이 입력됬을때)
					// 문구를 출력하고 프로그램을 종료
					System.out.println("\n=========================================\n종료합니다");
					break;
				}

			} else {
				// 틀렸을경우 i를 증가시킨다
				i++;

				// 힌트를 준다
				if (quiz > answer) {
					System.out.println("더 높게\n");
				} else {
					System.out.println("더 낮게\n");
				}
			}
		}

	}
}
