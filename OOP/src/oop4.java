
public class oop4 {
	//추상 클래스 및 메소드 abstract
	public static void main(String[] args) {
		ab_2 ab = new ab_2();
		//System.out.println(ab.b());
		ab.ab_c();
		//System.out.println(ab.c());
		
		

	}

}

abstract class ab_1{ //추상 클래스 (외부에서 로드가 절대 안됨) - 자체 실행(X)
	public int c;
	public void abc_a() { //free (인수값 없는 추상 메소드) - 사용해도 되고 안해도 되고
		this.c = 123456;	
	}
	public void ab_a(int a) { //free (인수값 받는 추상 메소드)	
		
	}
	
	public abstract void ab_c(); //free 구성 무조건 자식 클래스 사용
	public abstract int b(); //추상 메소드 - 자체 실행(X)
	
}
class ab_2 extends ab_1{
	@Override
	public void ab_c() {
		
	}
	@Override
	public void ab_a(int a) {
		System.out.println(this.c());
	}
	@Override
	public int b() { //실제 메소드 + 추상 메소드
		return 55;
	}
	public int c() {
		return 99;
	}
}