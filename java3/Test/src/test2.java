
public class test2 {

	public static void main(String[] args) {
		/*�迭���� css��� �ܾ ���� �������� ��� (��) */
		/*�迭���� css��� �ܾ �ִ��� Ȯ���ϴ� ��� ���μ����� ����(��,��) */
		String adata[] = {
			"�ڹ�","HTML","CSS","������"	
		};
		
		int ea = adata.length;  //4
		
		int w = 0;
		while(w<ea) {
			if(!adata[w].equals("CSS")) { // == (����,true,false,null)
				System.out.println(adata[w]);
			}
			w++;
		}
		
		int z = 0;
		boolean k = false;
		while(z<ea) {
			if(adata[z].equals("CSS")) {
				k = true;
			}
			z++;
		}
		
		if(k==false) {
			System.out.println("�ش� �ܾ�� �����ϴ�.");
		}
		else {
			System.out.println("�ش� �ܾ ���ԵǾ� �ֽ��ϴ�.");
		}
		

	}

}
