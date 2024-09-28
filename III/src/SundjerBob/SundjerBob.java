package SundjerBob;

import java.applet.Applet;
import java.awt.*;

public class SundjerBob extends Applet {
	public void paint(Graphics g) {
		// gornje
		g.setColor(Color.YELLOW);
		g.fillOval(40,  5, 60, 40);
		g.fillOval(100, 5, 60, 40);
		g.fillOval(160, 5, 60, 40);
		g.fillOval(220, 5, 60, 40);
		
		// levo
		g.fillOval(35, 40,  30, 60);
		g.fillOval(35, 100, 30, 60);
		g.fillOval(35, 160, 30, 60);
		
		// desno
		g.fillOval(255, 40,  30, 60);
		g.fillOval(255, 100, 30, 60);
		g.fillOval(255, 160, 30, 60);
		
		g.setColor(Color.BLACK);
		
		// gornje
		g.drawOval(40,  5, 60, 40);
		g.drawOval(100, 5, 60, 40);
		g.drawOval(160, 5, 60, 40);
		g.drawOval(220, 5, 60, 40);
		
		// levo
		g.drawOval(35, 40,  30, 60);
		g.drawOval(35, 100, 30, 60);
		g.drawOval(35, 160, 30, 60);
		
		// desno
		g.drawOval(255, 40,  30, 60);
		g.drawOval(255, 100, 30, 60);
		g.drawOval(255, 160, 30, 60);
		
		// lice
		g.setColor(Color.YELLOW);
		g.fillRect(55, 20, 215, 205);
		
		// pege
		g.setColor(Color.GRAY);
		g.fillOval(65, 45, 15, 30);
		g.fillOval(60, 70, 10, 15);
		g.fillOval(65, 130, 15, 30);
		g.fillOval(60, 160, 5, 15);
		g.fillOval(250, 60, 5, 10);
		g.fillOval(240, 130, 15, 30);
		g.fillOval(250, 160, 5, 15);
		
		// nos
		g.setColor(Color.BLACK);
		g.drawLine(155, 100, 155, 160);
		g.drawLine(165, 100, 165, 140);
		
		// levo oko
		g.setColor(Color.BLACK);
		g.drawOval(115, 40, 50, 50);
		g.setColor(Color.WHITE);
		g.fillOval(115, 40, 50, 50);
		
		// zenica
		g.setColor(Color.GRAY);
		g.fillOval(130, 55, 20, 20);
		g.setColor(Color.BLACK);
		g.fillOval(135, 60, 10, 10);
		
		// desno oko
		g.setColor(Color.BLACK);
		g.drawOval(155, 40, 50, 50);
		g.setColor(Color.WHITE);
		g.fillOval(155, 40, 50, 50);
		
		// zenica
		g.setColor(Color.GRAY);
		g.fillOval(170, 55, 20, 20);
		g.setColor(Color.BLACK);
		g.fillOval(175, 60, 10, 10);
		
		// usta
		g.drawArc(115, 120, 90, 60, 180, 180);
		
		// zubi
		g.setColor(Color.WHITE);
		g.fillRect(145, 178, 10, 20);
		g.fillRect(165, 178, 10, 20);
		g.setColor(Color.BLACK);
		g.drawRect(145, 178, 10, 20);
		g.drawRect(165, 178, 10, 20);
		
		// kosulja
		g.setColor(Color.WHITE);
		g.fillRect(55, 225, 215, 20);
		g.setColor(Color.BLACK);
		g.drawRect(55, 225, 215, 20);
		
		// put
		g.setColor(Color.GRAY);
		g.fillRect(55, 245, 215, 60);
		g.setColor(Color.BLACK);
		g.drawRect(55, 245, 215, 60);
		
		// linije
		g.setColor(Color.BLACK);
		g.fillRect(60, 270, 40, 5);
		g.fillRect(110, 270, 40, 5);
		g.fillRect(165, 270, 40, 5);
		g.fillRect(225, 270, 40, 5);
		
		// kravata
		g.setColor(Color.GRAY);
		g.fillRect(150, 225, 20, 30);
		g.setColor(Color.BLACK);
		g.drawRect(150, 225, 20, 30);
		
		// noge
		g.setColor(Color.BLACK);
		g.drawRect(140, 305, 10, 50);
		g.drawRect(170, 305, 10, 50);
		
		// leva ruka
		g.setColor(Color.BLACK);
		g.drawArc(10, 205, 30, 30, 0, 180);
		g.drawLine(10, 220, 40, 220);
		g.drawRect(20, 220, 10, 70);
		g.drawOval(15, 290, 20, 20);
		
		// desna ruka
		g.setColor(Color.BLACK);
		g.drawArc(280, 205, 30, 30, 0, 180);
		g.drawLine(280, 220, 310, 220);
		g.drawRect(290, 220, 10, 70);
		g.drawOval(285, 290, 20, 20);
		
	}
}
