package App;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		
		
	}

}


class result{
	private String data[][] =  
		{
			{"������","�̰���","���","������","������"},
			{"80","78","92","67","40" },
			{"40","80","80","92","100"},
			{"95","30","55","90","65"},
			{"20","80","100","95","30"}

		};
	String re = "";
	String subject[] = {"��ü����","����","����","����","����"};
	
	public String serach(String name, String sub) {
		
		
		int tmp = 0;
		int count = 0;
		for (int i = 0; i<this.data.length;i++) {
			for(int j = 0; j<this.data[0].length;j++) {
				if(this.data[0][j].equals(name)) {
					tmp = j;
					count ++;
				}
				
			}
		}
		if(count == 0) {
			System.out.println("����� �̸� ��Ȯ��");
		}
		else {
		for(int i = 1; i<this.data.length; i++) {
			switch(sub) {
			case "��ü" ->re += subject[i] + " : " + data[i][tmp] + "  ";
			case "����" -> re = sub + " : " + data[1][tmp];
			case "����" -> re = sub + " : " + data[2][tmp];
			case "����" -> re = sub + " : " + data[3][tmp];
			case "����" -> re = sub + " : " + data[4][tmp];
			
			}
			
		}
		}
		return re;
	
	}
}

