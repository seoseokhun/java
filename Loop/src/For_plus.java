
public class For_plus {

	public static void main(String[] args) {
		/* 1~10���� ��� ���ڸ� ���� ������� ����Ͻÿ�. */
		int f;
		int total=0;
		for(f=1;f<11;f++) {  //total �������� �ݺ����� ���������� ������Ŵ
			//total = total + f;
			total += f;
		}
		System.out.println("���հ�:"+total);
		//+=(���ϱ��Ҵ�) -=(�����Ҵ�)  *=(���ϱ��Ҵ�) /=(�������Ҵ�)
		// b = b - f; -> b -= f;
		
		/*
		 ���빮��
		 ��ü���� 500�� �ֽ��ϴ�. �� 8ȸ ���� �ݺ��Ǹ鼭
		 �ѹ� �ݺ��Ҷ� ���� 12�� �����ϵ��� �Ͽ� ���� ���� ����Ͻÿ�.
		 ����� 404
		 */
		int q = 500;
		int m = 12;
		int w;
		for(w=1;w<9;w++) {
			
			q=q - 12;
		}
		System.out.println("q");
		
		/*
		 ���빮��.
		 ������ 2�� 2*1 ~ 2*9 ������ �� �հ踦 ����Ͻÿ�.
		 ���� �հ� 90
		 */
		
		
		

	}

}