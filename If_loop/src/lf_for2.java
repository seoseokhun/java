
public class lf_for2 {

	public static void main(String[] args) {
		//1~100���� ���� �� 80�̻��� ���ڸ� ���
		int f;
		for(f=1;f<=100;f++) {
			
			if(f >= 80) {
				//System.out.print(f+" ");
			}
			
			/*
			 200 ~ 300 ���� ���� �� 240������ ���ڸ� ��½ÿ�.
			 */
			
			
			final int a = 2;
			int w;
			for(w=1;w<11;w++) {
				
				if(w % a == 0) {
					//System.out.printf("%d ",w);
				}
				
			}
			
			/*
			 ���빮�� ������ �� 2���� �ݺ��մϴ�. �� , 2�� ����� �� 10�̻� ���ڸ� ����մϴ�.
			 */
			
			final int a1 = 2;
			int b1;
			int total;
			for(b1=1;b1<=9;b1++) {
				total = a1 * b1;
				if(total > 10) {
					System.out.printf("%d ",total);
					
				}
			}
		/*
		 ���빮��
		 ���� ������� ���� �ش� ���� ��� �ǵ��� �ڵ带 �����Ͻÿ�.
		 18 36 54 72 
		 */
		
			int p;
			int total3;
			for(p=1;p<10;p++) {
				total3 = 9 * p;
				System.out.print(total3+" ");
			}
		}
			
			
			
		/*
		 ���빮��
		 ���� ������� ���� �ش簪�� ��µǵ��� �ڵ带 �����Ͻÿ�.
		 1~20 ������ ���� �Դϴ�.
		 6 14 17 19
		 */
			
				int aa;
				int total4;
				for(aa=1;aa<=20;aa++) {
					if(aa==6||aa==14||aa==17||aa==19) {
					System.out.println(aa+" ");
				}
				
			
		}
			
			
			
			
			
			
		}
		 
		 

	}


