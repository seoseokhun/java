package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class List2 {

	public static void main(String[] args) {
		/*���빮��
		 * �ش� ������ �� �� �޸� �� �����ʹ� ��� ���� �ؾ� �մϴ�.
		 * �� ������
		 * {�����,������,��â��,�ڵ���,�̰���,�����,������}
		 * ���
		 * �����,������
		 */
		String mb[] = {"�����","������","��â��","�ڵ���","�̰���","�����","������"};
		ArrayList<String> ar = new ArrayList<>(Arrays.asList(mb));
		int ea = ar.size();
		int w = 0;
		
		while(w<ea) {
			int ea2 = ar.size(); //node�� ������ �ٽ� �ľ���
			int ww= 0;
			while(ww<ea2) {
				if(!ar.get(w).equals("�����")&&!ar.get(w).equals("������")) {
					ar.remove(0);
					//System.out.println(ar);
			}
				ww++;
			}
			w++;
			
		}
		/*
		 * ���빮�� ¦���� ���ڸ� ��� ���� �մϴ�.
		 * 10,7,6,1,11,37,41,22
		 *  ��� 7,1,11,37,41
		 */
		
		Integer it[] = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> ar2 = new ArrayList<>(Arrays.asList(it));
		int no = ar2.size();
		int z =0;
		do {
			int no2 = ar2.size();
			int zz= 0;
			do {
				if(ar2.get(zz)%2==0) {
					ar2.remove(zz);
					break;
				}
				zz++;
			}while(zz<no2);
			System.out.println(ar2);
			z++;
		}while(z<no);
		
		
		
		
			
		
		
		
	}

}
