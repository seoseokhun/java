public class Example4 {

	public static void main(String[] args) {
		/*
		 * ���빮�� �ΰ��� ���� �ܺ� Ŭ������ �����ϴ�.
		 * �ش� Ŭ�������� �ΰ��� ���� ����ϰ� �˴ϴ�.
		 * ������� ������ �����ϴ�.
		 * 3,10�� ������ �Ǹ� �ΰ��� ���� ���� ���մϴ�.
		 * ������ �ܺ� Ŭ�������� �ش� ������� ����ϴµ�.
		 * �ΰ��� �� ���� ¦��, Ȧ�� ������ ����ϴ� extends�� ���� �ϼ���.
		 */
		int a = 10;
		int b = 5;
		ex2 ab = new ex2();
		ab.ex1_method(a,b);
		ab.ex2_method();
		
	}

}

class ex1 { //����� �޴� ��Ȱ
	protected int c;
	
	public void ex1_method(int a, int b) {
		this.c = a + b;
	}
	
}

class ex2 extends ex1 { //����� ����ϴ� ��Ȱ
	public void ex2_method() {
		if(this.c%2==0) {
			System.out.println("¦���� �Դϴ�.");
		}
		else {
			System.out.println("Ȧ���� �Դϴ�.");
		}
	}
}


