package Ab2;

public class Example1 {

	public static void main(String[] args) {
		home h[] = {new computer(), new monitor()};
		home2 h2[]= {new phone()}; //extends�� home�� �ε��Ͽ���
		
		//phone ph = new phone();
		//ph.broken(0);
		h[0].broken(40);
		h[1].broken(0);
		

	}

}

class computer implements home{
	@Override
	public void poweron() {
		System.out.println("��ǻ�� ���� ������");
	}
	@Override
	public void poweroff() {
		System.out.println("��ǻ�� ���� �ߴ�");
		
	}
	@Override
	public void broken(int n) {
		if(this.bk <= n) {
			System.out.println("��ǻ�� ����");
		}
		else if(this.bk > n&&n > 0) {
			this.poweron();
		}
		else {
			this.poweroff();
		}
		
	}
}
class monitor implements home{
	@Override
	public void poweron() {
		System.out.println("����� ���� ������");
		
	}
	@Override
	public void poweroff() {
		System.out.println("����� ���� �ߴ�");
		
	}
	@Override
	public void broken(int n) {
		if(this.bk <= n) {
			System.out.println("����� ����");
		}
		else if(this.bk > n&&n > 0) {
			this.poweron();
		}
		else {
			this.poweroff();
		}
		
		
	}
	
}
/* �޴����� �߰� ����� �ʿ���
 * �޴��� ����� �ּ����� (20) -> �����۵� 40�̻� 80�̻�Ǹ� (����)
 * 1.������ ���޵����� ȭ���� ���峯 ��� (������ �۵��� �ȵǴ� ���) - 20~39����
 * 2.������ ���޽�Ű���� ���͸� ������ �ȵ� ��� (������ �ƿ� �ȵǴ� ���) - 20 �̸� ������ ���
 * */
class phone implements home,home2{  
	@Override
	public void powerchk1() { // 20~39
		System.out.println("������ ���� ������ �ȵ� ���");
	}
	@Override
	public void powerchk2() {
		System.out.println("������ ���޽�Ű���� ���͸� ������ �ȵ� ���");
	}
	@Override
	public void poweron() {
		
		System.out.println("�޴��� ���� ������");
	}
	@Override
	public void poweroff() {
		System.out.println("�޴��� ���� �ߴ�");
	}
	@Override
	public void broken(int n) {
		if(this.bk <= n) {
			System.out.println("�޴��� ����");
		}
		else if(this.bk > n&&n > 0) {
			if(n<20) {
				this.powerchk2();
			}
		}
		else if(n>=20&&n<=39) {
			this.powerchk1();
		}
		
		else {
			this.poweron();
		}	
	}
	
	
}
