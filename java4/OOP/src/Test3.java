
public class Test3 {

	public static void main(String[] args) {
		/*
		 * 다차원 배열 해당 결과값 처럼 출력 되도록 하시오.
		 */
		String data[][] = {
				{"홍길동","이순신","유관순","강감찬"},
				{"국어:55","국어:95","국어:85","국어:70"},
				{"수학:88","수학:35","수학:70","수학:30"},
				{"영어:100","영어:45","영어:70","영어:70"}
				
		};
		/*결과값
		 * 홍길동 : 수학 : 88
		 * 이순신 : 수학 : 35
		 * 유관순 : 수학 : 70
		 * 강감찬 : 수학 : 30
		 * 
		 */
		int a,aa;
		for(a=0;a<4;a++) {
			System.out.println(data[0][a]);
			for(aa=0;aa<1;aa++) {
				System.out.println(data[2][0]);
			}

	}

}
