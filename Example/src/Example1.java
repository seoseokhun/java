import java.util.Random;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		 *  [UP&DOWN ����]
		 *  ��ȸ�� �� 5��
		 *  A��Ʈ : PC���� , Scanner(5) B��Ʈ : PC���� ���� ���ڿ� ����ڰ� ���� ���ڸ� �� �� ���ó��
		 *  
		 *  1.PC�� ���ڸ� �ϳ� ����?? ��Ʈ random ���ڴ� 1~10����
		 *  2.�� ��ȸ�� 5�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�?
		 *  3.���࿡ PC�� ���� 7�� ���� �� ���ؿ��� ����� ���ڿ� ��
		 *  4. PC : 7 ����� : 2 => ��� : UP
		 *  5.�� ��ȸ�� 4�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�?
		 *  6.PC : 7 ����� : 4 => ��� : UP
		 *  7.�� ��ȸ�� 3�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�?
		 *  8.PC:7 ����� : 7 => �����Դϴ�. ��� ���μ����� ����
		 */
		Example2 ex2 = new Example2();
		/*�Ϲ� random ����(�⺻random�� ������ double)*/
		//int pc = (int)(Math.random()*10+1);
		/* util�� �̿��� random���� */
		  Scanner sc = new Scanner(System.in);
		  Random r = new Random();
		  int pc = r.nextInt(10)+1; //pc�� ���� ���� 
		  
		  
		  
		   
		 
		  int w = 5;
		  do {
			  System.out.println("�� ��ȸ��" +w+"�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�?");
			  int user = sc.nextInt();
			  ex2.randomck(pc,user);
			  String out = ex2.result();
			  System.out.println(out);
			  
			  int check = out.indexOf("����"); //indexOf : �ܾ�˻� (-1:����, 0:����)
			  if(check==0) {
				break;
			  }
			  w--;
		  }while(w>=0);
		  
		  sc.close();
		  
		 
		  
		 
		  
		 

	}

}