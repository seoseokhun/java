import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		/*
		���빮��
		�����ڿ��� �޴��� Ȱ��ȭ �ϴ� ���μ��� �Դϴ�.
		�ش� �޴� Ȱ��ȭ�� 2�� �迭�̸�, �޴���, Ȱ��ȭ�ϴ� (Y,N) �����մϴ�.
		�ش� Ȱ��ȭ ���� �����Ͽ� "Y"�� ����Ǵ� �ε��� ��ȣ�� �´�
		�޴����� 1�� �迭�� �籸�� �� ���ο��� ��� �ǵ��� �մϴ�.
		���: [���Ϲ��,����������,���ڽ�,�̺�Ʈ,�߼�]
		��, private �� return�� Ȱ���Ͽ� ���α׷��� �ۼ��մϴ�.
		 */
		menus me = new menus();
		//������
		System.out.println(Arrays.toString(me.get()));
		
	}

}

class menus{
	private String mdata[][];
	private String rdata[];
	String a;
	public menus() {
		String ms[][] = {
				{"���Ϲ��","����������","���κ���","���ڽ�","�̺�Ʈ","����","�߼�"},
				{"Y","Y","N","Y","Y","N","Y"}
		};
		this.mdata = ms;
		redata();
		//System.out.println((this.mdata[0][5]));
	}
	
	public void redata() {
		//System.out.println(Arrays.toString(this.mdata[0]));
		int ea = this.mdata[0].length;
		String ww[] = new String[ea];
		int w=0;
		int ct = 0;
		do {
			if(this.mdata[1][w].equals("Y")) {
				ww[ct] = this.mdata[0][w];
				ct++;
			}
			
			w++;
		}while(w<ea);
		
		this.rdata = ww;
	}
	
	public String[] get() {
		return this.rdata;
	}
	
	
}



/*
  class  aaa {
 
  int a;
  String b;          -> field
        public aaa() { -> comstructor
        
  }     
        -> method
       public void
       public static void
       public String abc
       */



