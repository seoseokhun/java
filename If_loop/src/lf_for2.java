
public class lf_for2 {

	public static void main(String[] args) {
		//1~100까지 숫자 중 80이상의 숫자만 출력
		int f;
		for(f=1;f<=100;f++) {
			
			if(f >= 80) {
				//System.out.print(f+" ");
			}
			
			/*
			 200 ~ 300 까지 숫자 중 240이하의 숫자만 출력시오.
			 */
			
			
			final int a = 2;
			int w;
			for(w=1;w<11;w++) {
				
				if(w % a == 0) {
					//System.out.printf("%d ",w);
				}
				
			}
			
			/*
			 응용문제 구구단 중 2단을 반복합니다. 단 , 2단 결과값 중 10이상 숫자만 출력합니다.
			 */
			
			final int a1 = 2;
			int b1;
			int total;
			for(b1=1;b1<=9;b1++) {
				total = a1 * b1;
				if(total > 10) {
					System.out.printf("%d ",total);
					
				}
			}
		/*
		 응용문제
		 다음 결과값을 보고 해당 값이 출력 되도록 코드를 제작하시오.
		 18 36 54 72 
		 */
		
			int p;
			int total3;
			for(p=1;p<10;p++) {
				total3 = 9 * p;
				System.out.print(total3+" ");
			}
		}
			
			
			
		/*
		 응용문제
		 다음 결과값을 보고 해당값이 출력되도록 코드를 제작하시오.
		 1~20 사이의 숫자 입니다.
		 6 14 17 19
		 */
			
				int aa;
				int total4;
				for(aa=1;aa<=20;aa++) {
					if(aa==6||aa==14||aa==17||aa==19) {
					System.out.println(aa+" ");
				}
				
			
		}
			
			
			
			
			
			
		}
		 
		 

	}


