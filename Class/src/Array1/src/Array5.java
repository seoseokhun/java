import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		
		//��迭 ������ �����Ͱ� �ִ� �迭�� Ŀ���� ���
		int a[] = new int[2]; //3���� ������ ������
		int b[] = {1,2,3,4,5,6,7}; //7���� ��ü�� �ִ� ��Ȳ
		//System.out.println(a);
		int ea = b.length; //b�迭�ȿ� ��� ������ ��ü
		System.out.println(a.length);
		int a_ea = a.length;
		int w = 0;
		int ct = 0;
		while(w<ea) {
			//System.out.println(b[w]);
			if(b[w]%2==0 && ct < a_ea) {  
				//if(b�迭�� ���� ¦���� && ���ο� a �迭�� ��ü ��üũ�� ��ŭ��)
				a[ct] = b[w];
				ct++; //���Ǹ� ������ �ε��� ��ȣ�� +1�� ������Ŵ
			}
			w++;
		}
		System.out.println(Arrays.toString(a));

	}

}
