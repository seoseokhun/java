import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("On&&off �� �ϳ��� �Է��ϼ���");
		
		String onoff=sc.next();
		
		boolean aa = false;
		
		if(onoff.equals("on")) {
			aa = true;
		}
		else {
			aa = false;
		}
		System.out.println(aa);
		
		

	}

}
