
public class Dowhile_plus {

	public static void main(String[] args) {
		
		/* do~while : 30~35���� �հ踦 ����Ͻÿ� 195 */ 
		int a = 30;
		int b = 0;
		do {
			b+=a;
			a++;
		}while(a <= 35);
		//System.out.print(b);

		/* ���빮�� �հ���� 189�� �ֽ��ϴ�. �� 1~10���� �հ�ġ��
		   ���� 189�� �� ���հ踦 ���Ͻÿ�.
		 */
		int a1 = 1;
		int b1 = 189;
		do {
			b1 -= a1;
			a1++;
		}while(a1 <= 10);
		System.out.print("�����:"+b1);
	}

}
