/* �θ�Ŭ���� �� �ڽ�(����)Ŭ���� ���� */
public class Class1 {

	public static void main(String[] args) {
		/* �θ� �ν��Ͻ��� ������ ���� ������ �ڽ� Ŭ������ ���� ȣ�� ���� ����*/
		parents p = new parents();
		p.p_box();
		parents.child pc = p.new child(); //�θ�class.�ڽ�class �̸�����= �θ�Ŭ������. new �ڽ�Ŭ������ (�ν��Ͻ��� ����)
		pc.c_box();
		

	}

}

class parents { // �θ� class
	String a = "ȫ�浿"; //�θ� �ʵ忡 �ִ� �������� (this)  >���������� ���� this<
	String b;
	class child { // �ڽ�class
		int a = 20;

		public void c_box() { //�ڽ� method
			double c = 10.5;
			System.out.println(c);  //�ڽĸ޼ҵ� ���� ��������
			System.out.println(this.a); //�ڽ�Ŭ���� ���� �������� 
			System.out.println(parents.this.a); //�θ� Ŭ���� ���� ��������
			System.out.println(parents.this.b);
		}
	}
	
	public void p_box() { //�θ� method
		String a = "�̼���"; // P_box�� �ִ� �������� ����
		System.out.println(this.a);
		this.b = a;
	}

}
