import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		/*
		 * 응용문제 사용자가 다음과 같은 질문을 받습니다.
		 * Q."1~5"번 까지 숫자를 하나 입력해 주시길 바랍니다.
		 * 
		 * 결과 내용
		 * 1 : 5%할인쿠폰
		 * 2 : 10%할인쿠폰
		 * 3~4: 택배비무료
		 * 5: 다음기회에
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("1~5번 까지 숫자를 하나 입력해 주시길 바랍니다.");
		String user = sc.next();
		switch(user) {
		case "1":
			System.out.println("5%할인쿠폰");
			break;
		case "2":
			System.out.println("10%할인쿠폰");
			break;
		case "3":
			System.out.println("택배비무료");
			break;
		case "4":
			System.out.println("택배비무료");
			break;
		default:
			System.out.println("다음 기회에");
			break;
		}
		
		/*
		 * switch version형태 
		 */
		
		
		
		
		
		
		
	}

}
