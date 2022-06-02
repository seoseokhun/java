
public class Double_loop3 {

	public static void main(String[] args) {
		/*
		 응용문제 다음 결과값이 출력 되도록 for문으로 작성하시오.
		 5+2=7
		 5+3=8
		 5+4=9
		 5+5=10
		 6+2=8
		 6+3=9
		 6+4=10
		 6+5=11
		 7+2=9
		 7+3=10
		 7+4=11
		 7+5=12
		 ...
		 9+5=14
		 */
		int a,aa;
		int total;
		for(a=5;a<=9;a++) {
			
		for(aa=2;aa<=5;aa++) {
			total = a+aa;
			//System.out.println(a + "+" +aa+"="+(a+aa));
			}
		}
		/*
		 응용문제 더블 while문으로 제작
		 */
		int w=9;
		while(w>=7) {
			
			int ww=7; 
			
			while(ww>=5) {
				//System.out.println(w + "*" +ww+"="+(w*ww));
				ww--;
		}
			
			w--;
		}
		
		/*응용문제 다음 결과값을 보고 do~while으로 제작하시오*/
		
		int dw=5;
		do {
			int ddw=4;
			do {
				System.out.println(dw + "+" + ddw+"="+(dw+ddw));
				ddw++;
			}while(ddw<=7);
			
			
			ddw--;
		}while(dw<=3);
		

	}

}
