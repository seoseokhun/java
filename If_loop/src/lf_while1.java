
public class lf_while1 {

	public static void main(String[] args) {
		
		/*
		 ���빮�� while������ 10 ~ 30���� ���� �߿���
		 Ȧ������ ����Ͻÿ�.
		 */
		int a = 10;
		//int b = 30;
		while(a<=30) {
			if(a%2==1 && a > 20) {
			System.out.print(a+" ");
			}
			
			a++;
		
		}
		//ī���� ������ ���� �ľ��ϱ�
		/*
		 1~10���� ���� �߿� ¦������ � �ִ��� ������ ����ϼ���.
		 */
		int ww = 1;
		int count = 0;  // ī���� ������ 0
		while(ww<=10) {
			if(ww%2 == 0) {  //¦���� ���
				count++;    //�ش� ������ ���� ��� + 1�� ������
			}
			
			ww++;
		}
		//�ݺ��� ����� ���� ī���� ���� ����ϰ� �˴ϴ�.
		System.out.print("1~10���� ������ ¦�� ������:"+count);
		

	}

}