import java.util.ArrayList;
import java.util.Arrays;

public class Class4 {

	public static void main(String[] args) {
		/*
		 * �迭 ������ : ȫ�浿 �̼��� ������ 3���� �����Ͱ� �ֽ��ϴ�.
		 * ���� Ŭ�������� ���ڸ� �ϳ� ���� �մϴ�.
		 * ��, ���ڰ� null�� ���� �� ������, �迭 �����Ϳ� ���� ���� "������" �̶��
		 * ���� ���� �ֽ��ϴ�.
		 * �ܺ� Ŭ������ : data_list �̸� 
		 * �߻� Ŭ������ : v_constuct �Դϴ�
		 * �ܺ� Ŭ���� �ȿ� ���� Ŭ���� ���� : check �Դϴ�.
		 * 
		 * [�������]
		 * ���� class���� �������� ������ ���
		 * ���� Ŭ�������� "�ش� ����ڴ� �����ڰ� �ƴմϴ�." ��� ���
		 * ���� class���� �̼����� ������ ���
		 * ���� Ŭ�������� "�ش� ����ڰ� �ֽ��ϴ�" ��� ���
		 * ��, ArrayList�� �迭�� �ε� �Ͻʽÿ�.
		 */
		data_list da = new data_list();
		da.userinput("������");
		
	}

}
abstract class v_constuct{
	String user_name;
	String data_list[];
	public abstract void userinput(String nm);
}
class data_list extends v_constuct{
	
	@Override
	public void userinput(String nm) {
		if(nm==null) {
			System.out.println("����� �̸��� �Է��ϼž� �մϴ�.");
		}
		else {
			this.user_name = nm;
			check ck = new check();
			ck.db();
		}
	}
	class check{
		//�θ� Ŭ�������� ���� ���� �ڽ� Ŭ������ �̰�
		String user_name = data_list.this.user_name; 
		String data_list[]; //�ʵ忡 �迭�� �޴� ��ü ����
		ArrayList<String> ar = null;  //ArrayList util�� �ʵ忡 ��ü ����
		public void db() {
			//�ش� �ʵ忡 �ִ� ArrayList�� �ν��Ͻ��� ������
			this.data_list = new String[] {"ȫ�浿","�̼���","������"};
			this.ar = new ArrayList<>(Arrays.asList(this.data_list)); //this�� ó��
			this.compare(); //���� DB �� ����� ������ ���ϴ� �޼ҵ�
		}
		public void compare() {
			int ea = this.ar.size();
			int w=0;
			boolean bl = false; //��� Ȯ��
			do {
				if(this.user_name.equals(this.ar.get(w))) {
					bl = true;
				}
				w++;
			}while(w<ea);
			if(bl==true) {
				System.out.println("�ش� ����ڰ� �ֽ��ϴ�.");
			}
			else {
				System.out.println("�ش� ����ڴ� �����ڰ� �ƴմϴ�.");
			}
		}
	}
	
}

