import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {
		// 1~100���� ��ü ���� ����ϴ� for������ �ݺ���
		/*
		 * int f; int total=0;
		 * 
		 * for(f=1;f<=100;f++) { total+=f; } System.out.println(total);
		 */
		/* 1~100���� ���� �����?? */
		int f;
		/*
		BigInterger : java���� ��� ������ ���� ���� �� �� �ִ� ������ �ڷ����Դϴ�.
		*/
		BigInteger aa = new BigInteger("1");   
		//�հ迡 ����� �ڷ��� ���� 1�� ���ʰ����� ���� ��, ""�� ������ �����ؾ� �մϴ�.
		for (f = 1; f <= 100; f++) {
			/*
			multiply : ��Ģ���� ���ϱ⸦ �����
			add : ��Ģ���� ���ϱ⸦ �����
			subtract : ��Ģ���� ���⸦ �����
			divide : ��Ģ���� �����⸦ �����
			*/
			aa = aa.multiply(BigInteger.valueOf(f));

		}
		System.out.println(aa);

	}

}
