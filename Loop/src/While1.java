
public class While1 {

	public static void main(String[] args) {
		int a = 1;  //while 시작값
		while(a < 11) { //while 범위값,종료값
			//System.out.print(a+",");
			a++;   //증가 or 감소
		}
		
		int b = 10;
		while(b > 4) {
			//System.out.print(b+",");
			b--;
		}
		/*
		 응용문제 다음 사항을 while문으로 작성하시오.
		 22~16까지 숫자를 출력하시오
		 */
		int aa = 22;
		while(aa>15) {
			//System.out.print(aa+",");
			aa--;
		}
		
		int qq = 1; //초기값
		int ww = 10;  //종료값
		while(qq <= ww) { //반복문 범위
			
			//System.out.printf(qq+",");
			qq++;   //증가
		}
		/*
		 응용문제 변수 2개를 이용하여 범위에 맞게 값을 출력하시오.
		 99~47
		 */
		int q1 = 99;
		int w1 = 46;
		while(q1 > w1) {
			System.out.print(q1+",");
			q1--;
		}
	}

}
