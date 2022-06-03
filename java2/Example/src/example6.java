import java.util.Scanner;

public class example6 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 2차 배열이며, 2차배열 데이터는 다음과 같습니다.
		 * user_list : 홍길동 이순신 강감찬 유관순 세종대왕 김유신 계백장군
		 * user_point : 3000 1000 25000 19800  5750  3630    0
		 * 프로그램 시작과 동시에
		 * "포인트를 검색할 고객명을 입력하세요?"
		 * 입력한 값은 별도의 class를 제작하여 해당 메소드 값으로 매개변수를 
		 * 이용하여 전달 후 해당 결과 값을 출력하시면 됩니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("포인트를 검색할 고객명을 입력하세요?");
		String input = sc.next();
		
		point p = new point();
		p.name(input);
		sc.close();
		p = null;

	}
	

}
class point{
	
	public void name(String nm) {
		String data[][] = {
				{"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"},
				{"3000","1000","25000","19800","5750","3630","0"}
		};
		int w = 0;
		int ea = data[0].length;
		while(w<ea) {
			if(nm.equals(data[0][w])) {
				System.out.printf("%s님의 포인트는 %s 입니다.",data[0][w],data[1][w]);
			}
			w++;
		}
	}
}
