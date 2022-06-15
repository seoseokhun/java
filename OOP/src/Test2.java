
public class Test2 {

	public static void main(String[] args) {
		String array[][] = {
				{"이순신","홍길동","유관순"},
				{"90","40","100"},
				{"88","60","70"},
				{"70","100","55"}
		};
		int a,aa;
		for(a=0;a<3;a++) {//3
			System.out.println(array[0][a]);
			for(aa=0;aa<3;aa++) { //3
				System.out.println(array[a+1][aa]);
				
			}
		}
		

	}

}
