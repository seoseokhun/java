import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		/* Scanner�� �Բ� do ~ while������ ����ڰ� �Է��ϴ� ������ ������ ����� ��µǴ� ���α׷��� �����Ͻÿ�.*/
		Scanner a = new Scanner(System.in);
		System.out.println("���Ͻô� ������ ���ڸ� �Է��ϼ���?");
		int b =a.nextInt();
		int a1 = 1;
		int c;
		do {
			c = a1*b;
			System.out.println("%d",c);
			b++;
		}while(b < 10);{
			
		}
		
	}

}
