import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
		
		byte a = 10;
		if(a < 10) {
			System.out.println("�Է��� ���� 10�̻� ���ڸ� �Է��ϼ���.");
			
		}
		else if(a < 10 || a <= 22) {     //���ǹ��� ������ �����Ͽ� ������
			System.out.println("��÷ �Դϴ�.");
		}
		else {
			System.out.println("���� ���� ���� �Դϴ�.");
			
		}
		//���빮��
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Q.1~45���� ���� �ϳ��� �Է��ϼ���?");
		int z = k.nextInt();
		if(z==0) {
			System.out.println("���� �Է��� �߸� �Ǿ����ϴ�.");
		}
		
		else if(z<46){
			if (z==7 || z==12 || z==14) {
				System.out.println("20% ���� ��÷ �Դϴ�.");
			}
			
		}
		else {
			System.out.println("���ڴ� 1~45������ �Է� �����մϴ�.");
		}
			
		
		


	}

}
