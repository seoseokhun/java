import java.util.Arrays;
import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		/*
		 * 응용문제 {"햄버거","피자","치킨","커피"} 해당 질문은 총 4번을 물어보게 됩니다. 단, "주문종료"라고 사용자가 입력시 그 즉시
		 * 주문은 종료되며 주문내역을 출력하시면 됩니다.
		 */
		String menus[] = { "햄버거", "피자", "치킨", "커피" };
		Scanner sc = new Scanner(System.in);
		String user;
		String user_menu[] = new String[4];
		int ct = 0;
		for (String f : menus) {
			/*
			 * Scanner가 반복문 안에 적용시 loop로 무조건 반복하지는 않음
			 * 사용자가 입력할 때마다 반복문 범위만큼 출력하는 형태임
			 * 
			 */
			System.out.println("메뉴를 선택해 주세요?");
			user = sc.next();
			if (user.equals("주문종료")) {
				break;
			} else {
				for (String ff : menus) {
					if (user.equals(ff)) {
						user_menu[ct] = ff;
						ct++;
					}
				}
			}
			sc.close();
			System.out.println("주문하신 메뉴는 다음과 같습니다." );
		}

		
		
		
		
		
		
		
		
		
		/*
		 * 응용문제 배열(Araay) 사용자가 장바구니에 내용을 결제 하게 됩니다. 단, 해당 금액 리스트를 출력하지 말고, 최종 전체 결제금액만
		 * 출력 되도록 합니다. 1500 22000 13000 14500 113800 45000
		 */

	}

}
