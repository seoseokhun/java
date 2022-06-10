public class Example4 {

	public static void main(String[] args) {
		/*
		 * 응용문제 두개의 값을 외부 클래스로 보냅니다.
		 * 해당 클래스에서 두개의 값을 계산하게 됩니다.
		 * 계산형식 다음과 같습니다.
		 * 3,10을 보내게 되면 두개의 값을 합을 구합니다.
		 * 나머지 외부 클래스에서 해당 결과값을 출력하는데.
		 * 두개의 합 값이 짝수, 홀수 인지를 출력하는 extends를 구현 하세요.
		 */
		int a = 10;
		int b = 5;
		ex2 ab = new ex2();
		ab.ex1_method(a,b);
		ab.ex2_method();
		
	}

}

class ex1 { //결과를 받는 역활
	protected int c;
	
	public void ex1_method(int a, int b) {
		this.c = a + b;
	}
	
}

class ex2 extends ex1 { //결과를 출력하는 역활
	public void ex2_method() {
		if(this.c%2==0) {
			System.out.println("짝수값 입니다.");
		}
		else {
			System.out.println("홀수값 입니다.");
		}
	}
}


