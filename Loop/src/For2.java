
public class For2 {

	public static void main(String[] args) {
		
		int a;   //for�� �ʱⰪ
		int b=2;   //���꿡 ����� ����
		int c;  //������ ����� ���
		for(a=1;a<=9;a++) {
			c = b * a;  //������� �۾�
			//System.out.println(c); //����� ������� �����
		}
		/*
		 ���빮�� ���� ������� ���� �ڵ带 �ۼ� �Ͻÿ�.
		 45,40,35,30,25,20
		 */
		int a1;
		int b1=5;
		int c1;
		for(a1=9;a1>=4;a1--) {
			c1=b1*a1;
			//System.out.print(c1+",");
			
		}
		/*
		 ���빮�� ���� ������� Ȯ�� �� �ڵ带 �����Ͽ� ����Ͻÿ�
		 
		 11.22.33.44.55.66.77.88.99
		 
		 */
		int aa;
		int bb=11;
		int cc;
		for(aa=1;aa>9;aa++) {
			cc=bb*aa;
			//System.out.println(cc);
			
			int z; //for
			int x; //�����
			
			for(z=1;z<10;z++) {
				x=(10+z)+z;
						System.out.println(x);
						
						/*
						 [�ݺ���]
						 for 100data o 100000data x
						 while 
						 do~while
						 foreach
						 each
						 map
						 for~in
						 
						 */
			}
		}
	}

}
