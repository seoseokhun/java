
public class Example6 {

	public static void main(String[] args) {
		/*
		 ���빮�� 6
		 1~10���� ���������� �����ϴ� �ݺ����� �ֽ��ϴ�.
		 ��, 1~5������ ��� ���� ���ϰ�, 6~10������ ��� ���� ���մϴ�.
		 �ش� �ΰ��� ���� ���Ͽ� ���Ѱ��� ū��, ���Ѱ��� ū����
		 ����� ����Ͻÿ�.
		 */
		int w = 1;
		int total = 0; //���Ұ�
		int total2 = 1; //���Ұ�
		while(w<=10) {
			
			if(w<5) {
				total2 = total2 * w;
			}
			else {
				total = total + w;
			}
			w++;
			
		}
		if(total2 < total) {
			System.out.println("���Ѱ��� Ů�ϴ�.");
		}
		else if(total2 > total) {
			System.out.println("���Ѱ��� Ů�ϴ�.");
		}
		else {
			System.out.println("�� �񱳰��� �����ϴ�.");
		}

	}

}
