package ex;

import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;

public class example2 {

	public static void main(String[] args) {
		/*
		 * ȸ������ DB�� �ִ� ��Ȳ�Դϴ�.
		 * �ش� ���� �߿��� naver.com ���� �ּҸ� ����ϴ� ���ο����� ����մϴ�.
		 * ����Ͻÿ�. ��, DB�� �ε�� �߻� Ŭ�������� �ε尡 �ǵ��� �մϴ�.
		 * {"�̸�","��Ż�","��ȭ��ȣ","����","�ּ�","�̸���","����Ʈ"}
		 * ��Ʈ indexOf
		 */
		
		user_list ul = new user_list();
		ul.setter("naver.com");
		int total = ul.getter();
		System.out.println("naver.com�� �� "+total+" ���� �ֽ��ϴ�.");
		
		

	}

}
abstract class basic{
	String arr[][];
	ArrayList<String> ar1 = null;
	public abstract void setter(String email);
	public abstract int getter();
	public abstract void db();
		
		
		}
class user_list extends basic{
	int ea = 0;
	int total = 0;
	@Override
	public void setter(String email) {
		db();
		for(int f =0; f<this.ea;f++) {
			/* ���������� �迭�������� ī������ �ϰ� �� indexOf -1(����) -1�� ��� ������ ���� ���� */
			if(this.arr[f][5].indexOf(email)!=-1) {
				this.total += 1;
			}
			
			/* ArrayList : �� ������ �޸� �Ҵ� �����Ǵ� ��Ȳ�� �߻� �� �� ���� */
			//this.ar1 = new ArrayList<>(Arrays.asList(arr[f][5]));
			
			//if(this.ar1.get(0).indexOf(email)!=-1) {
				//this.total += 1;
			//}
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
			this.ea = this.arr.length;
			//System.out.println(ea);
		}
	
}
	
		
		
			

