import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/*
		 ���빮��7
		 ����ڰ� ���� ������ Ȯ���Ͽ� ���� �Է� �� �ش� ����� �����ϴ� ���μ����� �����մϴ�.
		 "ù��° �Է°� ��(1~10����) �Դϴ�."
		 "�ι�° �Է°� ��(1~10����) �Դϴ�."
		 "����° �Է°� ��(1~10����) �Դϴ�."
		 "������ ���� �Դϴ�. �ش� ������ ���� ���� �����ȣ�� �����ÿ�." +,-,*,/
		 
		 �ش� �����ȣ�� �°� ������� �����Ͽ� �������� ��½�Ű�ÿ�.
		 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° �Է°� ��(1~10����) �Դϴ�");
		int a=sc.nextInt();
		System.out.println("�ι�° �Է°� ��(1~10����) �Դϴ�");
		int b=sc.nextInt();
		System.out.println("����° �Է°� ��(1~10����) �Դϴ�");
		int c=sc.nextInt();
		System.out.println("������ ���� �Դϴ�. �ش� ������ ���� ���� �����ȣ�� �����ÿ�");
		String ms = sc.next();
		
		if(ms.equals("+")) {
			System.out.println(a+b+c);
		}
		else if(ms.equals("-")) {
			System.out.println(a-b-c);
			
		}
		else if(ms.equals("*")) {
			System.out.println(a*b*c);
		}
		else {
			System.out.println(a/b/c);
		}
		
		
	}

}
