package Ab2;

public class app {

	public static void main(String[] args) {
		/*
		members mb = new members();
		mb.opp();
		mb.oop();
		*/
		//(�θ�)=(�ڽ�) => �������̽� �������� ����� �������̵常 ȣ���� (����ȯ)
		//members mb = new members(); //�ڽ� class ����
		//app_data2 ap = mb; //�������̽� ����  (Ŭ���� -> �������̽� ����
		
		app_data2 ap = new members();
		members mb2 = (members)ap;  //(�������̽� -> Ŭ���� ��ȯ)
		
		
		
		
	}

}
/*
 * class members implements app_data1{
 *      app_data1�� ������ �ڷ��� �����ϴ� ���
 *      }
 */

class members implements app_data2{
	@Override
	public void opp() {
		System.out.println("test");
	}
	@Override
	public void opp2() {
		System.out.println("test2");
	}
	
	private void oop() {
		System.out.println("test3");
	}
	
	
}