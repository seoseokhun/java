
public class awt4 {

	public static void main(String[] args) {
		//awt4_class.java ����
		decorate de = new decorate();
		de.view();
	}

}
class decorate extends awt4_class {
	public String aws="";
	
	public void btn_push(int c) {
		/* ����ڰ� �Է��� ���ڸ� �������� �������� �ۼ� */
		//System.out.println(c);
		int ff;
		String prf = "";
		for(ff=1;ff<10;ff++) {
			int k = c * ff;
			prf = prf + c +"*"+ff+"="+k+"\n";
			}

		this.aws = prf;
		
		
	}
	public String calls() {
		return this.aws;
	}
}
