import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		
		Scanner mid = new Scanner(System.in);
		System.out.println("������ ���̵� �Է��ϼ���");
		String m = mid.next();    //����ڰ� ���̵� �Է�
		
		Scanner mpass = new Scanner(System.in);
		System.out.println("�н����带 �Է��ϼ���");
		String p = mpass.next();     //����ڰ� �н����� �Է�
		
		//System.out.printf("���̵�:%s,�н�����:%s",m,p):
		if(m.equals("jung") || m.equals("su")) {
			if(m.equals("jung") && p.equals("j1234")) {
				System.out.println("�α��εǼ̽��ϴ�.");
			}
			if(m =="jung" && p=="j1234") {
				System.out.println("�α��εǼ̽��ϴ�.");
				
			}
				
			}
			else if(m =="su" && p=="ssh") {
				
			}
			else {
				System.out.println("ȸ�������� �ٽ� Ȯ���ϼ���");
			}
		
		
		
				
				
		


	}

}
