import java.awt.*;
import java.awt.event.*;

//AWT ȯ�漳�� 
public abstract class awt5_abstract {
	
	public abstract String singok();  //getter
	public abstract void idcheck(String id); //setter
	public abstract void dataload();  //Database
	Frame fr = new Frame();
	Button bt = null;
	Button close = null;
	TextField mid = null;
	Label msg = new Label();
	
	public void design() {
		this.fr.setBounds(200,200,300,450);
		this.fr.setLayout(null);
		this.fr.setVisible(true);
		this.bt = new Button("�ߺ�üũ");
		this.close = new Button("����");
		this.mid = new TextField();
		this.msg.setBackground(Color.LIGHT_GRAY);
		this.msg.setBounds(25,200,250,25);
		this.mid.setBounds(25,160,150,25);
		this.bt.setBounds(190,160,80,25);
		this.close.setBounds(200,300,80,25);
		this.fr.add(this.msg);
		this.fr.add(this.mid);
		this.fr.add(this.bt);
		this.fr.add(this.close);
		this.click();  //awt �������� �Ϸ� �� �ش� �ڵ鸵 �޼ҵ�� �̵�
		
	}
	public void click() {
		//�ߺ�Ȯ�� ��ư
		this.bt.addActionListener(new ActionListener() {
			
			@Override
			//setText(���), getText(�Է°� ��������)
			public void actionPerformed(ActionEvent e) {
				String userid = awt5_abstract.this.mid.getText();
				if(userid.equals("")) {
					msg.setText("���̵� �Է��ϼ���");
				}
				else {
					idcheck(userid);
					String result = singok();
					if(result==null) {
						msg.setText("��밡���� ���̵� �Դϴ�.");
					}
					else {
						msg.setText("�ٸ� ���̵� �Է��� �ֽʽÿ�.");
					}
				}
				
			}
		});
		//�����ư
		this.close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	}
	
	
	
	
	
	
}