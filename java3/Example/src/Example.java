import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		/*
		 * �迭 + �⺻(Ŭ����)�޼ҵ幮��.
		 * 1���迭�� ������ ���� ���� �ֽ��ϴ�.
		 * �迭����Ʈ 22 33 44 55 66 77 88 99 �̸�
		 * �ش� ��ü ���� ��� ���� �� �հ谪�� ������ �޼ҵ��
		 * ó�� �ǵ��� �մϴ�. ��, �ݺ����� ������ do~while�� �ۼ��մϴ�.
		 */
		int a[] = {22,33,44,55,66,77,88,99};
		//void = ��ü���� + �ν��Ͻ�(�޸�) ���
		datas(a);
	}
	
	
	public static void datas(int bb[]) {
		int ea = bb.length; //�迭 �����ľ�
		int w=0;
		int total = 0;
		do {
			total = total + bb[w];
			w++;
			
		}while(w<ea);
		
		System.out.println("�� �հ谪��:" + total);
		
		
		
	}

}
