import java.util.Scanner;

public class example6 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * 2�� �迭�̸�, 2���迭 �����ʹ� ������ �����ϴ�.
		 * user_list : ȫ�浿 �̼��� ������ ������ ������� ������ ����屺
		 * user_point : 3000 1000 25000 19800  5750  3630    0
		 * ���α׷� ���۰� ���ÿ�
		 * "����Ʈ�� �˻��� ������ �Է��ϼ���?"
		 * �Է��� ���� ������ class�� �����Ͽ� �ش� �޼ҵ� ������ �Ű������� 
		 * �̿��Ͽ� ���� �� �ش� ��� ���� ����Ͻø� �˴ϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ʈ�� �˻��� ������ �Է��ϼ���?");
		String input = sc.next();
		
		point p = new point();
		p.name(input);
		sc.close();
		p = null;

	}
	

}
class point{
	
	public void name(String nm) {
		String data[][] = {
				{"ȫ�浿","�̼���","������","������","�������","������","����屺"},
				{"3000","1000","25000","19800","5750","3630","0"}
		};
		int w = 0;
		int ea = data[0].length;
		while(w<ea) {
			if(nm.equals(data[0][w])) {
				System.out.printf("%s���� ����Ʈ�� %s �Դϴ�.",data[0][w],data[1][w]);
			}
			w++;
		}
	}
}
