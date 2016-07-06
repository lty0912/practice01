package practice01;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		int min = 1;
		int max = 10;	
		int height = 0;
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("높이를 입력하세요 : ");
		
		int loop = stdin.nextInt();
		
		while(height < loop) {
		
			for (int i=min; i<=max; i++) {
			System.out.print(i + " ");		
			}
			
			System.out.println();
			height++;
			min++;
			max++;
		}
		
	}

}
