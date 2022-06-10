import java.util.Random;
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
		Example2 ex2 = new Example2();
		/*일반 random 형식(기본random은 무조건 double)*/
		//int pc = (int)(Math.random()*10+1);
		/* util을 이용한 random형식 */
		  Scanner sc = new Scanner(System.in);
		  Random r = new Random();
		  int pc = r.nextInt(10)+1; //pc가 뽑은 숫자 
		  
		  
		  
		   
		 
		  int w = 5;
		  do {
			  System.out.println("총 기회는" +w+"번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력?");
			  int user = sc.nextInt();
			  ex2.randomck(pc,user);
			  String out = ex2.result();
			  System.out.println(out);
			  
			  int check = out.indexOf("정답"); //indexOf : 단어검색 (-1:없음, 0:있음)
			  if(check==0) {
				break;
			  }
			  w--;
		  }while(w>=0);
		  
		  sc.close();
		  
		 
		  
		 
		  
		 

	}

}