import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���ڰ��� �Է��ϼ���");
		int user1 = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("�ι�° ���ڰ��� �Է��ϼ���?");
		int user2 = sc2.nextInt();
		
		int user3 = user1 * user2;
		if(user3 < 100) {
			System.out.println("100������ ������Դϴ�.");
		}
		else {
			System.out.println("100�̻��� ������Դϴ�.");
		}
		sc.close();
		sc2.close();
				
		
		
		
		 
		 

	}

}
