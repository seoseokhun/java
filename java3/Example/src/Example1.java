import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		 *  [UP&DOWN 게임]
		 *  기회는 총 5번
		 *  A파트 : PC랜덤 , Scanner(5) B파트 : PC에서 랜덤 숫자와 사용자가 뽑은 숫자를 비교 및 결과처리
		 *  
		 *  1.PC가 숫자를 하나 선택?? 힌트 random 숫자는 1~10까지
		 *  2.총 기회는 5번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력?
		 *  3.만약에 PC가 숫자 7을 선택 한 기준에서 사용자 숫자와 비교
		 *  4. PC : 7 사용자 : 2 => 결과 : UP
		 *  5.총 기회는 4번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력?
		 *  6.PC : 7 사용자 : 4 => 결과 : UP
		 *  7.총 기회는 3번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력?
		 *  8.PC:7 사용자 : 7 => 정답입니다. 모든 프로세서는 정지
		 */
		updown wn = new updown();
		  Scanner sc = new Scanner(System.in);
		  System.out.println("총 기회는 5번 남았습니다.");
		  int no = sc.nextInt();
		  Scanner sc1 = new Scanner(System.in);
		  System.out.println("총 기회는 4번 남았습니다.");
		  int no1 = sc1.nextInt();
		  Scanner sc2 = new Scanner(System.in);
		  System.out.println("총 기회는 3번 남았습니다.");
		  int no2 = sc2.nextInt();
		  Scanner sc3 = new Scanner(System.in);
		  System.out.println("총 기회는 2번 남았습니다.");
		  int no3 = sc3.nextInt();
		  Scanner sc4 = new Scanner(System.in);
		  System.out.println("총 기회는 5번 남았습니다.");
		  int no4 = sc4.nextInt();
		  
		 
		  
		 

	}

}