import java.util.Arrays;
import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {
		/*응용문제
		 *다음 문자 배열 데이터 값이 있습니다.
		 *a1 : 홍길동 이순신 강감찬 유관순 김유신
		 *a2 : 100  80 39 60 55
		 *
		 *"검색하고자 하는 이름을 적어주세요" 출력하게 됩니다.
		 *검색어에 이순신이라고 검색을 하게 되면
		 *이순신님은 80점 입니다.라고 출력이 되어야 합니다.
		 */
		String a1[] = {"홍길동","이순신","강감찬","유관순","김유신"};  //a1 배열
		String a2[] = {"100","80","39","60","55"};   //a2 배열
		Scanner sc = new Scanner(System.in);
		System.out.println("검색하고자 하는 이름을 적어주세요");
		String usernm = sc.next();  //사용자가 입력한 데이터 usernm
		
		jumsu j = new jumsu();
		j.ck(a1,a2,usernm);
		
		
}

}

class jumsu{
	public void ck(String data1[],String data2[],String user) {
		//System.out.println(Arrays.toString(data1));
		System.out.println(user);
	}
}

