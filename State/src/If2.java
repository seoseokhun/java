public class If2 {

	public static void main(String[] args) {
		
		String mid1, mid2,mpass;
		mid1 = "hong";
		mid2 = "kim";
		mpass = "a1234";
		/* �ش� ���ǹ��� ���ڷ� Ȯ���ϴ� �������� �̸�, else�� �����ϴ� �κ� */
		if(mid1=="hong") {
			System.out.println("ȯ���մϴ�.");
		}
		else if(mid1=="park") { //�߰��� �񱳴���� ���� ���
			System.out.println("ȯ���մϴ�.");
		}
		else {
			System.out.println("���Ե��� ���� ����� �Դϴ�.");
		}
		
		
		
		/* ���̵� �� �н����带 ��� �����ϴ� ���� ���ǹ� */
		if(mid2=="kim") {    //ū if��
			
			//���� if��
			if(mpass=="a1234") {
				System.out.println("�α��� �ϼ̽��ϴ�.");
			}
			else {
				System.out.println("�н����尡 Ʋ���ϴ�.");
			}
		}
		else {
			System.out.println("���Ե��� ���� ����� �Դϴ�.");
		}
		
		/* �ش簪�� 2������ ¦��, Ȧ���� Ȯ���ϱ� */
		
		int c = 11 % 2;    // %��ȣ�� ���� 0 �Ǵ� 1�� ������ ���� ����� �˴ϴ�.
		if(c==0) {
			System.out.println("¦�� �Դϴ�.");
			
		}
		else {
			System.out.println("Ȧ�� �Դϴ�.");
			
		}

	}

}
