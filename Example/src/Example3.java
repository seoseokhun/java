import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/*
		 응용문제3.
		 사용자가 해당 값을 입력합니다.
		 단 사용자 두개의 숫자를 입력하되 첫번째 숫자와 두번째 숫자 범위
		 안에 있는 모든 숫자를 더해서 결과값이 나오도록 제작하시오.
		 단, 해당 코드는 do~while 작성합니다.
		 
		 예시)
		 첫번째 범위 숫자는? 5
		 두번째 범위 숫자는? 10
		 범위 숫자 모든 합계는 : 45 입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int a = sc.nextInt();
		System.out.print("두번째 범위 숫자는?");
		int b = sc.nextInt();
		int total = 0;
		do {
			total = total + a;
			a++;
		
		}while(a <= b);
		System.out.printf("최종 범위의 합계치는:%d",total);
		sc.close();
	}

}
