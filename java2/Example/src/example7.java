import java.util.Arrays;

public class example7 {

	public static void main(String[] args) {
		/*
		 ������ �迭�� ���� + �ܺ� class �� �޼ҵ� ���
		 [data]
		 {"ȫ�浿","�հ�"},
		 {"�̼���","�հ�"},
		 {"������","����"},
		 {"������","�հ�"},
		 {"������","����"},
		 {"�庸��","����"}
		 ������ �迭 �����̸�, �ش� ���� �հ��ڸ� ��µǵ��� �մϴ�.
		 ��, �迭���� �ܺ� Ŭ���� �ȿ� �޼ҵ忡�� ó���� �ǵ��� �մϴ�.
		 ��� : ȫ�浿 �̼��� ������
		 */
		//Test.name();
		Test t = new Test();
		t.name();
		t=null;
		
		

	}

}
class Test{
	
	public static void name() {
		String std[][]= {
				{"ȫ�浿","�հ�"},
				{"�̼���","�հ�"},
				{"������","����"},
				{"������","�հ�"},
				{"������","����"},
				{"�庸��","����"}
		};
		int ea = std.length;
		int w = 0;
		while(w<ea) {
			if(std[w][1].equals("�հ�")) {
				System.out.printf("%s�� %s �Դϴ�.\n",std[w][0],std[w][1]);
				
			}
			w++;
		}
		
	}
}