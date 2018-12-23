package com.getimage;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GetImage {
	private JFrame jframe;
	private JPanel jpanel;

	BufferedImage image, subImage;
	
	
	public GetImage() {

		
		// get image with BufferedImage
		
		try {
			image = ImageIO.read(new File("data/getToaDo.png"));
			subImage = image.getSubimage(527, 38, 84,95 );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//create Frame
		jframe = new JFrame();	
		jframe.setSize(500, 600);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		
		//create JPanel
	
		jpanel = new JPanel() {
				
				public void paint(Graphics g2) {
					g2.setColor(Color.white);
					g2.fillRect(0, 0, 500, 600);
					
					g2.drawImage(subImage, 0, 0, this);
				}
				
				
		};
		
	
		jframe.add(jpanel);
		
		
	
	}
	
	public void createJFrame() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	GetImage getImage = new GetImage();
    	getImage.createJFrame();

	}
	
}


