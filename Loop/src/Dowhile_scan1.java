import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		/*
		 ���빮��
		 ����ڰ� �� 3���� ���ڸ� �Է� �մϴ�.
		 3�� ���ڸ� ��� ���Ͽ� �� �հ� ���� ����Ͻÿ�.
		 */
		Scanner sc = new Scanner(System.in);
		int w = 1;
		int user;
		long total = 1;  // long�� �Է½� ����������� -���� �߻���
		do {
			System.out.println(w+"��° ���ڸ� �Է��ϼ���");
			 user = sc.nextInt();
			total = total * user;
			w++;
		}while(w < 4);
		System.out.print("�� ������ ����:"+total);
		sc.close();
	}

}
