import java.util.Scanner;

import javax.sound.midi.MidiChannel;

public class Scan3 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Q.사용자가 원하는 숫자를 입력하세요?");
		int z = k.nextInt();
		// %는 값을 나누면서 나머지값을 확인하는 수식구
		if(z % 2 == 0) {
			System.out.println("짝수 값입니다.");
		}
		else{
			System.out.println("홀수 값입니다.");
		}

	}

}
