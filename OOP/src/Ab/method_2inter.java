package Ab;
//interface : ���� ��� : �޼��常 ����, �߰��� ������ ó���ϴ� ������ default�� �߰���
public interface method_2inter {  //�޼ҵ�
	//interface�� �޼ҵ� �̹Ƿ� �ʵ忡 �ڷ����� ���� �� �� ����
	public String names(); //String name() return �޼ҵ� ����
	
	default void setbox(String name) { //setter
		System.out.println(name);
	}
	default String box3() {//getter
		//interface���� default �����ϸ� ���� �޼ҵ带 �����
		return null;
	}
}

interface method_2re extends method_2inter{ 
	//interface�� extends�� �θ� interface�� �ε� �� �� �ֽ��ϴ�.
	
}