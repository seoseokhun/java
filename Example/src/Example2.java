import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * 응용문제 2 사용자가 입력한 숫자에 맞춰 구구단이 결과를 계산하여 짝수 인지 홀수 인지를 출력. "구구단에 대한 숫자를 입력하세요?"라고
		 * 출력 메세지가 나오면 해당 숫자에 맞춰서 모든결과를 더하며, 더한 값에 따라 짝수 인지 홀수 인지를 출력하시면 됩니다. 단, 해당 반복문은
		 * for ~ do while문까지 한가지를 선택해서 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		int gugudan;
		int f;
		int total = 0;
		//System.out.println("구구단에 대한 숫자를 입력하세요?");
		gugudan = sc.nextInt();
		for (f = 1; f <= 9; f++) {
			total += gugudan;
		}
		System.out.println("구구단의 총합은:" + total);
		sc.close();
		if(total % 2==0) {
		}

	}

			
	

}
