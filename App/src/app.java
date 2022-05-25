public class app {

	public static void main(String[] args) {

		int a = 10, b = 20, c;
		double c2;
		// 사칙연산기호 : + , - , * , -

		// c = a+b;
		// c = a-b;
		// c = a*b;
		c2 = (double) a / b; // 연산형태의 자료형 또한 있는 코드, 형변환

		System.out.println(c2);

		String a1 = "홍길동", b1 = "환영합니다", c1;
		c1 = a1 + b1; // 문자형태 일때 + 는 문자 + 문자열로 표현할 수 있습니다.
		System.out.println(c1);

		/*
		 * 응용문제 다음과 같이 출력되는 코드를 완성하시오 홍길동님 정립금은 50000 입니다. 단 홍길동과 50000의 값은 지속적으로 변화할 수
		 * 있다
		 */
		System.out.println(a1 + "님 정립금은" + a + "입니다");

		/*
		 * 응용문제 아마존 사이트에서 상품을 구매했습니다. 장바구니에 담은 상품 가격을 모두 더해서 총 결제 금액이 출력되도록 하시오. 단, $
		 * 환율로 출력되어야 합니다 8.25 4.02 3.71 결과값은 다음과 같이 출력하세요 총 결제금액은 $ 입니다.
		 */
		float total = 8.25f + 4.02f + 3.71f;
		System.out.println("총 결제금액은 $" + total + "입니다");

	}

}
