
public class Test4 {

	public static void main(String[] args) {
		
	
		/*
		 * ���빮�� �ܺ� class�� �̿��Ͽ� �ش� �޼ҵ� ���� ����մϴ�.
		 * �ܺ� class �� books �̸�, �ȿ� �޼ҵ�� �� 3���� �޼ҵ尡 ���� �մϴ�.
		 * �޼ҵ�� ���� book1, book2, book3 ���� �̷���� �ֽ��ϴ�.
		 * book1�� ȣ��� "book1�޼ҵ�"��� ���
		 * book2�� ȣ��� "book2�޼ҵ�"��� ���
		 *book3�� ȣ��� "book3�޼ҵ�"��� ���
		 */
		books a = new books();
		a.book1(35);
		a.book2("�ٵ���");
		a.book3("ȫ�浿",40);
		int z3 = a.book4(9,20);
		System.out.println(z3);
		/*
		int pp = a.book4();
		System.out.println(pp);
		*//*return �޼ҵ忡 ���� 9�� 20�� �μ����� ���� �մϴ�. �ش� �ΰ��� ���� ���Ͽ� ������� ����Ͻÿ�.*/
		/*book5�� ���ڸ� �ϳ� �μ������� �����մϴ�.
		 * �ϳ� �μ����� ���� book5������ ������ 100,200�� ���� ���� �μ����� ���Ͽ� ������� ����Ͻÿ�
		 * �μ��� : 4
		 * (100+200)*4
		 * ��� : 1200 */
	}

}
class books{ //class�� ������ method�� �־���մϴ�.
	String zz="����";
	
	
	
	public void book1(int a1) {
		System.out.println(a1+this.zz);
	}
	public void book2(String a2) {
		System.out.println(a2+this.zz);
	}
	public void book3(String a3,int a4) {
		System.out.println(a3+","+a4+this.zz);
	}
	public int book4(int z1, int z2) {
		
		int aaa = z1 * z2;
		return aaa; //
	}
	
	
}
