package List1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class list1 {

	public static void main(String[] args) {
		//add(�߰�),get(�����ͷε�),remove(����),size(index����) : 
		//ArrayList��� util �޼ҵ忡�� ����ϴ� �κ�
		//Arrays.asList : �ε��� �迭 ������ ����
		//�߿� : add�� �Ϲ������� ������ �� �ڿ� �����Ͱ� �߰��� ��, index��ȣ�� ���� �� ���� �����ϸ� �ش� index �κп� �߰��� �˴ϴ�.
//		String member[] = {"�̼���","ȫ�浿","������","������"};
//		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
//		//System.out.println(mb);
//		int ea = mb.size();
//		//System.out.println(ea);
//		mb.add("������");
//		//System.out.println(mb);
//		mb.remove(1); 
//		//System.out.println(mb);
//		mb.add(3,"�������");
//		//System.out.println(mb);
//		String checks = mb.get(2);
//		//System.out.println(checks);
		/*
		 * ���빮�� 
		 * �������� 15,22,37,8,11,19,41 �Դϴ�.
		 * �ش� �������� Ŀ���� �Ͽ� ���� ��� ó�� ����Ͻÿ�.
		 * [7,15,22,8,11,39,41]   //19,37 ���� 7�� 0��
		 */
		/*ArrayList���� int�� ������� ����(Integer) �����*/
		Integer numbers[] = {15,22,37,8,11,19,41};
		ArrayList<Integer> mb2 = new ArrayList<Integer>(Arrays.asList(numbers));
		Integer ea = mb2.size();
		System.out.println(mb2);
		mb2.remove(2);
		mb2.remove(4);
		mb2.add(0,7);
		mb2.add(5,39);
		System.out.println(mb2);
		
		
		
		
	}

}
