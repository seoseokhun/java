package ex;

import java.util.ArrayList;
import java.util.Arrays;

public class example3 {

	public static void main(String[] args) {
		/* 
		 * ���빮��.(����)
		 * ���Ե� ȸ������ �� ���� �����Ϳ��� ����Ʈ�� ���� �������
		 * ����� �̸��� �����Ͽ� ��� �մϴ�.
		 * 
		 * ���
		 * [���缺,�ѿ�,���Ѽ�,������,�赵��,���Ѱ�,ȫ�浿,���,�̼���,������,������]
		 * - ���μ��� �ڵ� ���� ������ FREE -
		 * 
		 * ���빮��.���Ե� ��� ȸ���� ����Ʈ �� ���� ���Ͻÿ�.
		 * ��, abstract�� ������ ����ؾ� �մϴ�.
		 * 
		 * ���: "ȸ�� ��ü�� ����Ʈ �հ�� : 34390 �Դϴ�."
		  */
		plus ps  = new plus();
		ps.setter();
		int a = ps.getter();
		System.out.println("ȸ�� ��ü�� ����Ʈ �հ�� :"+ a + "�Դϴ�.");
	}

}
abstract class abc{
	String arr[][];
	int total = 0;
	ArrayList<String[]> userdb = null;
	public abstract void setter();
	public abstract int getter();
	public abstract void db();
}
class plus extends abc{
	@Override
	public void setter() {
		this.db();
		//System.out.println(this.userdb.get(0)[6]);
		int ea = this.userdb.size();
		int w =0;
		while(w<ea) {
			this.total += Integer.parseInt(this.userdb.get(w)[6]); 
			
			w++;
		}
		
		
	}
	@Override
	public int getter() {
		
		return this.total;
	}
	@Override
	public void db() {
		this.arr = new String[][] {
			 {"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
			 {"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"},
			 {"���Ѽ�","LG","010-1267-4112","37","���α�","soso4112@naver.com","1200"},
			 {"���缺","SKT","010-3221-8871","41","������","jsung_kks@naver.com","700"},
			 {"�ѿ�","KT","010-2455-4879","22","��õ��","han1004@nate.com","920"},
			 {"������","SKT","010-3770-4009","34","���α�","kans32@gmail.com","1250"},
			 {"���","KT","010-1606-3137","20","����","kimsil_love@nate.com","4505"},
			 {"���Ѱ�","SKT","010-3412-0902","31","��õ��","hanso12@nate.com","2125"},
			 {"������","LG","010-4557-8282","30","����","jehyuk@naver.com","8160"},
			 {"�̼���","KT","010-3738-4800","55","������","sunyoung@nate.com","4510"},
			 {"������","SKT","010-5242-0879","42","������","chreey@gmail.com","6720"}
};
this.userdb = new ArrayList<String[]>(Arrays.asList(arr));
		
	}
}


