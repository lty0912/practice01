package practice01;

import java.util.Scanner;

public class MultipleOfTree {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		
		int input = stdin.nextInt();	
		
		if( (input%3) == 0 ) {
			System.out.println(input + "은 3의 배수입니다.");
		} else {
			System.out.println(input + "은 3의 배수가 아닙니다.");
		}
		
		stdin.close();
		
	}
}
