import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
		
		byte a = 10;
		if(a < 10) {
			System.out.println("입력한 값은 10이상 숫자를 입력하세요.");
			
		}
		else if(a < 10 || a <= 22) {     //조건문에 범위를 설정하여 적용함
			System.out.println("당첨 입니다.");
		}
		else {
			System.out.println("범위 밖의 숫자 입니다.");
			
		}
		//응용문제
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Q.1~45까지 숫자 하나를 입력하세요?");
		int z = k.nextInt();
		if(z==0) {
			System.out.println("숫자 입력이 잘못 되었습니다.");
		}
		
		else if(z<46){
			if (z==7 || z==12 || z==14) {
				System.out.println("20% 쿠폰 당첨 입니다.");
			}
			
		}
		else {
			System.out.println("숫자는 1~45까지만 입력 가능합니다.");
		}
			
		
		


	}

}
