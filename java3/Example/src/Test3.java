
public class Test3 {

	public static void main(String[] args) {

		String a = "ȫ�浿";
		String b = "hong";
		String c = "hong@email.com";
		
		//&& ������ ������ ��� �� �¾ƾ� �ϴ� ���
		if (a == "ȫ�浿" && b == "hong" && c == "hong@email.com") { 
			//System.out.println("�ش� ����� ������ Ȯ�� �Ͽ����ϴ�.");
		} 
		else {
			//System.out.println("�ش� ����� ������ Ȯ�� �� �� �����ϴ�.");

		}
		// || ������ �ϳ��� ������ ����Ǵ� �κ�
		if(a=="ȫ�浿"|| b == "hong" || c == "hong@email.com") {
			System.out.println("�ش� ����� ������ Ȯ�� �Ͽ����ϴ�..");
		}
		else {
			System.out.println("�ش� ����� ������ Ȯ�� �� �� �����ϴ�.");
		}
		
		int no = 30;
		if(no%2==0 && no%3==0) {
			System.out.println("2�ǹ�� �� 3�ǹ�� ��� ���մϴ�.");
		}
		else {
			System.out.println("�ش� ���� �����տ� ���� ���� �ʽ��ϴ�.");
		}
		
		

	}

}
