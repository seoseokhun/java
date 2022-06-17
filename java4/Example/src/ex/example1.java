package ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class example1 {

	public static void main(String[] args) {
		//외부 class를 사용하여 다음 프로세서를 작성하시오.
		/*
		 * 다음 2개의 배열 데이터가 있습니다. 단, 2개의 배열을 하나의 배열로
		 * 합치도록 합니다. 그 대신 중복된 값은 하나로 처리를 하셔야 합니다.
		 * 1번 DB : 11,22,33,44,55
		 * 2번 DB : 8,10,11,19,44
		 * 
		 * [결과출력]
		 * 8,10,11,19,22,33,44,55
		 * 힌트 Collections 이용 단 ArrayList LinkedList를 사용시
		 */
		/*1. 1번 DB 2번 DB 중복값 비교 및 삭제 2번 DB 삭제 
		 * 2. 2번 DB를 1번 DB에 추가
		 * 3. 1번 DB sort로 정렬
		 * 
		 *  */
		
		outclass ot = new outclass();
		ot.fileter();
	}

}
class outclass{
	int a[],b[];
	ArrayList<Integer> a1 = null;
	ArrayList<Integer> b1 = null;
	ArrayList<Integer> c1 = null;
	
	public void fileter ( ) {
		Integer[]a = {11,22,33,44,55};
		Integer[]b = {8,10,11,19,9,44};
		this.a1 = new ArrayList<Integer>(Arrays.asList(a));
		this.b1 = new ArrayList<Integer>(Arrays.asList(b));
		
		int w = 0;
		do {
			int ww = 0;
			int z = this.b1.size();
			while(ww<z) {
				if(this.a1.get(w)== this.b1.get(ww)) {
					this.b1.remove(ww);
					this.b1.add(ww,0);
					//break;
				}
				ww++;
			}
			w++;
		}while(w<this.a1.size());
		
		int t=0;
		while(t<this.b1.size()) {
			if(this.b1.get(t)!=0) {
				this.a1.add(this.b1.get(t));
			}
			t++;
		}
		Collections.sort(this.a1);
		System.out.println(this.a1);
		
		
	}
}
