public class While_plus {

	public static void main(String[] args) {
		/* 5~10���� ���� �հ� ���� ��� */
		
		int w = 5;  //�ʱⰪ
		int total = 0; //�հ�ġ�� ������Ű�� ���� ������
		while(w < 11) {     // +=, -=, *=, /=, %=
			//total = total + w;
			total += w;
			w++;	
		}
		System.out.println("�հ�:"+total);
		
		/* ���빮�� : 3 ~ 8���� ���� �� �հ� ���� ����Ͻÿ�*/
		
		int a = 3;
		int b = 1;  //���ϱ� �հ踦 ������ 1 �⺻������ ����
		while(a < 9) {
			b*=a;
			a++;
		}
		System.out.println("�հ�:"+b);
		
		
		
		
		

	}

}
