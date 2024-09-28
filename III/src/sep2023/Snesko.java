package sep2023;

import java.applet.Applet;
import java.awt.*;

public class Snesko extends Applet {
	public void paint(Graphics g)  {
		// NEBO
		g.setColor(Color.blue);
		g.fillRect(0, 0, 500, 220);
		
		// ZEMLJA
		g.setColor(Color.GRAY);
		g.fillRect(0, 220, 500, 180);
		
		// TELO
		g.setColor(Color.WHITE);
		g.fillOval(100, 240, 140, 140);
		g.fillOval(125, 150, 90, 90);
		g.fillOval(135, 80, 70, 70);
		
		// DUGMAD
		g.setColor(Color.BLACK);
		g.fillOval(165, 170, 15, 15);
		g.fillOval(165, 200, 15, 15);
		g.fillOval(165, 250, 15, 15);
		
		// SESIR
		g.setColor(Color.RED);
		g.fillRect(130, 90, 80, 10);
		g.fillRect(140, 60, 60, 30);
		
		// LEVO OKO
		g.setColor(Color.BLACK);
		g.fillOval(150, 100, 10, 10);
		g.fillOval(180, 100, 10, 10);
		
		// NOS
		g.setColor(Color.RED);
		int x[] = {175, 175, 215};
		int y[] = {130, 115, 130};
		g.fillPolygon(x, y, 3);
		
		// METLA
		g.setColor(Color.PINK);
		g.drawLine(215, 180, 280, 90);
		g.drawLine(280, 60, 280, 90);
		g.drawLine(280, 90, 300, 60);
		g.drawLine(280, 90, 300, 100);
			
		// PAHULJE
		g.setColor(Color.WHITE);
		g.drawLine(30, 200, 40, 190);
		g.drawLine(40, 200, 30, 190);
		g.drawLine(470, 200, 480, 190);
		g.drawLine(480, 200, 470, 190);
		g.drawLine(400, 230, 410, 220);
		g.drawLine(410, 230, 400, 220);
	}
}
