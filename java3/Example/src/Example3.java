import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		/*
		 * �迭 + �⺻(Ŭ����)�޼ҵ� ����
		 * product : ����, ����, ���, �� , ����, Ű��,�ٳ���,����
		 * moneys : 35000 8000 4000 5500 3800 4400 11000 18900
		 * ��ٱ��Ͽ� �ش� ��ǰ�� ��� ��ҽ��ϴ�.
		 * ��, �� �� ����� �ٳ����� �����ϰ� �� ���� �ݾ��� ����Ͻÿ�. /////��� : 75600
		 */
		String product[]= {"����","����","���","��","����","Ű��","�ٳ���","����"};
		int moneys[]= {35000, 8000 ,4000, 5500 ,3800 ,4400 ,11000, 18900};
		pd(product,moneys);

	}
	public static void pd(String a[],int b[]) {
		int ea = a.length;
		int w = 0;
		int total=0;
	while(w<ea);
			if(!a[w].equals("���") && !a[w].equals("�ٳ���")) {
				total +=b[w];
				w++;
				
			}
			
		
		System.out.println(total);
			
		
		
	}

}
