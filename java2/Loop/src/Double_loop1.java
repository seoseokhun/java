import java.text.SimpleDateFormat;
import java.util.Date;

public class Double_loop1 {

	public static void main(String[] args) {
		/*
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("YY년MM월DD일");
		SimpleDateFormat time = new SimpleDateFormat("H:m:s");
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		//format  : 규격화된 형태로 값을 표현할때 사용하게 됩니다.
		*/
		
		/*
		int f;
		for(f=1; f<=10; f=f+2) {// f=f+2 <ㅡ +2씩 증가함 3이면 +3씩
			System.out.println(f+" ");
		}
		*/
		
		/*
		 응용문제
		 3개의 상품
		 "바코드로 상품을 입력시켜주세요?"금액을 입력하고 나서
		 단, "할인 %를 입력해 주세요:"라는 문구와 함께
		 해당 할인 숫자를 입력하면
		 최종금액이 변경 되어 출력되도록 합니다.
		 
		 int money = 100000;
		 int coupon = 20;
		 double a = coupon * 0.01;
		 System.out.println(a);
		 double b = money * a;
		 System.out.println(b);
		 double c = money - b;
		 System.out.println(c);
		 
		int money = 100000;
		 int coupon = 20;
		 double a = coupon * 0.01;
		 System.out.println(a);
		 double b = money * a;
		 System.out.println(b);
		 double c = money - b;
		 System.out.println(c);
		 */
		
		int f,ff;
		int total;
		for(f=1;f<=3;f++) {
			//System.out.println(f);
			for(ff=1;ff<=4;ff++) {
				total = f+ff;
				System.out.println(f + "+" +ff);
				}
			
		}
	}

}
