import java.util.Arrays;

public class example5 {

	public static void main(String[] args) {
		/* 2차 배열 + 기본(클래스)메소드 문제
		 * 등록된 고객중 vip 고객만 리스트를 출력하시오.
		 * 
		 * user_list : 홍길동 이순신 강감찬 유관순 세종대왕 김유신 계백장군
		 * user_level : gold vip guest gold vip vip guest
		 * 
		 * 결과출력 : 이순신 세종대왕 김유신
		 * 
		 * [그룹인덱스][데이터인덱스]
		 */
		String user_list[][] = {
		{"홍길동", "이순신", "강감찬", "유관순", "세종대왕", "김유신", "계백장군"},
		{"gold", "vip", "guest", "gold", "vip", "vip", "guest"}
		};
		example5 ex = new example5();
		ex.level(user_list);

	}
	public void level(String data[][]) {
		int gp = data.length; // 2
		int ea = data[0].length;  // 7
		//System.out.println(ea);
		int w=0;
		while(w<gp) {
			int ww = 0;
			while(ww<ea) {
				if(data[w][ww].equals("vip")) {
					System.out.println(data[0][ww]);
				}				
				ww++;;
			}
			w++;
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		while(w<ea) {
			if(data[1][w].equals("vip")) {
				System.out.printf("%s ",data[0][w]);
			}
			w++;
		}
		/*
		int ea = a[0].length;
		int w = 0;
		int total;
		while(w<ea) {
			if(!a[1][w].equals("gold")&&!a[1][w].equals("guest")) {
				System.out.println(a[0][w]);
				
			}
			w++;
		}
		*/
	}

}
