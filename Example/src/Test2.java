import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int money = 100000;
		Scanner sc = new Scanner(System.in);
		System.out.println("1�� �Է½� �Ա�, 2�� �Է½� ��� �Դϴ�.");
		int a = sc.nextInt();
		int total;
		Scanner cal = new Scanner(System.in);
		if(a==1) {
			System.out.println("�Ա� �ݾ��� �Է��ϼ���:");
			total = cal.nextInt();
			money = money + total;
		}
		else if(a==2) {
			System.out.println("��� �ݾ��� �Է��ϼ���:");
			total = cal.nextInt();
			money = money - total;
		}
		else {
			System.out.println("�������� �ڵ尡 �ƴմϴ�.");
			sc.close();
		}
		
		System.out.println("ó���� ������ ������ �����ϴ�."+money+"��");
		cal.close();
		sc.close();
		
	}

}
