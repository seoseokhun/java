
public class Class3 {
	

	public static void main(String[] args) {
		//�ڷ���(��������) ��ȯ
		//double -> int�� ��ȯ
		double a = 137.5;
		int b = (int)a;
		
		//int -> double�� ��ȯ
		int c = 35;
		double d = (double)c;
		System.out.println(d);
		
		//String -> int
		String x = "35";
		String x2 = "156";
		//int z = Integer.parseInt(x); //parseInt (int���� ����ϴ� ������� �����)
		int z = Integer.valueOf(x); //valueOf Ŭ���� �޼ҵ�(�޼ҵ��Լ�) -> parseInt
		int total = Integer.parseInt(x) +Integer.parseInt(x2); 
		//->�������� ���ڷ� ��ȯ�Ͽ� �������� ó����
		System.out.println(total);
		
		//Long ���� Long.parseLong �����
		String j = "923456789";
		String j2 = "9234567892";
		//int total2 = Integer.parseInt(j) + Integer.parseInt(j2);
		Long total2 = Long.parseLong(j2) + Long.parseLong(j2);
		double total3 = (double)total2;
		System.out.println(total2);
		System.out.println(total3);
		
		//����(char) -> ����(String) : �⺻���ĸ� ����
		char p = 'M';
		String f =String.valueOf(p); //���� -> ���� (valueOf)�� ���
		System.out.println(f);
		
		

	}

}
