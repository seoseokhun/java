import java.util.Arrays;

public class Method7 {

	public static void main(String[] args) {
		apink ap = new apink("ȫ�浿",25,"test@test.com",-1000);
		System.out.println(ap.data());
		System.out.println(ap.data2());
	}

}

class apink {
	// private������ class �ʵ忡�� ���� �ؾ� �մϴ�.
	//String nm2;
	private String nm;
	private int age;
	private String email;
	private String email_cp;
	private int point;

	public void names() {
		if(this.nm == "ȫ�浿") {
			this.nm = "hong";
			String e[] = this.email.split("@");
			System.out.println(Arrays.toString(e));
			//�̸��� �߿� �̸��� ȸ�� ������ �������� ���� �迭�� ������ �۾�
			this.email_cp = e[1];
		}
		
	}

	public apink(String nm1, int age2, String email3, int point4) { // private �� �ȿ��� ������� ����
		//setter ����
		this.nm = nm1;
		this.email = email3;
		if(point4 < 0) {
			this.point = 0;
		}
		else {
			this.point = point4;
		}
		//names();
	}

	public String data() {
		names(); 
		return this.email_cp;
		//return this.nm; //������ �� �������� ����ϴ� �ڵ� �Դϴ�.
		//return �ؿ� �ڵ�� ��� ������ �߻��ϰ� �˴ϴ�.
	}
	public int data2() {
		//getter ����
		return this.point;
	}
	

}