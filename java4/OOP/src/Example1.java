import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) { //�ܺ� Ŭ���� ȣ�⸸ ��
		//abstract ���빮��
		/*
		 * 1�� �迭���� �ֽ��ϴ�. �ش� �迭���� ��� ���� ���� ����մϴ�. 
		 * ��, abstract �⺻ void �̸��� sender ��� �̸��� ������ �ֽ��ϴ�.
		 * ������ ����� sender���� ��� �ǵ��� �մϴ�.
		 * �迭�� abstract���� ����մϴ�.
		 * �迭 ������ : 6,13,22,9,12,64,32,47,39
		 */
		arr1 ar = new arr1();
	}

}
abstract class vdata{
	
	public abstract void sender();
		
}

class arr1 extends vdata {
	
	private int alldata[];
	
	public arr1() {
		
		this.alldata = new int[]{6,13,22,9,12,64,32,47,39};
		this.sender();
	}
	@Override
	public void sender() {
		
		int w = 0;
		int total = 0;
		while(w < this.alldata.length) {
			total += this.alldata[w];
			w++;
		}
		System.out.println("�� �հ�"+total);
	}
}