import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*
		 * ���빮��8 ����� �н������ a1234 �Դϴ�. ����ڰ� �н����带 �Է��մϴ�. ��, 3ȸ �̻� ���н� ������ ���� ��� �ǵ��� �մϴ�.
		 * "�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�." ��, �н����尡 ���� ��� "�α��� �Ǿ����ϴ�."��� ��� �Ǿ�� �մϴ�.
		 */
		final String pw = "a1234";
		int c = 3;
		Scanner sc = new Scanner(System.in);
		int w = 1;
		String msg = "�н����带 �Է��� �ּ���:";
		while(w < 4) {
			String userpw = sc.next();
			if(pw.equals(userpw)) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			break;
			}
			else {
				msg ="�ùٸ� �н����带 �־��ּ���:";
				c--;
				if(c==0) {
				System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
			}
				w++;
			
		}
	}
	}
}
