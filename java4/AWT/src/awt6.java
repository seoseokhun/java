import java.awt.*;
import java.awt.event.*;

//������ȣ�߼� �ý��� - awt6_abstract ���� �۾�
public class awt6 {

	public static void main(String[] args) {
		
		
		
		
		
	}
	class handel2 extends awt6_abstract{
		String message = "";
		@Override
		public void setter(String userno) {
			System.out.println(pc);
			if(userno.equals(pc)) {
				this.message = "���� �Ϸ� �Ǿ����ϴ�.";
			}
			else {
				this.message = "������ �ٽ� Ȯ�� �Ͻʽÿ�.";
			}
			
		}
		@Override
		public String getter() {
			// TODO Auto-generated method stub
			return null;
		}
	}

}
