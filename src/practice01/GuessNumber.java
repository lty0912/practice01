package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		boolean loop = true;
		Scanner stdin = new Scanner(System.in);
		
		
		while(loop) {
			Random r = new Random();
			int k = r.nextInt(100) + 1;
			int count=1;	//정답 입력 횟수를 위한 변수
			
//			System.out.println(k); 정답 출력 해놓기
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			System.out.println("1-100");
			
			
			while(true) {
				
				System.out.print(count + ">>");
				
				int input = stdin.nextInt();
				
				if(input > k ) {	//입력 값이 정답보다 높을때
					System.out.println("더 낮게");
					count++;
				} else if (input < k) {		//입력 값이 정답보다 낮을때
					System.out.println("더 높게");
					count++;
				} else {
					System.out.println("정답 입니다.");
					
					System.out.print("다시 하시겠습니까? (y/n)");
					String answer = stdin.next();
					
					if(answer.equals("n") || answer.equals("N") ) {	//다시 하지 않는다면 loop 변수에 false를 입력해 종료
						System.out.println("종료합니다.");
						loop = false;
					}
					break;
				}
			}
		}
		
		stdin.close();

	}
}