import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/*
		 ���빮�� 2
		 ����ڰ� �Է��� ���ڿ� ���� �������� ����� ����Ͽ� ¦�� ���� Ȧ�� ������ ���.
		 "�����ܿ� ���� ���ڸ� �Է��ϼ���?"��� ��� �޼����� ������
		 �ش� ���ڿ� ���缭 ������� ���ϸ�, ���� ���� ���� ¦�� ���� Ȧ�� ������ ����Ͻø� �˴ϴ�.
		 ��, �ش� �ݺ����� for ~ do while������
		 �Ѱ����� �����ؼ� �ۼ��Ͻÿ�.
		 */
		Scanner sc = new Scanner(System.in);
		int gugudan;  //����� �Է� ����
		int f; //�ݺ���
		int total=0;
		for(f=1;f<=9;f++) {
			System.out.println("�����ܿ� ���� ���ڸ� �Է��ϼ���?");
			gugudan = sc.nextInt(); 
			total *= gugudan;
		}
		System.out.println("�������� ������:"+total);
		sc.close();

	}

}
