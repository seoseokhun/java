import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/*
		 ���빮��3.
		 ����ڰ� �ش� ���� �Է��մϴ�.
		 �� ����� �ΰ��� ���ڸ� �Է��ϵ� ù��° ���ڿ� �ι�° ���� ����
		 �ȿ� �ִ� ��� ���ڸ� ���ؼ� ������� �������� �����Ͻÿ�.
		 ��, �ش� �ڵ�� do~while �ۼ��մϴ�.
		 
		 ����)
		 ù��° ���� ���ڴ�? 5
		 �ι�° ���� ���ڴ�? 10
		 ���� ���� ��� �հ�� : 45 �Դϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int a = sc.nextInt();
		System.out.print("�ι�° ���� ���ڴ�?");
		int b = sc.nextInt();
		int total = 0;
		do {
			total = total + a;
			a++;
		
		}while(a <= b);
		System.out.printf("���� ������ �հ�ġ��:%d",total);
		sc.close();
	}

}
