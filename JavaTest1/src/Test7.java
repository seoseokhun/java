import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ϰ� ������ �ѱ۷� ǥ�� �Ͻʽÿ�?");
		String a = sc.next();
		if(a.equals("����")) {
			System.out.println("red");
			
		}
		else if(a.equals("��Ȳ")) {
			System.out.println("orange");
		}
		else if(a.equals("���")) {
			System.out.println("yellow");
		}
		else if(a.equals("�ʷ�")) {
			System.out.println("green");
		}
		else {
			System.out.println("�ش� �ܾ�� ������ ���� �ʽ��ϴ�.");
		}
			

	}

}
