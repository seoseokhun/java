import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		 * ���빮�� 9 
		 * A�л��� ���� ������ �Է� �ް� ��������� ������ ���α׷��� �����մϴ�. 
		 * "������ �Է��ϼ���?" ��� ������ �� 5���� �����ԵǸ�, ��� ������ �ջ��Ͽ� ����մϴ�. 
		 * �������� : ��� ������ �ջ��� ��, 5���� ������ ���� ��հ��� ����ϼž� �մϴ�. 
		 * ��¸޼����� "�ش������� ������ : " ���
		 * ��, ���� ������ 40�� ������ ���, "������Դϴ�."��� �޼����� ����� ���μ����� �����մϴ�. 40��
		 * �̻��ΰ�� "�հ�"�̶�� �޼����� ����Ͻʽÿ�. 
		 * [�߰���ȹ] "�Է��Ͻ� ���� ���� �����ּ��� : " ��� ���� ���� ����� �ش���� ��
		 * ��ŭ �ݺ����� ������ �Ǹ�, ����� ��ŭ ��հ��� ����Ǿ�� �մϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��Ͻ� ���� ���� �����ּ��� : ");
		int a;
		int sub = sc.nextInt();
		int b;
		int total = 0;
		
		for (b = 1; b <= sub; b++) {
			System.out.println("������ �Է��ϼ���? ");
			a = sc.nextInt();
			total += a;
		}

		int average = total / sub;
		System.out.printf("�ش������� ������ : %d", average);

		if (average <= 40) {
			System.out.println("\n������Դϴ�.");
		} else {
			System.out.println("\n�հ�");
		}
		sc.close();
	}

}
