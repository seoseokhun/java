
public class Method3 {

	public static void main(String[] args) {
		/*
		 * ���빮��. ����ڰ� �μ��� 2���� ���ڸ� �����Ͽ� ���ǵ��� �մϴ�.
		 * ���� ��갪�� �޾Ƽ� ����� ����Ͻÿ�.
		 * 157,45
		 * 157*45
		 * ��������� ��� : 7065
		 * */
		math ma = new math();
		//int result = ma.m(157,45);
		//System.out.println(result);
		//ma.m2();
		/*
		 * ���빮�� ���� ���� �ϳ��� �ش� �޼ҵ�� ���� �ϰ� �˴ϴ�. 
		 * �ش� �޼ҵ忡���� ������ ���� ó�� �մϴ�.
		 * ���� 3�� �����ϸ� 3*1 ~ 3*9������ ��� ������� ���Ͽ�
		 * sysout���� ��� �ǵ��� �Ͻʽÿ�.
		 */
		ma.gugu(3);
		
		
		String ck = ma.mb("hong");
		System.out.println(ck);
		
		

	}
	

}
class math{
	public int m(int a, int b) {
		int c = a * b;
		return c;
	}
	public void m2() {
		int z = m(100,200);
		//System.out.println(z);
	}
	public int gugu(int c) {
		int w = 1;
		int total = 0;
		while(w<=9) {
			//total = total +(c*w);
			total += c * w;  
			w++;			
		}
		return total;  
		// ��� �ݺ��� �ȿ��� ���� return ���� ���� ���ǹ��̶� ����� return ��� �ȵ˴ϴ�.
	}
	public String mb(String mid) {
		String msg="";
		if(mid.equals("hong")) {
			msg = "ok";
		}
		else {
			msg = "cancel";
		}
		return msg;  
		/* �ش� �޼ҵ忡 ������ ���� �� ���ǿ� �´� ���� �����Ͽ� ��������
		���� return ��Ŵ*/
	}
	
}
