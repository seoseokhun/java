
public class Method14 {

	public static void main(String[] args) {
		mbc m = new mbc();
		mbc m2 = new mbc("이순신");

	}

}

class mbc{
	public mbc() {  //일반 construct
		System.out.println("구조1");
		test();
	}
	public mbc(String user) {  //construct 인수값이 있는
		System.out.println(user);
		test(user);
	}
	public mbc(int user) {//construct에서 인수값은 자료형으로 구분 되어집니다.
		System.out.println(user);
		//test(user);
	}
	public void test() {  
		System.out.println("메소드");
		total();
	}
	public void test(String user) { //인수값이 있는 method 입니다.
		System.out.println(user);
		total();
	}
	public static void total() {
		System.out.println("시스템 종료");
	}
}