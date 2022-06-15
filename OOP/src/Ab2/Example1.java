package Ab2;

public class Example1 {

	public static void main(String[] args) {
		home h[] = {new computer(), new monitor()};
		home2 h2[]= {new phone()}; //extends로 home을 로드하였음
		
		//phone ph = new phone();
		//ph.broken(0);
		h[0].broken(40);
		h[1].broken(0);
		

	}

}

class computer implements home{
	@Override
	public void poweron() {
		System.out.println("컴퓨터 전원 공급중");
	}
	@Override
	public void poweroff() {
		System.out.println("컴퓨터 전원 중단");
		
	}
	@Override
	public void broken(int n) {
		if(this.bk <= n) {
			System.out.println("컴퓨터 고장");
		}
		else if(this.bk > n&&n > 0) {
			this.poweron();
		}
		else {
			this.poweroff();
		}
		
	}
}
class monitor implements home{
	@Override
	public void poweron() {
		System.out.println("모니터 전원 공급중");
		
	}
	@Override
	public void poweroff() {
		System.out.println("모니터 전원 중단");
		
	}
	@Override
	public void broken(int n) {
		if(this.bk <= n) {
			System.out.println("모니터 고장");
		}
		else if(this.bk > n&&n > 0) {
			this.poweron();
		}
		else {
			this.poweroff();
		}
		
		
	}
	
}
/* 휴대폰에 추가 기능이 필요함
 * 휴대폰 고장시 최소전원 (20) -> 정상작동 40이상 80이상되면 (고장)
 * 1.전원은 공급되지만 화면이 고장날 경우 (공급중 작동이 안되는 경우) - 20~39까지
 * 2.전원을 공급시키지만 배터리 충전이 안될 경우 (공급이 아예 안되는 경우) - 20 미만 숫자일 경우
 * */
class phone implements home,home2{  
	@Override
	public void powerchk1() { // 20~39
		System.out.println("전원을 공급 충전이 안될 경우");
	}
	@Override
	public void powerchk2() {
		System.out.println("전원을 공급시키지만 배터리 충전이 안될 경우");
	}
	@Override
	public void poweron() {
		
		System.out.println("휴대폰 전원 공급중");
	}
	@Override
	public void poweroff() {
		System.out.println("휴대폰 전원 중단");
	}
	@Override
	public void broken(int n) {
		if(this.bk <= n) {
			System.out.println("휴대폰 고장");
		}
		else if(this.bk > n&&n > 0) {
			if(n<20) {
				this.powerchk2();
			}
		}
		else if(n>=20&&n<=39) {
			this.powerchk1();
		}
		
		else {
			this.poweron();
		}	
	}
	
	
}
