import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {
		int sc = 220524;
		
		Scanner w = new Scanner(System.in);
		System.out.println("Q.인증받은 번호를 입력하세요?");
		int s = w.nextInt();
		
		if(sc == s) {
			System.out.println("인증확인 되셨습니다.");
			
		}
		else {
			System.out.println("인증번호 틀립니다.");
		}
		
		
		
		
		
		
		
	

	}

}
