
public class Over {

	public static void main(String[] args) {
		
		//pt p = new pt();
		//p.display();
		cd c = new cd();
		c.display("���� ���� �� ���"); // �����ε�
		c.display();    //�������̵�
		

	}

}
/*
 * �����ε�(overloading) : ���ο� �޼ҵ带 �����ϴ� ���� ���մϴ�.
 * �������̵�(override) : �θ� Ŭ�������� ��� ���� ���� �޼ҵ带 ����ϴ� ���� ���մϴ�.
 */
class pt{
	public void display() {
		System.out.println("�θ� �ܺ� ���� ��");
	}
	public void aaaa() {
		
	}
}

class cd extends pt{
	/*
	 * aaaa() �޼ҵ�� �������̼��� ������� ���� �θ� class���� �������� �ʾ���
	@Override
	public void aaaa() {
		System.out.println("�ڽĿ� ������� �޼ҵ�");
	}
	*/
	
	@Override //�������̼� (ǥ��) ���� �߻��� Ȯ���ϴ� �۾� (�������̵忡�� ��)
	public void display() { //�������̵�
		System.out.println("�ڽ� Ŭ���� ������ ����??");
		super.display(); //�θ𿡴� ���� �Ӽ� �޼ҵ尪�� ������ �� ����մϴ�.
	}
	public void display(String msg) {   //�����ε�
		System.out.println(msg);
	}
}