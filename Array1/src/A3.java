import java.util.Arrays;
import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		/*
		 * ���빮�� {"�ܹ���","����","ġŲ","Ŀ��"} �ش� ������ �� 4���� ����� �˴ϴ�. ��, "�ֹ�����"��� ����ڰ� �Է½� �� ���
		 * �ֹ��� ����Ǹ� �ֹ������� ����Ͻø� �˴ϴ�.
		 */
		String menus[] = { "�ܹ���", "����", "ġŲ", "Ŀ��" };
		Scanner sc = new Scanner(System.in);
		String user;
		String user_menu[] = new String[4];
		int ct = 0;
		for (String f : menus) {
			/*
			 * Scanner�� �ݺ��� �ȿ� ����� loop�� ������ �ݺ������� ����
			 * ����ڰ� �Է��� ������ �ݺ��� ������ŭ ����ϴ� ������
			 * 
			 */
			System.out.println("�޴��� ������ �ּ���?");
			user = sc.next();
			if (user.equals("�ֹ�����")) {
				break;
			} else {
				for (String ff : menus) {
					if (user.equals(ff)) {
						user_menu[ct] = ff;
						ct++;
					}
				}
			}
			sc.close();
			System.out.println("�ֹ��Ͻ� �޴��� ������ �����ϴ�." );
		}

		
		
		
		
		
		
		
		
		
		/*
		 * ���빮�� �迭(Araay) ����ڰ� ��ٱ��Ͽ� ������ ���� �ϰ� �˴ϴ�. ��, �ش� �ݾ� ����Ʈ�� ������� ����, ���� ��ü �����ݾ׸�
		 * ��� �ǵ��� �մϴ�. 1500 22000 13000 14500 113800 45000
		 */

	}

}
