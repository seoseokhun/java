import java.util.Arrays;

public class example5 {

	public static void main(String[] args) {
		/* 2�� �迭 + �⺻(Ŭ����)�޼ҵ� ����
		 * ��ϵ� ���� vip ���� ����Ʈ�� ����Ͻÿ�.
		 * 
		 * user_list : ȫ�浿 �̼��� ������ ������ ������� ������ ����屺
		 * user_level : gold vip guest gold vip vip guest
		 * 
		 * ������ : �̼��� ������� ������
		 * 
		 * [�׷��ε���][�������ε���]
		 */
		String user_list[][] = {
		{"ȫ�浿", "�̼���", "������", "������", "�������", "������", "����屺"},
		{"gold", "vip", "guest", "gold", "vip", "vip", "guest"}
		};
		example5 ex = new example5();
		ex.level(user_list);

	}
	public void level(String data[][]) {
		int gp = data.length; // 2
		int ea = data[0].length;  // 7
		//System.out.println(ea);
		int w=0;
		while(w<gp) {
			int ww = 0;
			while(ww<ea) {
				if(data[w][ww].equals("vip")) {
					System.out.println(data[0][ww]);
				}				
				ww++;;
			}
			w++;
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		while(w<ea) {
			if(data[1][w].equals("vip")) {
				System.out.printf("%s ",data[0][w]);
			}
			w++;
		}
		/*
		int ea = a[0].length;
		int w = 0;
		int total;
		while(w<ea) {
			if(!a[1][w].equals("gold")&&!a[1][w].equals("guest")) {
				System.out.println(a[0][w]);
				
			}
			w++;
		}
		*/
	}

}
