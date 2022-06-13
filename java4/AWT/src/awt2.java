import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
//외부 클래스로 awt 생성
public class awt2 {
	public static void main(String[] args) {
		login lg = new login();
		
	}

}
class loginok extends login{ //화면 전환 하는 자식 클래스
	public loginok() {
		this.fr.setTitle("로그인 후 페이지");
		this.fr.setBounds(0,0,400,400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
	}
	
	
	
}






class login {  //연습용 > extends abstract(추상 class)를 먼저 로드 하여 필드에 적용시킴
	Frame fr = new Frame();
	Font ft = new Font("돋움체",Font.BOLD,20); // (글씨체 / 효과 / 글씨크기)
	TextField mid = new TextField();
	TextField mpw = new TextField();
	Button lg_btn = new Button("로그인");
	Button close_btn = new Button("프로그램 종료");
	Button ship_btn = new Button("회원가입");
	Label msg = new Label();
	
	public login() {
		this.fr.setTitle("로그인 만들기");
		this.fr.setBounds(0,0,400,400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		mid.setFont(ft); // 글자 속성을 적용하고자 하는 오브젝트 선택
		mpw.setFont(ft);
		mpw.setEchoChar('*'); //쌍따옴표 "" x 외따옴표 ''로 구분함

		
		mid.setBounds(100,60,200,40);
		mpw.setBounds(100,120,200,40);
		lg_btn.setBounds(100,180,200,40);
		close_btn.setBounds(100,240,200,40);
		ship_btn.setBounds(100,300,200,40);
		this.close_btn.setBounds(100,300,200,40);
		//this.msg.setBackground(Color.red);
		this.msg.setBounds(100,100,200,20);
		this.fr.add(msg);
		this.fr.add(mid);
		this.fr.add(mpw);
		this.fr.add(lg_btn);
		this.fr.add(ship_btn);
		this.fr.add(this.close_btn);
		this.clicks();
		
		
	}
	public void clicks() { // 버튼에 관한 모든 핸들링 메소드 집합소
		this.ship_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false); //해당 프레임 종료
				loginok ok = new loginok(); //다음 프레임을 로드
				
				
			}
		});
		
		
		
		
		this.close_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//프로그램 종료 이벤트 핸들링 메소드
				System.exit(0);
				
			}
		});
		this.lg_btn.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane(); //swing API 경고옵션 로드
			@Override
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼 아이디 및 패스워드 검토
				String user_id = mid.getText(); //Object명.getText(사용자가 입력한 값을 가져올때 사용합니다.)
				String user_pw = mpw.getText();
				if(user_id.equals("")) {//null사용 금지 => null 또한 값이 있는 상태를 말함
					msg.setText("아이디를 입력하세요");
					//alert.showMessageDialog(null, "아이디를 입력하세요","경고메세지",JOptionPane.ERROR_MESSAGE);
					
				}
				else { 
					if(user_pw.equals("")) {
						msg.setText("패스워드를 입력하세요");
						
				}
					else {
						msg.setText("로그인을 진행합니다.");
					}
				}
			}
		});
		
	}
}