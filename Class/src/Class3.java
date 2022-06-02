
public class Class3 {
	

	public static void main(String[] args) {
		//자료형(데이터형) 변환
		//double -> int로 변환
		double a = 137.5;
		int b = (int)a;
		
		//int -> double로 변환
		int c = 35;
		double d = (double)c;
		System.out.println(d);
		
		//String -> int
		String x = "35";
		String x2 = "156";
		//int z = Integer.parseInt(x); //parseInt (int형에 사용하는 산술연산 언어임)
		int z = Integer.valueOf(x); //valueOf 클래스 메소드(메소드함수) -> parseInt
		int total = Integer.parseInt(x) +Integer.parseInt(x2); 
		//->문자형을 숫자로 변환하여 산술계산을 처리함
		System.out.println(total);
		
		//Long 사용시 Long.parseLong 사용함
		String j = "923456789";
		String j2 = "9234567892";
		//int total2 = Integer.parseInt(j) + Integer.parseInt(j2);
		Long total2 = Long.parseLong(j2) + Long.parseLong(j2);
		double total3 = (double)total2;
		System.out.println(total2);
		System.out.println(total3);
		
		//문자(char) -> 문자(String) : 기본지식만 제공
		char p = 'M';
		String f =String.valueOf(p); //문자 -> 문자 (valueOf)만 사용
		System.out.println(f);
		
		

	}

}
