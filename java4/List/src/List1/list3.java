package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class list3 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * �ѹ�������1 3,6,9,12,15
		 * �ѹ�������2 2,4
		 * 
		 * ��� 3,6,9,12,15,2,4
		 */
		/*Arrays.sort : �迭���� ���¿��� �����մϴ�.*/
		Integer a[] = {3,6,9,12,15};
		Integer b[] = {2,4};
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(b));
		ArrayList<Integer> ar2 = new ArrayList<>(Arrays.asList(a));
		
		int ea = ar.size();
		int f;
		for(f=0;f<ea;f++) {
			ar2.add(ar.get(f));
		}
		System.out.println(ar2);
		Collections.sort(ar2);   //ArrayList, LinkedList sort �������� ����
		System.out.println(ar2);
		
		int ea2 = ar2.size();
		System.out.println(ea2);
		
		
		

	}

}
