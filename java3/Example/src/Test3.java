
public class Test3 {

	public static void main(String[] args) {

		String a = "홍길동";
		String b = "hong";
		String c = "hong@email.com";
		
		//&& 무조건 조건이 모두 다 맞아야 하는 경우
		if (a == "홍길동" && b == "hong" && c == "hong@email.com") { 
			//System.out.println("해당 사용자 정보를 확인 하였습니다.");
		} 
		else {
			//System.out.println("해당 사용자 정보를 확인 할 수 없습니다.");

		}
		// || 조건이 하나라도 맞으면 적용되는 부분
		if(a=="홍길동"|| b == "hong" || c == "hong@email.com") {
			System.out.println("해당 사용자 정보를 확인 하였습니다..");
		}
		else {
			System.out.println("해당 사용자 정보를 확인 할 수 없습니다.");
		}
		
		int no = 30;
		if(no%2==0 && no%3==0) {
			System.out.println("2의배수 및 3의배수 모두 속합니다.");
		}
		else {
			System.out.println("해당 값은 교집합에 포함 되지 않습니다.");
		}
		
		

	}

}
