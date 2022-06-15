package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class List2 {

	public static void main(String[] args) {
		/*응용문제
		 * 해당 데이터 값 중 휴먼 고객 데이터는 모두 삭제 해야 합니다.
		 * 고객 데이터
		 * {김수빈,김정현,김창순,박도현,이경훈,정재욱,하윤성}
		 * 결과
		 * 정재욱,하윤성
		 */
		String mb[] = {"김수빈","김정현","김창순","박도현","이경훈","정재욱","하윤성"};
		ArrayList<String> ar = new ArrayList<>(Arrays.asList(mb));
		int ea = ar.size();
		int w = 0;
		
		while(w<ea) {
			int ea2 = ar.size(); //node의 갯수를 다시 파악함
			int ww= 0;
			while(ww<ea2) {
				if(!ar.get(w).equals("정재욱")&&!ar.get(w).equals("하윤성")) {
					ar.remove(0);
					//System.out.println(ar);
			}
				ww++;
			}
			w++;
			
		}
		/*
		 * 응용문제 짝수의 숫자를 모두 삭제 합니다.
		 * 10,7,6,1,11,37,41,22
		 *  결과 7,1,11,37,41
		 */
		
		Integer it[] = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> ar2 = new ArrayList<>(Arrays.asList(it));
		int no = ar2.size();
		int z =0;
		do {
			int no2 = ar2.size();
			int zz= 0;
			do {
				if(ar2.get(zz)%2==0) {
					ar2.remove(zz);
					break;
				}
				zz++;
			}while(zz<no2);
			System.out.println(ar2);
			z++;
		}while(z<no);
		
		
		
		
			
		
		
		
	}

}
