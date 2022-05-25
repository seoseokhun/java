public class If2 {

	public static void main(String[] args) {
		
		String mid1, mid2,mpass;
		mid1 = "hong";
		mid2 = "kim";
		mpass = "a1234";
		/* 해당 조건문은 문자로 확인하는 조건형태 이며, else문 적용하는 부분 */
		if(mid1=="hong") {
			System.out.println("환영합니다.");
		}
		else if(mid1=="park") { //추가로 비교대상이 있을 경우
			System.out.println("환영합니다.");
		}
		else {
			System.out.println("가입되지 않은 사용자 입니다.");
		}
		
		
		
		/* 아이디 및 패스워드를 모두 검토하는 더블 조건문 */
		if(mid2=="kim") {    //큰 if문
			
			//작은 if문
			if(mpass=="a1234") {
				System.out.println("로그인 하셨습니다.");
			}
			else {
				System.out.println("패스워드가 틀립니다.");
			}
		}
		else {
			System.out.println("가입되지 않은 사용자 입니다.");
		}
		
		/* 해당값을 2진수로 짝수, 홀수로 확인하기 */
		
		int c = 11 % 2;    // %기호로 사용시 0 또는 1로 나머지 값이 출력이 됩니다.
		if(c==0) {
			System.out.println("짝수 입니다.");
			
		}
		else {
			System.out.println("홀수 입니다.");
			
		}

	}

}
