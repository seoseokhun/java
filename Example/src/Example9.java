import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		 * 응용문제 9 
		 * A학생에 대한 성적을 입력 받고 평균점수가 나오는 프로그램을 제작합니다. 
		 * "점수를 입력하세요?" 라는 문구는 총 5번이 나오게되며, 모든 점수는 합산하여 출력합니다. 
		 * 변동사항 : 모든 점수를 합산한 후, 5개의 점수에 대한 평균값을 출력하셔야 합니다. 
		 * 출력메세지는 "해당점수의 평점은 : " 출력
		 * 단, 평점 점수가 40점 이하일 경우, "재시험입니다."라고 메세지를 출력후 프로세서는 종료합니다. 40점
		 * 이상인경우 "합격"이라고 메세지를 출력하십시오. 
		 * [추가기획] "입력하실 과목 수를 적어주세요 : " 라고 제일 먼저 출력후 해당과목 수
		 * 만큼 반복문이 적용이 되며, 과목수 만큼 평균값이 적용되어야 합니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하실 과목 수를 적어주세요 : ");
		int a;
		int sub = sc.nextInt();
		int b;
		int total = 0;
		
		for (b = 1; b <= sub; b++) {
			System.out.println("점수를 입력하세요? ");
			a = sc.nextInt();
			total += a;
		}

		int average = total / sub;
		System.out.printf("해당점수의 평점은 : %d", average);

		if (average <= 40) {
			System.out.println("\n재시험입니다.");
		} else {
			System.out.println("\n합격");
		}
		sc.close();
	}

}
