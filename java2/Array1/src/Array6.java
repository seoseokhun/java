import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ������ ��ٱ��Ͽ� �������� ��ǰ�� ����� �ֽ��ϴ�. �� �� �ù�� ������ �����Ǵ� �ݾ׸� �����Ͻÿ�. �ù��� 30000
		 * �����̻�(����) 15000 / 48000 67000 / 8000 / 118200 49800 / 6000 18700 [48 ,67 ,1182
		 * ,498]
		 * 
		 */

		int a[] = new int[6]; // [null,null,null....]
		int b[] = { 15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700 };
		int ea = b.length;
		// System.out.println(b);
		int a_ea = a.length;
		int w = 0;

		while (w < ea) {

			if (b[w] >= 30000) {
				System.out.println(b[w]);

			}

			w++;
		}

	}

}
