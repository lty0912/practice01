package practice01;

public class Game369 {

	public static void main(String[] args) {
		int number = 335;	// 총 숫자 개수
		String sNumber = "";
		int clapcount = 0;
		
		System.out.println("369~ 369~ 369~ 369~");
		
		for(int i=1; i<=number; i++) {			
			
			sNumber = String.valueOf(i);	// 정수로 바꿈
			clapcount = 0;	// 박수 횟수 초기화
			for(int j=0; j<sNumber.length(); j++) {
				if(sNumber.charAt(j) == '3' || sNumber.charAt(j) == '6' || sNumber.charAt(j) == '9') {	//3 or 6 or 9일때 박수횟수 추가
					clapcount++;
				}
			}
			
			if(clapcount != 0) {	// 박수 쳐야 할 때  clapcount만큼 '짝'을 출력
				System.out.print(sNumber + " ");
				for(int k=0; k<clapcount; k++ ) {
					System.out.print("짝" );
					
					if(k == clapcount-1) {	//마지막 박수에서 개행
						System.out.println();
					}
				}
			}			
		}
	}
}
