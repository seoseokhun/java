
public class oop4 {
	//�߻� Ŭ���� �� �޼ҵ� abstract
	public static void main(String[] args) {
		ab_2 ab = new ab_2();
		//System.out.println(ab.b());
		ab.ab_c();
		//System.out.println(ab.c());
		
		

	}

}

abstract class ab_1{ //�߻� Ŭ���� (�ܺο��� �ε尡 ���� �ȵ�) - ��ü ����(X)
	public int c;
	public void abc_a() { //free   (�μ��� ���� �߻� �޼ҵ�) - ����ص� �ǰ� ���ص� �ǰ�
		this.c = 123456;
		
	}
	public void ab_a(int a) { //free (�μ��� �޴� �߻� �޼ҵ�)	
	}
	
	public abstract void ab_c(); //free ���� ������ �ڽ� Ŭ���� ���
	public abstract int b(); //�߻� �޼ҵ� - ��ü ����(X)
	
}
class ab_2 extends ab_1{
	@Override
	public void ab_c() {
		
	}
	@Override
	public void ab_a(int a) {
		System.out.println(this.c());
	}
	@Override
	public int b() { //���� �޼ҵ� + �߻� �޼ҵ�
		return 55;
	}
	public int c() {
		return 99;
	}
}