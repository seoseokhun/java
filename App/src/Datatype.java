
public class Datatype {

	public static void main(String[] args) {
		//String : ���� "" ������ ���
		String a = "1234";
		System.out.println(a);
		
		//������ �ڷ�
		
		byte b = 127, bb = 123; // byte : 0~127
		System.out.println(b);
		
		short c = 32767; //short : -32,768 ~ 32,767
		System.out.println(c);
		
		int d = 1000000000 , d1 = 2000000000; // -2,147,483,648 ~ 2,147,483,647
		System.out.println(d);
	
		long f = 123123123L; // long ���� ���� L �پ���� 
		// 0�� ���� 18�� , �⺻�޸� �Ҵ翡�� �߰� ����� ���� ������ �þ
		System.out.println(f);
		//������ ��
		
		// �Ǽ��� �ڷ�
		float z = 3.5f; // 3.402 + 38 (f�� ������ ����ؾ���)
		System.out.println(z);
		
		double k = 44.5; // 1.784 + 308 (d ��/�� ��� ����)
		System.out.println(k);
		
		long f1 = d+d1;
		System.out.println(f1);
	}

}
