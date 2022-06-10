import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		/*
		 * 응용문제.상품 가격은 42000 입니다.
		 * 사용자가 해당 상품 갯수를 입력 하게 됩니다.
		 * 해당 상품 가격에 맞는 갯수 만틈 곱하여 최종 결제 금액을
		 * 출력시키는 extends를 제작하시면 됩니다.
		 * 단, 42000은 절대 숫자가 바뀌면 안됩니다.
		 * 사용자가 최대 구매 할 수 있는 갯수는 5개 까지 입니다.
		 * 최종결과 값은 main method에서 출력 합니다.
		 */
		list2 a1 = new list2();
	}

}

class list{
	
	public void list_method() {
		
	}
}
class list2 extends list{
	public void list2_method() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("상품 갯수");
		int a = sc.nextInt();
	}
}