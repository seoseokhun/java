/*
 * extends : �ڽ� Ŭ�������� �ϳ��� �θ� �ε�
 * implements : �ڽ� Ŭ�������� �������� �θ� �ε��� (�������̼� ������ ���)
 */

public class Inter implements Ime1,Ime2 {
	@Override
	public void c1() {
		System.out.println(names);
		System.out.println("interface_1");
	}
	@Override
	public void c2() {
		System.out.println("interface_2");
	}
	public static void main(String[] args) {
		Inter it = new Inter();
		it.c1();
		it.c2();

	}

}
