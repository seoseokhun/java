
public class Test4 {

	public static void main(String[] args) {
		/*
		 * 응용문제 외부 class를 이용하여 해당 메소드 값을 출력합니다.
		 * 외부 class 명 books 이며, 안에 메소드는 총 3개의 메소드가 존재 합니다.
		 * 메소드명 각각 book1, book2, book3 으로 이루어져 있습니다.
		 * book1은 호출시 "book1메소드"라고 출력
		 * book2은 호출시 "book2메소드"라고 출력
		 *book3은 호출시 "book3메소드"라고 출력
		 */
		books a = new books();
		//a.book1(35);
		//a.book2("바둑이");
		//a.book3("홍길동",40);
		//int z3 = a.book4(9,20);
		a.book5(4);
		
		//System.out.println(z3);
		
		/*
		int pp = a.book4();
		System.out.println(pp);
		*//*return 메소드에 숫자 9와 20을 인수값을 전달 합니다. 해당 두개의 값을 곱하여 결과값을 출력하시오.*/
		/*book5에 숫자를 하나 인수값으로 전달합니다.
		 * 하나 인수값을 받은 book5에서는 무조건 100,200을 더한 값과 인수값을 곱하여 결과값을 출력하시오
		 * 인수값 : 4
		 * (100+200)*4
		 * 결과 : 1200 */
	}

}
class books{ //class는 무조건 method가 있어야합니다.
	String zz="정답";
	int c1 = 100+200;
	
	
	
	public void book1(int a1) {
		//System.out.println(a1+this.zz);
	}
	public void book2(String a2) {
		//System.out.println(a2+this.zz);
	}
	public void book3(String a3,int a4) {
		//System.out.println(a3+","+a4+this.zz);
	}
	public int book4(int z1, int z2) {
		
		int aaa = z1 * z2;
		return aaa; //
	}
	public void book5(int q1) {
		System.out.println(this.c1*q1);
		
		
	}

}
