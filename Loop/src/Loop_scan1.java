import java.util.Scanner;

public class Loop_scan1 {

	public static void main(String[] args) {
		//for�� + Scanner
		//���Ͻô� ������ ���ڸ� �Է��ϼ���.
		Scanner aa = new Scanner(System.in); //�Է¿��� �ε�
		System.out.println("���Ͻô� ������ ���ڸ� �Է��ϼ���."); //��������
		int bb = aa.nextInt();  //����ڰ� �Է��� ����
		int f;   //�ݺ����� ����ϴ� ����
		int zz;  //�ݺ����� ������� �����
		for(f=1;f<=9;f++) {
			zz = bb * f;  //�������
			System.out.printf("%d",zz); //���
		}
		aa.close();  //����
		

	}

}
