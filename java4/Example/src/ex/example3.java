package ex;

import java.util.ArrayList;
import java.util.Arrays;

public class example3 {

	public static void main(String[] args) {
		/* 
		 * 응용문제.(숙제)
		 * 가입된 회원정보 중 현재 데이터에서 포인트가 적은 순서대로
		 * 사용자 이름을 정렬하여 출력 합니다.
		 * 
		 * 결과
		 * [정재성,한울,서한솔,강은형,김도형,서한결,홍길동,김실,이선영,차은우,정재혁]
		 * - 프로세서 코드 제작 무조건 FREE -
		 * 
		 * 응용문제.가입된 모든 회원의 포인트 총 합을 구하시오.
		 * 단, abstract을 무조건 사용해야 합니다.
		 * 
		 * 결과: "회원 전체의 포인트 합계는 : 34390 입니다."
		  */
		plus ps  = new plus();
		ps.setter();
		int a = ps.getter();
		System.out.println("회원 전체의 포인트 합계는 :"+ a + "입니다.");
	}

}
abstract class abc{
	String arr[][];
	int total = 0;
	ArrayList<String[]> userdb = null;
	public abstract void setter();
	public abstract int getter();
	public abstract void db();
}
class plus extends abc{
	@Override
	public void setter() {
		this.db();
		//System.out.println(this.userdb.get(0)[6]);
		int ea = this.userdb.size();
		int w =0;
		while(w<ea) {
			this.total += Integer.parseInt(this.userdb.get(w)[6]); 
			
			w++;
		}
		
		
	}
	@Override
	public int getter() {
		
		return this.total;
	}
	@Override
	public void db() {
		this.arr = new String[][] {
			 {"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
			 {"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"},
			 {"서한솔","LG","010-1267-4112","37","종로구","soso4112@naver.com","1200"},
			 {"정재성","SKT","010-3221-8871","41","강남구","jsung_kks@naver.com","700"},
			 {"한울","KT","010-2455-4879","22","금천구","han1004@nate.com","920"},
			 {"강은형","SKT","010-3770-4009","34","종로구","kans32@gmail.com","1250"},
			 {"김실","KT","010-1606-3137","20","은평구","kimsil_love@nate.com","4505"},
			 {"서한결","SKT","010-3412-0902","31","금천구","hanso12@nate.com","2125"},
			 {"정재혁","LG","010-4557-8282","30","은평구","jehyuk@naver.com","8160"},
			 {"이선영","KT","010-3738-4800","55","강서구","sunyoung@nate.com","4510"},
			 {"차은우","SKT","010-5242-0879","42","강남구","chreey@gmail.com","6720"}
};
this.userdb = new ArrayList<String[]>(Arrays.asList(arr));
		
	}
}


