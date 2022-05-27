
public class Example4 {

	public static void main(String[] args) {
		/*
		 응용문제 4
		 다음 결과값에 맞춰서 코드가 출력 되도록 하시오.
		 해당 코드는 for문으로 작성합니다.
		 45,35,25,15,10
		 
		int a1;
		int b1=5;
		int c1;
		for(a1=9;a1>=2;a1--) {
			c1=b1*a1;
			System.out.print(c1+",");
		*/	
			int f;
			int v;
			for(f=9;f>0;f--) {
				v=5*f;
				if(f%2==1 && f>=2||f==2) {
				System.out.print(v+" ");
				
				
			}
		}
		

	}

}
