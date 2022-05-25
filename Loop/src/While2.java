
public class While2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 4;
		int c;
		while(a < 10) {			
			c = b * a;  //산술연산
			//System.out.print(c+",");
			a++;
		}

		/*
		 응용문제
		 56,49,42,35,28,21,
		 */
		int aa=7;
		int bb=8;
		int cc;
		while(bb>=3) {
			cc=bb*aa;
			System.out.print(cc+",");
			bb--;
		}
		/*
		 응용문제2.
		 다음 결과 값을 확인 하신후 해당 결과값에 맞는 코드를 작성하시오.(4,7,10,13,16,19,22,)
		 
		 
		 */
	}

}
