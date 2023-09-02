package com.step1;
import javax.swing.JFrame;

public class JFrameTest1 extends JFrame {
	private static final long serialVersionUID = 1L;
	public JFrameTest1() {
		initDisplay();
	}
	public void initDisplay() {
		this.setSize(500, 400);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new JFrameTest1();
	}
}
