
public class Double_loop4 {

	public static void main(String[] args) {
		/*
		 ���빮�� ���չݺ��� for, do ~while
		 */
		int f;
		for(f=2;f<=3;f++) {
			
			int w=1;
			do {
				//System.out.println(f+"*"+w+"="+(f*w));
				w++;
			}while(w<=9);
		}
		
		/*���빮�� ������ 7�ܺ��� 9�ܱ��� ��, �� ������ ��������
		 * 5������ �������� �մϴ�. 7*1=7 ~ 7*5=35 8*1=8...9*5=45
		 * ����(�ۿ��� do~while �ȿ��� while)
		 
		int dw=7;
		int total;
		do {
				
			int w=1;
			while(w<=5){
				total = dw * w;
				System.out.printf("%d*%d = %d",dw,w,total);
				w++;
			}
			dw++;
		}while(dw<=9);
		*/
		
		/*���빮�� ���� ������� Ȯ���Ͽ� �ڵ带 �ۼ��մϴ�.
		 * ��, for ~ while ���� ���� �ǵ��� �մϴ�.
		 */
		int a;
		int total2;
		for(a=1;a<=9;a++) {
			
			int b =a;
			while(b<=a) {
				total2 = b * a;
				System.out.printf("%d*%d=%d",b,a,total2);
				b++;
			}
			
		}
		/*���빮�� ���� �ش� ����� ó�� ����� �ǵ���
		 * ����ݺ����� �̿��Ͻÿ� (while ~ do~while)
		 * 1+1=2 2+1=3 2+2=4 3+1=4 3+2=5 3+3=6.../ 4+4=8 ����
		 */
	}

}
