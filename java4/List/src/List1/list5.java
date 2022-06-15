package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		/* 응용문제 사용자가 숫자금액 입력합니다.
		 * 해당 숫자 금액 횟수는 총 8번 입니다.
		 * 0~n까지 입력가능하며 
		 * 해당 입력이 모두 끝나면 최종 합계 금액을 출력 시키시오.
		 * 예시)
		 * 입금할 금액을 적으세요?
		 * 500 600 500 400 200 100 50 50
		 * 결과)
		 * 총 입금 금액은 : 2400원 */
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> bank = new LinkedList<>();
		String user;
		int w=0;
		int total = 0;
		do {
			System.out.println("금액을 입력하세요");
			String money = sc.next();
			try {
				int addm = Integer.parseInt(money);
				bank.add(addm);
				total += addm;
			}catch(Exception e){
				System.out.println("금액은 숫자로만 입력하세요");
			}
			w++;
		}while(w<8);
		System.out.println("전체 입금한 총 금액은?"+total+"원 입니다.");
	}

}
