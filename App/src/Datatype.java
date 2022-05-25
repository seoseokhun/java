
public class Datatype {

	public static void main(String[] args) {
		//String : 문자 "" 무조건 사용
		String a = "1234";
		System.out.println(a);
		
		//정수형 자료
		
		byte b = 127, bb = 123; // byte : 0~127
		System.out.println(b);
		
		short c = 32767; //short : -32,768 ~ 32,767
		System.out.println(c);
		
		int d = 1000000000 , d1 = 2000000000; // -2,147,483,648 ~ 2,147,483,647
		System.out.println(d);
	
		long f = 123123123L; // long 사용시 끝에 L 붙어야함 
		// 0의 갯수 18개 , 기본메모리 할당에서 추가 적용시 가능 범위가 늘어남
		System.out.println(f);
		//정수형 끝
		
		// 실수형 자료
		float z = 3.5f; // 3.402 + 38 (f는 무조건 사용해야함)
		System.out.println(z);
		
		double k = 44.5; // 1.784 + 308 (d 유/무 모두 가능)
		System.out.println(k);
		
		long f1 = d+d1;
		System.out.println(f1);
	}

}
