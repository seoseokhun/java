
public class Test1 {

	public static void main(String[] args) {
		//�̼��� 90, ȫ�浿 40, ������ 100
		
		String array[][] = {
				{"�̼���","ȫ�浿","������"},
				{"90","40","100"}
				
		};
		int z,zz;
		for(z=0;z<3;z++) { //3����
			
			for(zz=z;zz<=z;zz++) { // 1����
				System.out.println(array[0][zz]+array[1][zz]);
			}
		}
		
		
		
		
		//1+1,1+5, 2+1, 2+5 3+1 ,3+5, 4+5
		int w=1;
		int f;
		while(w<5) {
			
			for(f=1;f<6;f++) {
				//System.out.println(w+"+"+f);
			}
			w++;
		}

	}

}
