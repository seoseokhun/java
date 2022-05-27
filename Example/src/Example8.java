import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*
		 * 응용문제8 사용자 패스워드는 a1234 입니다. 사용자가 패스워드를 입력합니다. 단, 3회 이상 실패시 다음과 같이 출력 되도록 합니다.
		 * "패스워드 횟수 제한으로 가까운 지점에 방문하셔야 합니다." 단, 패스워드가 맞을 경우 "로그인 되었습니다."라고 출력 되어야 합니다.
		 */
		final String pw = "a1234";
		int c = 3;
		Scanner sc = new Scanner(System.in);
		int w = 1;
		String msg = "패스워드를 입력해 주세요:";
		while(w < 4) {
			String userpw = sc.next();
			if(pw.equals(userpw)) {
			System.out.println("로그인 되었습니다.");
			break;
			}
			else {
				msg ="올바른 패스워드를 넣어주세요:";
				c--;
				if(c==0) {
				System.out.println("패스워드 횟수 제한으로 가까운 지점에 방문하셔야 합니다.");
			}
				w++;
			
		}
	}
	}
}
