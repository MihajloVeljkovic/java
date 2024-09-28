package mart2022;

import java.applet.Applet;
import java.awt.*;

public class mart2022 extends Applet {
	public void paint(Graphics g) {
		// LEVI
		g.setColor(Color.YELLOW);
		g.fillOval(30, 170, 40, 60);
		g.fillOval(30, 110, 40, 60);
		g.fillOval(30, 50, 	40, 60);
		g.setColor(Color.BLACK);
		g.drawOval(30, 170, 40, 60);
		g.drawOval(30, 110, 40, 60);
		g.drawOval(30, 50, 	40, 60);
		
		// GORNJI
		g.setColor(Color.YELLOW);
		g.fillOval(30, 	10, 60, 40);
		g.fillOval(90, 	10, 60, 40);
		g.fillOval(150, 10, 60, 40);
		g.fillOval(210, 10, 60, 40);
		g.setColor(Color.BLACK);
		g.drawOval(30, 	10, 60, 40);
		g.drawOval(90, 	10, 60, 40);
		g.drawOval(150, 10, 60, 40);
		g.drawOval(210, 10, 60, 40);
		
		// DESNI
		g.setColor(Color.YELLOW);
		g.fillOval(230, 170, 40, 60);
		g.fillOval(230, 110, 40, 60);
		g.fillOval(230, 50,  40, 60);
		g.setColor(Color.BLACK);
		g.drawOval(230, 170, 40, 60);
		g.drawOval(230, 110, 40, 60);
		g.drawOval(230, 50,  40, 60);
		
		// TELO
		g.setColor(Color.YELLOW);
		g.fillRect(50, 30, 200, 200);
		
		// KOSULJA
		g.setColor(Color.WHITE);
		g.fillRect(50, 230, 200, 20);
		g.setColor(Color.BLACK);
		g.drawRect(50, 230, 200, 20);
		
		// KAIS
		g.setColor(Color.RED);
		g.fillRect(50, 250, 200, 50);
		g.setColor(Color.BLACK);
		g.drawRect(50, 250, 200, 50);
		
		g.setColor(Color.BLACK);
		g.fillRect(60, 	270, 35, 10);
		g.fillRect(110, 270, 35, 10);
		g.fillRect(160, 270, 35, 10);
		g.fillRect(210, 270, 35, 10);
		
		// KRAVATA
		g.setColor(Color.RED);
		g.fillRect(140, 230, 25, 35);
		g.setColor(Color.BLACK);
		g.drawRect(140, 230, 25, 35);
		
		// NOGE
		g.setColor(Color.YELLOW);
		g.fillRect(130, 300, 10, 50);
		g.setColor(Color.BLACK);
		g.drawRect(130, 300, 10, 50);
		
		g.setColor(Color.YELLOW);
		g.fillRect(165, 300, 10, 50);
		g.setColor(Color.BLACK);
		g.drawRect(165, 300, 10, 50);
		
		// LEVO OKO
		g.setColor(Color.WHITE);
		g.fillOval(90, 50, 70, 70);
		
		g.setColor(Color.BLACK);
		g.drawOval(90, 50, 70, 70);
		
		g.setColor(Color.GRAY);
		g.fillOval(110, 70, 30, 30);
		g.setColor(Color.BLACK);
		g.drawOval(110, 70, 30, 30);
		
		g.setColor(Color.BLACK);
		g.fillOval(120, 80, 10, 10);
		
		// DESNO OKO
		g.setColor(Color.WHITE);
		g.fillOval(150, 50, 70, 70);
		
		g.setColor(Color.BLACK);
		g.drawOval(150, 50, 70, 70);
		
		g.setColor(Color.GRAY);
		g.fillOval(170, 70, 30, 30);
		g.setColor(Color.BLACK);
		g.drawOval(170, 70, 30, 30);
		
		g.setColor(Color.BLACK);
		g.fillOval(180, 80, 10, 10);
		
		// USTA
		g.setColor(Color.BLACK);
		g.drawArc(100, 90, 100, 100, 200, 140);
		
		// LEVI ZUB
		g.setColor(Color.WHITE);
		g.fillRect(135, 187, 10, 20);
		g.setColor(Color.BLACK);
		g.drawRect(135, 187, 10, 20);
		
		// DESNI ZUB
		g.setColor(Color.WHITE);
		g.fillRect(160, 187, 10, 20);
		g.setColor(Color.BLACK);
		g.drawRect(160, 187, 10, 20);
		
		// LEVA RUKA
		g.setColor(Color.YELLOW);
		g.fillArc(5, 210, 30, 30, 0, 180);
		g.setColor(Color.BLACK);
		g.drawArc(5, 210, 30, 30, 0, 180);
		
		g.setColor(Color.YELLOW);
		g.fillRect(15, 225, 10, 70);
		g.setColor(Color.BLACK);
		g.drawRect(15, 225, 10, 70);
		
		g.setColor(Color.YELLOW);
		g.fillOval(5, 295, 30, 30);
		g.setColor(Color.BLACK);
		g.drawOval(5, 295, 30, 30);
		
		// DESNA RUKA
		g.setColor(Color.YELLOW);
		g.fillArc(270, 210, 30, 30, 0, 180);
		g.setColor(Color.BLACK);
		g.drawArc(270, 210, 30, 30, 0, 180);
				
		g.setColor(Color.YELLOW);
		g.fillRect(280, 225, 15, 70);
		g.setColor(Color.BLACK);
		g.drawRect(280, 225, 10, 70);
				
		g.setColor(Color.YELLOW);
		g.fillOval(270, 295, 30, 30);
		g.setColor(Color.BLACK);
		g.drawOval(270, 295, 30, 30);
		
		// PEGE
		g.setColor(Color.GRAY);
		g.fillOval(60, 50, 15, 30);
		g.fillOval(50, 80, 10, 15);
		
		g.fillOval(60, 170, 15, 30);
		g.fillOval(50, 200, 10, 15);
		
		g.fillOval(230, 80, 10, 15);
		
		g.fillOval(210, 170, 15, 30);
		g.fillOval(230, 200, 10, 15);
	}
}
