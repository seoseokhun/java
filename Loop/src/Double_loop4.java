
public class Double_loop4 {

	public static void main(String[] args) {
		/*
		 응용문제 복합반복문 for, do ~while
		 */
		int f;
		for(f=2;f<=3;f++) {
			
			int w=1;
			do {
				//System.out.println(f+"*"+w+"="+(f*w));
				w++;
			}while(w<=9);
		}
		
		/*응용문제 구구단 7단부터 9단까지 단, 각 구구단 곱셈값은
		 * 5까지만 나오도록 합니다. 7*1=7 ~ 7*5=35 8*1=8...9*5=45
		 * 제약(밖에는 do~while 안에는 while)
		 
		int dw=7;
		int total;
		do {
				
			int w=1;
			while(w<=5){
				total = dw * w;
				System.out.printf("%d*%d = %d",dw,w,total);
				w++;
			}
			dw++;
		}while(dw<=9);
		*/
		
		/*응용문제 다음 결과값을 확인하여 코드를 작성합니다.
		 * 단, for ~ while 으로 제작 되도록 합니다.
		 */
		int a;
		int total2;
		for(a=1;a<=9;a++) {
			
			int b =a;
			while(b<=a) {
				total2 = b * a;
				System.out.printf("%d*%d=%d",b,a,total2);
				b++;
			}
			
		}
		/*응용문제 다음 해당 결과값 처럼 출력이 되도록
		 * 더블반복문을 이용하시오 (while ~ do~while)
		 * 1+1=2 2+1=3 2+2=4 3+1=4 3+2=5 3+3=6.../ 4+4=8 까지
		 */
	}

}
