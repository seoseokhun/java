import java.util.Arrays;
import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		/*
		 * �迭���� + �⺻(Ŭ����)�޼ҵ� ����
		 * ����ڰ� ���� ������ ���� �Է��ϰ� �˴ϴ�.
		 * "�б� �л� �̸��� �Է��� �ּ���?"
		 * ������ �� �迭 �����ʹ� 5���� ���� �Ǿ� ���ϴ�.
		 * ������ �޼ҵ忡�� �ش� ����ڰ� �Է��� ���� ����Ʈ�� �����Ͽ�
		 * ����Ͻÿ�.
		 * ����) ����ڰ� �Է��� ���� : hong kim park lee jang
		 * 
		 * ���) [hong,kim,park,lee,jang]
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int f;
		String lists = "";
		for(f=0;f<5;f++) {
			System.out.println("�б� �л� �̸��� �Է��� �ּ���?");
			String nm = sc.next();
			lists += (nm+" ");
			
		}
		arrays(lists);
	}
	public static void arrays(String k) {
		//System.out.println(k);
		String userin[] = k.split(" "); //split : ���ڿ� �Ǵ� ���ڿ��� Ư������ �������� �迭�� ���� �� �ִ� ��ɾ� �Դϴ�.
		System.out.println(Arrays.toString(userin));
		 
		
		
			
		}
}

