package februar2023;

import java.applet.Applet;
import java.awt.*;

public class februar2023 extends Applet {
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 500, 500);
		
		g.setColor(Color.GREEN);
		g.fillRect(0, 300, 350, 50);
		
		g.setColor(Color.ORANGE);
		g.fillOval(0, 140, 80, 80);
		g.fillRect(35, 210, 15, 90);
		
		g.setColor(Color.GRAY);
		g.fillRect(130, 130, 10, 30);
		
		g.setColor(Color.RED);
		int x[] = {100, 175, 250};
		int y[] = {180, 120, 180};
		g.fillPolygon(x, y, 3);
		
		g.setColor(Color.GRAY);
		g.fillRect(100, 180, 150, 120);
		
		g.setColor(Color.WHITE);
		g.fillRect(115, 200, 40, 40);
		
		g.setColor(Color.BLACK);
		g.drawLine(135, 200, 135, 180); 
		
		g.setColor(Color.WHITE);
		g.fillRect(195, 200, 40, 40);
		
		g.setColor(Color.BLACK);
		g.drawLine(215, 200, 215, 180);
		
		g.setColor(Color.BLACK);
		g.fillRect(160, 250, 30, 50);
		
		g.setColor(Color.YELLOW);
		g.fillOval(310, 15, 50, 50);
		
		g.setColor(Color.WHITE);
		g.fillOval(30, 60, 40, 40);
		g.fillOval(80, 80, 30, 30);
		g.fillOval(60, 60, 40, 40);
		
		g.setColor(Color.WHITE);
		g.fillOval(200, 15, 15, 10);
		g.fillOval(210, 15, 20, 10);
		g.fillOval(210, 20, 20, 15);
		g.fillOval(225, 15, 20, 10);
		g.fillOval(220, 20, 20, 15);
		
		g.setColor(Color.WHITE);
		g.fillOval(330, 20, 30, 20);
		g.fillOval(350, 25, 40, 30);
		g.fillOval(330, 30, 30, 30);
	}
}
