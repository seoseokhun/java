package ex;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		/*
		 ����ڰ� ���� ���ڸ� �Է� �޽��ϴ�. Scanner
		 ��, ����ڰ� ���ڸ� �Է� �� ��� ���� ó���� ���� �Ǿ���մϴ�.
		 �� ���� �Է��� 7���̸�, ����ڰ� �Է��� ���ڸ� ������������ ���� �մϴ�.
		 
		 "���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�." - 7��
		 ���
		 [6,22,37,44,45,80,100];
		 �߰��ɼ� - ¦���� Ȧ������ ������ �迭�� ���� �ϵ��� �մϴ�.
		 [6,22,44,80,100]
		 [37,45]
		 */
		Scanner sc = new Scanner(System.in); 
		LinkedList<Integer> data = new LinkedList<>(); //¦��
		LinkedList<Integer> data2 = new LinkedList<>(); // Ȧ��
		int w = 0;
		do {
			System.out.println("���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�.");
			try {
				Integer ck = Integer.valueOf(sc.next());
				if(ck%2==0) {
					data.add(ck);					
				}
				else {
					data2.add(ck);
				}
			}
			catch (Exception e) {
				System.out.println("���ڸ� �Է��ϼž� �մϴ�.");
			}
			w++;
		}while(w<7);
		Collections.sort(data);
		Collections.sort(data2);
		System.out.println(data);
		System.out.println(data2);
		
		

		
	}

}
