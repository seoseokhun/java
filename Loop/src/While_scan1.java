import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		/*
		 ���빮�� �� 2���� ������ �ϰ� �˴ϴ�.
		 ����ڰ� ���ڸ� �Է��Ͽ� �� ���� ���� ���ϴ� scanner�� �����Ͻÿ�.
		   
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int user;
		int total=0;
		while(a <= 2) {
			System.out.println(a+"��° ���ڸ� �Է��� �ּ���");
			user = sc.nextInt();
			total = total + user;
			a++;
		}
		System.out.println("�� ������ ����:"+total);
		sc.close();

	}

}
