package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		/* ���빮�� ����ڰ� ���ڱݾ� �Է��մϴ�.
		 * �ش� ���� �ݾ� Ƚ���� �� 8�� �Դϴ�.
		 * 0~n���� �Է°����ϸ� 
		 * �ش� �Է��� ��� ������ ���� �հ� �ݾ��� ��� ��Ű�ÿ�.
		 * ����)
		 * �Ա��� �ݾ��� ��������?
		 * 500 600 500 400 200 100 50 50
		 * ���)
		 * �� �Ա� �ݾ��� : 2400�� */
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> bank = new LinkedList<>();
		String user;
		int w=0;
		int total = 0;
		do {
			System.out.println("�ݾ��� �Է��ϼ���");
			String money = sc.next();
			try {
				int addm = Integer.parseInt(money);
				bank.add(addm);
				total += addm;
			}catch(Exception e){
				System.out.println("�ݾ��� ���ڷθ� �Է��ϼ���");
			}
			w++;
		}while(w<8);
		System.out.println("��ü �Ա��� �� �ݾ���?"+total+"�� �Դϴ�.");
	}

}
