package com.printCopyImage;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	GamePanel gamePanel;
	
	public GameFrame() {
			
		this.setSize(500, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setVisible(true);
		
		gamePanel = new GamePanel();
		
		this.add(gamePanel);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameFrame gameFrame = new GameFrame();
		gameFrame.setVisible(true);

	}

}
