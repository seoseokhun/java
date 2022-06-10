
public class test2 {

	public static void main(String[] args) {
		/*배열값중 css라는 단어를 빼고 나머지를 출력 (안) */
		/*배열값중 css라는 단어가 있는지 확인하는 출력 프로세서를 제작(안,밖) */
		String adata[] = {
			"자바","HTML","CSS","스프링"	
		};
		
		int ea = adata.length;  //4
		
		int w = 0;
		while(w<ea) {
			if(!adata[w].equals("CSS")) { // == (숫자,true,false,null)
				System.out.println(adata[w]);
			}
			w++;
		}
		
		int z = 0;
		boolean k = false;
		while(z<ea) {
			if(adata[z].equals("CSS")) {
				k = true;
			}
			z++;
		}
		
		if(k==false) {
			System.out.println("해당 단어는 없습니다.");
		}
		else {
			System.out.println("해당 단어가 포함되어 있습니다.");
		}
		

	}

}
