
public class Switch_loop {

	public static void main(String[] args) {
		String sign = "*";
		int total;
		/*case �ȿ� ������ �ݺ����� ����� �� �ֽ��ϴ�.
		 * ���� ������ �������� ����ص� �����ϸ�, case������
		 * �ٸ��� �۵��ϱ� ������ ������ �Ǵ� ������ �����ϴ�.
		 * ��, case�� �ϳ��� ������ ���� ��� ������ case�� ���� �۵����� ����
		 */
		switch (sign) {
		case "+" -> {
			int f;
			total = 0;
			for (f = 1; f <= 5; f++) {
				// total = total + f;
				total += f;
			}
		}
		case "-" -> {
			total = 0;
			System.out.println("�������� ��µ��� �ʽ��ϴ�.");
			
		}
		case "*" -> {
			total = 1;
			int f=1;
			while(f<=5) {
				total = total * f;
				f++;
			}
			System.out.println("�� 1~5���� ���� ���� " + total);
			
		}
		case "/" -> {
			total = 0;
		}
		}

	}

}
