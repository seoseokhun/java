public class Test3 {

	public static void main(String[] args) {
		int a = 61;
		
		if(a>=61) {
			System.out.println("해당 숫자는 60까지만 입력이 되어야 합니다.");
		}
		else if(a<=61) {
			if(a%2==0) {
				System.out.println("짝수 값 입니다.");
			}
		}
		else {
			if(a%2==1) {
				System.out.println("홀수 값 입니다.");	
			}
		}
		


	}

}
