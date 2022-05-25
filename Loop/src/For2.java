
public class For2 {

	public static void main(String[] args) {
		
		int a;   //for문 초기값
		int b=2;   //연산에 사용할 변수
		int c;  //연산한 결과값 사용
		for(a=1;a<=9;a++) {
			c = b * a;  //산술연산 작업
			//System.out.println(c); //연산된 결과값을 출력함
		}
		/*
		 응용문제 다음 결과값을 보고 코드를 작성 하시오.
		 45,40,35,30,25,20
		 */
		int a1;
		int b1=5;
		int c1;
		for(a1=9;a1>=4;a1--) {
			c1=b1*a1;
			//System.out.print(c1+",");
			
		}
		/*
		 응용문제 다음 결과값을 확인 후 코드를 제작하여 출력하시오
		 
		 11.22.33.44.55.66.77.88.99
		 
		 */
		int aa;
		int bb=11;
		int cc;
		for(aa=1;aa>9;aa++) {
			cc=bb*aa;
			//System.out.println(cc);
			
			int z; //for
			int x; //결과값
			
			for(z=1;z<10;z++) {
				x=(10+z)+z;
						System.out.println(x);
						
						/*
						 [반복문]
						 for 100data o 100000data x
						 while 
						 do~while
						 foreach
						 each
						 map
						 for~in
						 
						 */
			}
		}
	}

}
