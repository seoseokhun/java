import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		String[] names = new String[3]; //���� ���� �迭 ������ ��������
		
		String m[]= {"ȫ�浿","�̼���","������"}; //�迭���� �����Ͱ� �ִ� ����
		
		int ct = 0;
		//foreach���� �ε��� ��ȣ�� �����Ƿ� ���Ӱ� �ε��� ��ȣ�� ������ �ֱ� ���� ����
		for(String a : m) {
			
			if(a.equals("ȫ�浿")||a.equals("������")) { //�ش�(����) �迭�� �� ���ǿ� �´� ���� �߷��� ���ο� �迭���� �߰���	
			names[ct] = a;
			ct++; //�ε��� ��ȣ�� ���������� �����ϱ� ���� ������
			}
		}
		//int name_ea = names.length;
		System.out.println(Arrays.toString(names));
		

	}

}