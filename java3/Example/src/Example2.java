
public class Example2 {
	
	private int val1; //pc
	private int val2; //user
	private String msg; //����޼���
	
	public void randomck(int pc, int user) {  //setter(�μ���)
		this.val1 = pc;
		this.val1 = user;
		if(this.val1 > this.val2) {
			this.msg = "Up �Դϴ�.";
		}
		else if(this.val1 < this.val2) {
			this.msg = "Down �Դϴ�.";
		}
		else {
			this.msg = "���� �Դϴ�.";
			
		}
	}
	
	
	
	public String result() { //getter (�μ���X) return
		
		return this.msg;
	}
}

