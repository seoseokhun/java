import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		/* �����迭
		int a[] = new int[2];
		a[0] = 22;
		a[1] = 32;
		*/
		/* �����迭
		int b[] = { 1, 2, 3, 4 };
		int[] c = { 1, 2, 3, 4 };
		int[] d = new int[]{1,2,3,4};
		*/
		/* 2�� �迭 [][] */
		/* 2�� �����迭
		String member2[][] = new String[3][3];
		*/
		String member[][] = {
				{ "ȫ�浿", "������", "������" },
				{ "25", "31", "22" } 
				};
		int ea = member.length; //�迭 ������ � �ִ����� Ȯ��
		int data_ea = member[0].length; //�ش� �迭���� �����Ͱ�ü�� ��ִ��� Ȯ��
		//System.out.println(data_ea);
		//System.out.println(member[1][2]);
		int f,ff;
		for(f=0;f<ea;f++) { //ū �ݺ����� �迭 ���� ��ŭ loop
			//System.out.println(Arrays.toString(member[f]));
			for(ff=0;ff<data_ea;ff++) { //���� �ݺ����� �迭�� �ִ� ������ ���� ��ŭ loop
				//System.out.println(member[f][ff]);
			}
			
		}
		
		int [][] datas = {
				{1,3,5},
				{2,4,6}
		};
		int fea = datas.length;
		int dea = datas[0].length;
		int total=0;
		int w,ww;
		for(w=0;w<fea;w++) {
			//System.out.println(Arrays.toString(datas[w]));
			for(ww=0;ww<dea;ww++) {
				//System.out.println(datas[w][ww]);
				total += datas[w][ww];
			}
		}
		
		//System.out.println("���հ��:"+ total);
		
		/*
		 * ���빮�� �ش� ������ �迭�� �ִ� ��� �� �� ¦������ ��� ���Ͻÿ�.
		 * 1�� ������ : 11 42 22 16
		 * 2�� ������ : 7 33 10 29 ����� : 90
		 */
		int[][] data = {
				{11,42,22,16},
				{7,33,10,29}
		};
		int ea1 = data.length;
		int ea2 = data[0].length;
		int w1,ww1;
		int total1= 0;
		for(w1=0;w1<ea1;w1++) {
			//System.out.println(Arrays.toString(data[w1]));
			for(ww1=0;ww1<ea2;ww1++) {
				if(data[w1][ww1]%2==0) {
					//System.out.println(data[w1][ww1]);
					total1 += data[w1][ww1];
					
				}
			}
		}
		System.out.println(total1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
