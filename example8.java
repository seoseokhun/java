import java.util.Scanner;

public class example8 {

	public static void main(String[] args) {
		/*
		 * 다음 사용자 복권 관련 프로그램을 요청하였습니다.
		 * 사용자가 총 5개의 숫자를 입력하게 됩니다.
		 * "1~46 번 사이의 숫자를 입력해 주세요:"<5번 물어봐야함
		 * 사용자가 입력한 5개숫자를 배열로 생성합니다. (main에 처리)
		 * 
		 * 외부 class를 이용하여 PC가 직접 당첨 번호 5개를 랜덤하게 뽑아냅니다.
		 * PC가 뽑은 5개의 숫자를 배열로 생성합니다.(외부 class method로 생성)
		 * 별도의 결과 method를 하나 더 생성하여
		 * 사용자가 입력한 5개의 배열 데이터와 pc가 뽑은 배열 데이터를
		 * 해당 method로 전달하여, 출력하시면 됩니다.
		 * 
		 * 단, 모든 사용하는 반복문은 무조건 do~while문으로 작성합니다.
		 */
		int aa = 5;
		card c = new card();
		c.acard(aa);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~46번 사이의 숫자를 입력해 주세요:");
		sc.next();
		

	}

}
class card{
	public void acard(int user) {  //PC(5)
		int bb = 10;
		do {
			
		}while(bb<=46);
		
		card.bcard(user,bb);
	}
	public static void bcard(int user1,int pc) {  //사용자(5),PC(5)
		System.out.println(user1 + " "+ pc);
	}
}
/*
[필기시험]
		 * 1. Editor의 종류?
		 * 2. Database의 종류?
		 * 3. java에서 사용하는 자료형이 아닌것은?
		 * 4.java에서 사용하는 구분 언어가 잘못 된것은?
		 *   project란?
		 *   package란?
		 *   import란?
		 *   class란?
		 * 
		 * 5.java에 대한 설명 중 잘못 된것은? (java의 역사 x, java특징 o)
		 * 
		 * 6. 다음 문법 코드 중 잘못된 부분은?
		 */
