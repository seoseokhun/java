
public class Method6 {

	public static void main(String[] args) {
		// private�� ���� ��ü ���� ����2
		insert i = new insert();
		i.userid="hong";
		String skey = "11223344";
		String result = i.checks(skey);
		System.out.println(result);

	}

}

class insert{
	String userid = null;
	private String key = "a123456"; //�ش� Ŭ�������� ����Ǵ� key��
	
	public String checks(String bb) {
		this.key = bb;
		String msg = null;
		if(key.equals("a1234567")) {   
			//�ش� key��(private)�� �ܺ� class���� �Ѿ���� �μ����� ��
			if(userid.equals("hong")) { //���̵� Ȯ��
				msg = "�����͸� Ȯ�� �߿� �ֽ��ϴ�.";
			}
			else {
				msg ="�ش� �����Ͱ��� Ȯ�� ���� ���մϴ�.";
			}
		}
		else {  //�ܺ� class���� �ùٸ� Ű���� ���� ���� ���� ���
			msg = "error";
		}
		return msg;  //���� ����� ���� return���� ȸ����
	}
	
}
