import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanell extends JPanel implements ActionListener  {
	final int PANEL_WIDHT = 500;
	final int PANEL_HEIGHT = 500;
	
	Image enemy;
	Image backguardImage;
	Timer timer;
	int xVelocity = 3;
	int yVelocity =1;
	int x = 0;
	int y = 0;
	

	MyPanell() {
		
		this.setPreferredSize(new Dimension(PANEL_WIDHT,PANEL_WIDHT));
		this.setBackground(Color.blue);
		this.setLayout(null);
		enemy = new ImageIcon("ball_64.png").getImage();
		backguardImage = new ImageIcon("football-stadium.png").getImage();
		timer = new Timer(20,this);
		timer.start();
		
		
	}
	public void paint ( Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(backguardImage, 0, 0, null);
		g2d.drawImage(enemy, x, y, null);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(x>=PANEL_WIDHT-enemy.getWidth(null) || x<0) {
			xVelocity = xVelocity * -1;
		}
		if(y>=PANEL_HEIGHT-enemy.getHeight(null) || y<0) {
			yVelocity = yVelocity * -1;
		}
		y= y + yVelocity;
		x = x + xVelocity;
		repaint();
		
		
	}
	
}
