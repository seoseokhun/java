import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ����ڰ� ������ ���� ������ �޽��ϴ�.
		 * Q."1~5"�� ���� ���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�.
		 * 
		 * ��� ����
		 * 1 : 5%��������
		 * 2 : 10%��������
		 * 3~4: �ù�񹫷�
		 * 5: ������ȸ��
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("1~5�� ���� ���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�.");
		String user = sc.next();
		switch(user) {
		case "1":
			System.out.println("5%��������");
			break;
		case "2":
			System.out.println("10%��������");
			break;
		case "3":
			System.out.println("�ù�񹫷�");
			break;
		case "4":
			System.out.println("�ù�񹫷�");
			break;
		default:
			System.out.println("���� ��ȸ��");
			break;
		}
		
		/*
		 * switch version���� 
		 */
		
		
		
		
		
		
		
	}

}
