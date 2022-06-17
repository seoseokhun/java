import java.awt.*;
import java.awt.event.*;

//인증번호발송 시스템 - awt6_abstract 연계 작업
public class awt6 {

	public static void main(String[] args) {
		
		
		
		
		
	}
	class handel2 extends awt6_abstract{
		String message = "";
		@Override
		public void setter(String userno) {
			System.out.println(pc);
			if(userno.equals(pc)) {
				this.message = "인증 완료 되었습니다.";
			}
			else {
				this.message = "인증를 다시 확인 하십시오.";
			}
			
		}
		@Override
		public String getter() {
			// TODO Auto-generated method stub
			return null;
		}
	}

}
