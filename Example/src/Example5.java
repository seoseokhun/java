
public class Example5 {

	public static void main(String[] args) {
		/*
		 ���빮��5
		 ���� �ڵ带 ���� while������ ��ȯ�Ͻÿ�.
		 
		int sum=0;
		int i;
		for(i=1;i<12;i++) {
			if(i % 2 == 0) {
				sum=i+sum;
			}
		}
		System.out.println("1���� 12������ ¦���� ��="+sum);
		*/

		int a = 0; 
		int b = 1;
		while(b <= 12) {
			if(b % 2 == 0) {
				a=b+a;
			}
			b++;	
		}
		System.out.println("�հ�:"+a);
	}

}
