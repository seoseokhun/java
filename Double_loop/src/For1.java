
public class For1 {

	public static void main(String[] args) {
		/* ������ 2~3�� ��� */
		int f, ff; // �ݺ����� ����� ���� ������ �̸� �Ͽ���

		for (f = 2; f <= 3; f++) { // ū �ݺ��� 2~3������ ȸ����

			for (ff = 1; ff <= 9; ff++) { // ���� �ݺ��� 1~9���� ȸ����

				// �ش� ���� �ݺ����� �۵��� �� ���� ����� �����
				//System.out.println(f + "*" + ff);
			}

		}

		/*
		 * ���빮�� ������ 5~7�ܱ��� ����� �ϵ� 4������ ���������� ������ ���ı��� ����Ͻÿ�. �ش� ������� �� �հ踦 ����ϼ���.
		 */
		int a, aa;
		int total=0;
		for (a = 5; a <= 7; a++) {
			
			for (aa = 1; aa <= 4; aa++) {
				//total = total + (a*aa);
				total += a*aa;
				//System.out.println(a + "*" + aa);
			}
		}
		System.out.println(total);
	}

}
