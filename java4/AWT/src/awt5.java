import java.util.ArrayList;
import java.util.Arrays;

//�ߺ� ���̵� üũ �ý��� ����� : awt5_abstract �Բ� ���
//ȸ�������� : hong,lee,park
public class awt5 {
	
	public static void main(String[] args) {
		handel hd = new handel();
		hd.design();
		
	}

}

class handel extends awt5_abstract {
	private String aid; //awt���� �Ѿ�� �μ����� Ŭ�������� Ȱ��
	private String return_id; 
	// awt�� �ٽ� ���� ���� �ϴ� �������� : null�ϰ�� ���̵� ��밡��
	// ���̵��� ���� : �ش� ���̵�� ����� �� ����
	ArrayList<String> db = null;
	@Override
	public void idcheck(String id) {  //setter
		//awt���� �ߺ���ư�� Ŭ���� �ش� ������ ���������� �ʱ�ȭ �ϴ� �κ�
		this.return_id=null;    
		this.aid = id;
		this.dataload();  
		//���������� �����Ͱ� �Ѿ���� ��� �ش� �޼ҵ带 �ε��Ͽ� Ȯ���ϰ� ��
		int ea = this.db.size();
		int w = 0;
		while(w<ea) {
			if(this.aid.equals(this.db.get(w))) {
				this.return_id = this.db.get(w);
				break;
			}
			w++;
		}
		
	}
	
	@Override
	public String singok() { //getter

		return this.return_id;
	}
	@Override
	public void dataload() {
		String ori[] = {"hong","lee","park","jung","kim","jong","seo","java"};
		this.db = new ArrayList<>(Arrays.asList(ori));
		
	}
	
}
