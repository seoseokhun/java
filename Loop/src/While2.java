
public class While2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 4;
		int c;
		while(a < 10) {			
			c = b * a;  //�������
			//System.out.print(c+",");
			a++;
		}

		/*
		 ���빮��
		 56,49,42,35,28,21,
		 */
		int aa=7;
		int bb=8;
		int cc;
		while(bb>=3) {
			cc=bb*aa;
			System.out.print(cc+",");
			bb--;
		}
		/*
		 ���빮��2.
		 ���� ��� ���� Ȯ�� �Ͻ��� �ش� ������� �´� �ڵ带 �ۼ��Ͻÿ�.(4,7,10,13,16,19,22,)
		 
		 
		 */
	}

}
