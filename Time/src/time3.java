import java.util.Timer;
import java.util.TimerTask;

public class time3 {

	public static void main(String[] args) {
		
		/*
		try {
			System.out.println("��������");
			Thread.sleep(5000);
			System.out.println("��������");
			
			
		}catch(InterruptedException a){
			System.out.println(a);
		}
		*/
		/* ���빮��. �ܺ� class�� �ֽ��ϴ�. �� ���� Ŭ�������� �ش�
		 * �ܺ� Ŭ������ �ε��ϸ� �ش� �޼ҵ忡�� �ﰢ������ 8�� ���� �ε��� �߻��մϴ�.
		 * 8�� ���� "ó�����Դϴ�. ��ø� ��ٷ� �ּ���."
		 * 8�� ���Ŀ� return���� "�Ա��� ��� ó�� �Ǿ����ϴ�."��� ���ڸ� �޵��� �Ͻʽÿ�. */
		time tm = new time();
		tm.run();
		
		

		
	}

}
class time {
	public void run() {
		try {
			System.out.println("ó�����Դϴ�. ��ø� ��ٷ� �ּ���.");
			Thread.sleep(8000);
			String kkk = this.msg();
			System.out.println(kkk);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
	}
	public String msg() {
		return "�Ա��� ��� ó�� �Ǿ����ϴ�";
	}
}

