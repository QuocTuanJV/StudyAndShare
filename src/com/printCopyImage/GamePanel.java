package com.printCopyImage;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	FrameImage frameImage;
	FrameImage cpFrameImage;
	BufferedImage image, subImage;
	
	public GamePanel() {
		
		
		
		try {
			image = ImageIO.read(new File("data/getToaDo.png"));
			subImage = image.getSubimage(527, 38, 84,95 );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
		frameImage = new FrameImage("Test", subImage);
		
		cpFrameImage = new FrameImage(frameImage);
		
		System.out.println(cpFrameImage.getImageHeight());
		System.out.println(cpFrameImage.getImageWidth());
//		
		
	}
	
	public void paint(Graphics g2) {
		
		
		g2.setColor(Color.red);
		g2.fillRect(0, 0, 500, 600);
		
//		g2.drawImage(frameImage.getImage(), 0, 0, this);
		
		g2.drawImage(cpFrameImage.getImage(), 0, 0, this);
	
		
		
		
//		g2.drawImage(subImage, 0, 0, this);
		
	}
	

}
