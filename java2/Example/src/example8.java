import java.util.Scanner;

public class example8 {

	public static void main(String[] args) {
		/*
		 * ���� ����� ���� ���� ���α׷��� ��û�Ͽ����ϴ�.
		 * ����ڰ� �� 5���� ���ڸ� �Է��ϰ� �˴ϴ�.
		 * "1~46 �� ������ ���ڸ� �Է��� �ּ���:"<5�� ���������
		 * ����ڰ� �Է��� 5�����ڸ� �迭�� �����մϴ�. (main�� ó��)
		 * 
		 * �ܺ� class�� �̿��Ͽ� PC�� ���� ��÷ ��ȣ 5���� �����ϰ� �̾Ƴ��ϴ�.
		 * PC�� ���� 5���� ���ڸ� �迭�� �����մϴ�.(�ܺ� class method�� ����)
		 * ������ ��� method�� �ϳ� �� �����Ͽ�
		 * ����ڰ� �Է��� 5���� �迭 �����Ϳ� pc�� ���� �迭 �����͸�
		 * �ش� method�� �����Ͽ�, ����Ͻø� �˴ϴ�.
		 * 
		 * ��, ��� ����ϴ� �ݺ����� ������ do~while������ �ۼ��մϴ�.
		 */
		int aa = 5;
		card c = new card();
		c.acard(aa);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~46�� ������ ���ڸ� �Է��� �ּ���:");
		sc.next();
		

	}

}
class card{
	public void acard(int user) {  //PC(5)
		int bb = 10;
		do {
			
		}while(bb<=46);
		
		card.bcard(user,bb);
	}
	public static void bcard(int user1,int pc) {  //�����(5),PC(5)
		//System.out.println(user1 + " "+ pc);
	}
}
