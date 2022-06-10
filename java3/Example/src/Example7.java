
public class Example7 {

	public static void main(String[] args) {
		int array[] = { 5, 3, 1, 10, 6, 12 };
		int ea = array.length;
		//System.out.println(array[4]);
		
		for (int f = 0; f < ea; f++) {
			if(array[f]>7 && array[f]%3==0) {
				//System.out.println(array[f]);
				
			}
		}
		int array2[]= {55,44,33,22,11,10,9,8,7,6,5,4,3,2,1};
		/* 해당 배열값 중 짝수 값 및 10이하의 숫자만 출력하시오.*/
		/*결과 8,6,4,2*/
		int ff;
		int zz = array2.length;
		for(ff = 0; ff<zz;ff++) {
			if(array[ff]%2==0 && array[ff]<10) {
				System.out.println(array[ff]);
			}
		}
		
	}

}
