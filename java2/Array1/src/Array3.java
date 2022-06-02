import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int data[] = { 5, 10, 15, 20, 25, 30, 35 };
		/*
		 * foreach문을 사용할 때는 인덱스 번호가 필요없이 사용할 경우 for~do~while문 사용할 때는 인덱스 번호가 필요할 때 사용
		 * 인덱스번호 : [0][1][2]
		 */
		for (int f : data) { // int f가 순차적으로 data 배열값을 받아서 저장 시킵니다.
			if (f % 2 == 0) {
				// System.out.println(f);
			}
		}

		String pay[] = { "무통장입금", "신용카드", "휴대폰", "상품권", "쿠폰" };
		Scanner sc = new Scanner(System.in);
		System.out.println("결제하고자 하는 형태를 선택해 주세요:");
		String pm = sc.next();
		for (String z : pay) { // 배열 데이터가 문자 이므로 받는 변수형태 또한 문자형을 사용해야 합니다.
			if (pm.equals(z)) {
				if (z.equals("휴대폰")) {
					//System.out.println("현재 시스템 점검으로 해당 결제는 사용하실 수 없습니다.");
				} else {
					//System.out.println(pm + "로 결제 진행 됩니다.");
				}
			}
		}
		sc.close();
		
		
		
		
		
		
		
		
		
		

	}

}
