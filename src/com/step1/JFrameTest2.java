package com.step1;
import javax.swing.JFrame;

public class JFrameTest2 extends JFrame {
	private static final long serialVersionUID = 1L;
	public JFrameTest2() {
		initDisplay(400,500);
	}
	public void initDisplay() {
		this.setSize(500, 400);
		this.setVisible(true);
	}
	public void initDisplay(int width,int height) {
		this.setSize(width, height);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new JFrameTest2();
	}
}
