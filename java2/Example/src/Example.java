import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		/*
		 * 배열 + 기본(클래스)메소드문제.
		 * 1차배열에 다음과 같이 값이 있습니다.
		 * 배열리스트 22 33 44 55 66 77 88 99 이며
		 * 해당 전체 값을 모두 더한 총 합계값을 별도의 메소드로
		 * 처리 되도록 합니다. 단, 반복문은 무조건 do~while문 작성합니다.
		 */
		int a[] = {22,33,44,55,66,77,88,99};
		//void = 객체생성 + 인스턴스(메모리) 등록
		datas(a);
	}
	
	
	public static void datas(int bb[]) {
		int ea = bb.length; //배열 갯수파악
		int w=0;
		int total = 0;
		do {
			total = total + bb[w];
			w++;
			
		}while(w<ea);
		
		System.out.println("총 합계값은:" + total);
		
		
		
	}

}
