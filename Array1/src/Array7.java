import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 해당 사용자 정보 데이터 및 각 레벨별 데이터도 함께 제공 됩니다.
		 * 그중 레벨데이터 값에 3미만(미포함) 값만 확인 하여
		 * 배열 데이터를 재가공 합니다.
		 * 
		 * "홍길동","이순신","강감찬","세종대왕","유관순","김유신"
		 * 4,3,1,1,2,2
		 * 
		 * ["강감찬","세종대왕","유관순","김유신"]
		 * 
		 * 
		 */                       
		String member[]= {"홍길동","이순신","강감찬","세종대왕","유관순","김유신"};
		int lv[] = {4,3,1,1,2,2}; //조건 기준
		
		String new_member[]=new String[8];
		int ea = member.length;
		int f;
		int ct = 0;
		for(f=0;f<ea;f++) {
			if(lv[f]<3) {
				//System.out.println(member[f]);
				new_member[ct]=member[f];
				ct++;
			}
				}
		System.out.println(Arrays.toString(new_member));
		//Arrays.toString : 숫자, 문자, 소수 [] 현재 배열 변수값을 출력하는 함수입니다.
		
		
		
		
		
		
		
		
		
		
		

	}

}
