
public class Class2 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ���� Ŭ������ �̿��Ͽ� �ڽ� Ŭ������ ������� ����ϴ� ���μ����� �����Ͻÿ�.
		 * Ŭ������ 2���� �ֽ��ϴ�. 
		 * �θ� Ŭ���� ���� : mother
		 * �ڽ� Ŭ���� ���� : child
		 * ���� Ŭ�������� mother Ŭ������ ���� ���� ����
		 * 30 50 ���ڰ��� �����մϴ�. 
		 * child���� �θ� Ŭ������ �ִ� ���� �޾� 
		 * �ΰ��� ���ڸ� ���� ��� ���� ����Ͻÿ�
		 */
		mother m = new mother();
		m.mc1();
		mother.child mcd = m.new child();
		mcd.mc(30,50);
	}
}
class mother{
	
	class child{
		
		public void mc(int a,int b) {
			int aa = a*b;
			System.out.println(aa);
		}
	}
	public void mc1() {
		
	}
	
}

