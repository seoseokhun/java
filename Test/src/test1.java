
public class test1 {
	

	public static void main(String[] args) {
		
		bb b = new bb();
		b.cname = "ȫ�浿";
		String aws=b.bbb();
		System.out.println(aws);

	}

}
class bb{
	private String bname;
	public String cname;
	public void aaa(String user) {
		if(user=="ȫ�浿") {
			this.cname="�̹� ���� �Ǿ� �ֽ��ϴ�.";
		}
		else {
			this.cname="���� �� �� �ִ� ���Դϴ�.";
		}
	}
	public String bbb() {
		return null;
	}
	
}