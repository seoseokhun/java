import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		/*
		 * ���빮��.��ǰ ������ 42000 �Դϴ�.
		 * ����ڰ� �ش� ��ǰ ������ �Է� �ϰ� �˴ϴ�.
		 * �ش� ��ǰ ���ݿ� �´� ���� ��ƴ ���Ͽ� ���� ���� �ݾ���
		 * ��½�Ű�� extends�� �����Ͻø� �˴ϴ�.
		 * ��, 42000�� ���� ���ڰ� �ٲ�� �ȵ˴ϴ�.
		 * ����ڰ� �ִ� ���� �� �� �ִ� ������ 5�� ���� �Դϴ�.
		 * ������� ���� main method���� ��� �մϴ�.
		 */
		list2 a1 = new list2();
	}

}

class list{
	
	public void list_method() {
		
	}
}
class list2 extends list{
	public void list2_method() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǰ ����");
		int a = sc.nextInt();
	}
}