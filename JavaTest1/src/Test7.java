import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("번역하고 색상을 한글로 표기 하십시오?");
		String a = sc.next();
		if(a.equals("빨강")) {
			System.out.println("red");
			
		}
		else if(a.equals("주황")) {
			System.out.println("orange");
		}
		else if(a.equals("노랑")) {
			System.out.println("yellow");
		}
		else if(a.equals("초록")) {
			System.out.println("green");
		}
		else {
			System.out.println("해당 단어는 번역이 되지 않습니다.");
		}
			

	}

}
