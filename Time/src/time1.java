
public class time1 {

	public static void main(String[] args) {
		/* try-catch�� : ����ó����� ���� */
		int f;
		for(f=1;f<=10;f++) {
			
			try {  //���ܹ߻��� �ڵ带 ����
				Thread.sleep(1000); //1000 = 1��
				
				//Thread.sleep(); : �Ͻ����� ���¸� ���մϴ�.
			}
			catch(InterruptedException e) {
				//InterruptedException : �ش� ���ܹ߻��� �Ǿ��� ��� ó�� �ϱ� ���� ����
				
			}
			
			System.out.println(f);
		}
	}

}
