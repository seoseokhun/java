import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int money = 100000;
		Scanner sc = new Scanner(System.in);
		System.out.println("1번 입력시 입금, 2번 입력시 출금 입니다.");
		int a = sc.nextInt();
		int total;
		Scanner cal = new Scanner(System.in);
		if(a==1) {
			System.out.println("입금 금액을 입력하세요:");
			total = cal.nextInt();
			money = money + total;
		}
		else if(a==2) {
			System.out.println("출금 금액을 입력하세요:");
			total = cal.nextInt();
			money = money - total;
		}
		else {
			System.out.println("정상적인 코드가 아닙니다.");
			sc.close();
		}
		
		System.out.println("처리된 내용은 다음과 같습니다."+money+"원");
		cal.close();
		sc.close();
		
	}

}
