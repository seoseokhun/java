import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int data[] = { 5, 10, 15, 20, 25, 30, 35 };
		/*
		 * foreach���� ����� ���� �ε��� ��ȣ�� �ʿ���� ����� ��� for~do~while�� ����� ���� �ε��� ��ȣ�� �ʿ��� �� ���
		 * �ε�����ȣ : [0][1][2]
		 */
		for (int f : data) { // int f�� ���������� data �迭���� �޾Ƽ� ���� ��ŵ�ϴ�.
			if (f % 2 == 0) {
				// System.out.println(f);
			}
		}

		String pay[] = { "�������Ա�", "�ſ�ī��", "�޴���", "��ǰ��", "����" };
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ϰ��� �ϴ� ���¸� ������ �ּ���:");
		String pm = sc.next();
		for (String z : pay) { // �迭 �����Ͱ� ���� �̹Ƿ� �޴� �������� ���� �������� ����ؾ� �մϴ�.
			if (pm.equals(z)) {
				if (z.equals("�޴���")) {
					//System.out.println("���� �ý��� �������� �ش� ������ ����Ͻ� �� �����ϴ�.");
				} else {
					//System.out.println(pm + "�� ���� ���� �˴ϴ�.");
				}
			}
		}
		sc.close();
		
		
		
		
		
		
		
		
		
		

	}

}
