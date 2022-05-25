
public class Var {

	public static void main(String[] args) {
		/*
		 변수는 지속적으로 변하는 수
		 1. 선언방식 - 변수만 선언
		 */
		//String 은 문자 자료형(?) - 그 다음 파일 참조
		String a1; // a1 변수명을 지정

		a1 = "홍길동입니다"; 
		// = : 값을 넘겨주는 기호. == : 값이 같은 기호.
		System.out.println(a1);
		//변수명을 만든 후 값을 지정하여 넘겨주는 형태

		 // 2. 변수 + 값을 같이 선언하는 방식
		String b1 = "이순신 입니다.";
		System.out.println(b1);
		
		//변수 확인 사항
		a1 = "이순신 입니다"; // 기존의 값은 지워지고 새 변수로 재설정됨
		System.out.println(a1);
		
		
	}

}
