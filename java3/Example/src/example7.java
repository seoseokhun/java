import java.util.Arrays;

public class example7 {

	public static void main(String[] args) {
		/*
		 다차원 배열로 생성 + 외부 class 및 메소드 사용
		 [data]
		 {"홍길동","합격"},
		 {"이순신","합격"},
		 {"강감찬","불합"},
		 {"김유신","합격"},
		 {"유관순","불합"},
		 {"장보고","불합"}
		 다차원 배열 형태이며, 해당 값중 합격자만 출력되도록 합니다.
		 단, 배열값을 외부 클래스 안에 메소드에서 처리가 되도록 합니다.
		 결과 : 홍길동 이순신 김유신
		 */
		//Test.name();
		Test t = new Test();
		t.name();
		t=null;
		
		

	}

}
class Test{
	
	public static void name() {
		String std[][]= {
				{"홍길동","합격"},
				{"이순신","합격"},
				{"강감찬","불합"},
				{"김유신","합격"},
				{"유관순","불합"},
				{"장보고","불합"}
		};
		int ea = std.length;
		int w = 0;
		while(w<ea) {
			if(std[w][1].equals("합격")) {
				System.out.printf("%s님 %s 입니다.\n",std[w][0],std[w][1]);
				
			}
			w++;
		}
		
	}
}