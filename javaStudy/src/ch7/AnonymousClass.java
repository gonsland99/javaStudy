package ch7;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass {
	public static void main(String[] args) {
		Button b = new Button("start");
		
		//익명클래스: 일회성으로 사용되는 클래스를 익명으로 작성
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred~!");
			}
		});
		
//		b.addActionListener(new EventHandler());
	}
}
/*
//EventHandler 클래스
class EventHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred~!");
	}
}
*/
