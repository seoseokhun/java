import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class awt7 {
	Checkbox ck = null;
	static boolean agree = false;
	
	public static void main(String[] args) {
		Frame fr = new Frame();
		fr.setBounds(200,200,350,180);
		fr.setLayout(null);
		fr.setVisible(true);
		Checkbox ck = new Checkbox("동의함");
		Choice se = new Choice();
		ck.setBounds(30,40,100,100);
		se.setBounds(30,80,100,30);
		se.add("skt");
		se.add("kt");
		se.add("LGT");
		se.add("알뜰폰");
		fr.add(ck);
		fr.add(se);
		/*addItemListener : Checkbox, choice에서 사용함*/
		ck.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				/*
				System.out.println(e);
				  String checks = (String)e.getItem();
				  */
				if(e.getStateChange()==1) {
					agree = true;
					//System.out.println("동의하셨습니다.");
				}
				else {
					agree = false;
					//System.out.println("동의를 하셔야 합니다.");
				}
				  System.out.println(e.getStateChange());
				//1 : chek 2: uncheck
			}
		});
		se.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String change = (String)e.getItem();
				System.out.println(change);
				System.out.println(agree);
				
			}
		});
	}

}
