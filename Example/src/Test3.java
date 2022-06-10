
public class Test3 {

	public static void main(String[] args) {
		int a, aa;
		int total=0;
		for (a = 1; a <= 5; a++) {
			
			for (aa = 1; aa <= 9; aa++) {
				total = total + (a+aa);
				total += a+aa;
				System.out.println(a + "+" + aa);
			}
		}
		System.out.println(total);

	}

}
