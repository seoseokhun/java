import java.text.SimpleDateFormat;
import java.util.Date;

public class Double_loop1 {

	public static void main(String[] args) {
		/*
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("YY��MM��DD��");
		SimpleDateFormat time = new SimpleDateFormat("H:m:s");
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		//format  : �԰�ȭ�� ���·� ���� ǥ���Ҷ� ����ϰ� �˴ϴ�.
		*/
		
		/*
		int f;
		for(f=1; f<=10; f=f+2) {// f=f+2 <�� +2�� ������ 3�̸� +3��
			System.out.println(f+" ");
		}
		*/
		
		/*
		 ���빮��
		 3���� ��ǰ
		 "���ڵ�� ��ǰ�� �Է½����ּ���?"�ݾ��� �Է��ϰ� ����
		 ��, "���� %�� �Է��� �ּ���:"��� ������ �Բ�
		 �ش� ���� ���ڸ� �Է��ϸ�
		 �����ݾ��� ���� �Ǿ� ��µǵ��� �մϴ�.
		 
		 int money = 100000;
		 int coupon = 20;
		 double a = coupon * 0.01;
		 System.out.println(a);
		 double b = money * a;
		 System.out.println(b);
		 double c = money - b;
		 System.out.println(c);
		 
		int money = 100000;
		 int coupon = 20;
		 double a = coupon * 0.01;
		 System.out.println(a);
		 double b = money * a;
		 System.out.println(b);
		 double c = money - b;
		 System.out.println(c);
		 */
		
		int f,ff;
		int total;
		for(f=1;f<=3;f++) {
			//System.out.println(f);
			for(ff=1;ff<=4;ff++) {
				total = f+ff;
				System.out.println(f + "+" +ff);
				}
			
		}
	}

}
