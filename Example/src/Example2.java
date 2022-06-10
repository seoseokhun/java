
public class Example2 {
	
	private int val1; //pc
	private int val2; //user
	private String msg; //결과메세지
	
	public void randomck(int pc, int user) {  //setter(인수값)
		this.val1 = pc;
		this.val1 = user;
		if(this.val1 > this.val2) {
			this.msg = "Up 입니다.";
		}
		else if(this.val1 < this.val2) {
			this.msg = "Down 입니다.";
		}
		else {
			this.msg = "정답 입니다.";
			
		}
	}
	
	
	
	public String result() { //getter (인수값X) return
		
		return this.msg;
	}
}

