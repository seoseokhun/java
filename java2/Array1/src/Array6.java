import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		/*
		 * 응용문제 다음중 장바구니에 여러개의 상품이 담겨져 있습니다. 그 중 택배비가 별도로 측정되는 금액만 추출하시오. 택배비는 30000
		 * 만원이상(포함) 15000 / 48000 67000 / 8000 / 118200 49800 / 6000 18700 [48 ,67 ,1182
		 * ,498]
		 * 
		 */

		int a[] = new int[6]; // [null,null,null....]
		int b[] = { 15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700 };
		int ea = b.length;
		// System.out.println(b);
		int a_ea = a.length;
		int w = 0;

		while (w < ea) {

			if (b[w] >= 30000) {
				System.out.println(b[w]);

			}

			w++;
		}

	}

}
