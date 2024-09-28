package sep2022;

import java.applet.Applet;
import java.awt.*;

public class sep2022 extends Applet {
	
	public void paint(Graphics g) {
		// NEBO
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, 500, 150);
		
		// SUNCE
		g.setColor(Color.YELLOW);
		g.fillOval(20, 20, 30, 30);
		
		// PRVI OBLAK
		g.setColor(Color.WHITE);
		g.fillOval(60, 20, 70, 20);
		g.fillOval(70, 15, 40, 10);
		g.fillOval(70, 35, 40, 10);
		
		// DRUGI OBLAK
		g.setColor(Color.WHITE);
		g.fillOval(150, 30, 80, 20);
		g.fillOval(170, 25, 50, 10);
		g.fillOval(170, 40, 40, 10);
		
		// LIVADA
		g.setColor(Color.GREEN);
		g.fillRect(0, 150, 500, 180);
		
		// JEZERO
		g.setColor(Color.CYAN);
		g.fillOval(10, 160, 140, 80);
		
		// DRVO
		g.setColor(Color.GRAY);
		// STABLO
		g.fillRect(180, 180, 5, 30);
		// KROSNJA
		g.fillOval(155, 165, 50, 25);
		g.fillOval(160, 150, 40, 20);
		g.fillOval(170, 135, 20, 20);
		
		// TROTOAR
		g.setColor(Color.WHITE);
		g.fillRect(0, 330, 500, 10);
		
		// PUT
		g.setColor(Color.GRAY);
		g.fillRect(0, 340, 500, 60);
		
		// OBJEKAT
		g.setColor(Color.ORANGE);
		g.fillRect(250, 200, 170, 20);
		
		g.setColor(Color.WHITE);
		int x3[] = {250, 270, 270};
		int y3[] = {200, 170, 200};
		g.fillPolygon(x3, y3, 3);
		
		g.setColor(Color.BLACK);
		g.fillRect(270, 150, 50, 50);
		g.setColor(Color.ORANGE);
		g.fillRect(320, 150, 50, 50);
		g.setColor(Color.BLACK);
		g.fillRect(340, 170, 10, 10);
		
		g.setColor(Color.WHITE);
		int x1[] =  {370, 370, 420, 410};
		int y1[] =  {170, 200, 200, 170};
		g.fillPolygon(x1, y1, 4);
		
		g.setColor(Color.BLACK);
		int x2[] =  {270, 290, 360, 370};
		int y2[] =  {150, 110, 110, 150};
		g.fillPolygon(x2, y2, 4);
		
		// AUTOMOBIL
		g.setColor(Color.RED);
		g.fillRect(30, 350, 85, 30);
		int x4[] = {30, 40, 85, 90};
		int y4[] = {350, 320, 320, 350};
		g.fillPolygon(x4, y4, 4);
		
		// PRVI PROZOR
		g.setColor(Color.BLACK);
		int x5[] = {33, 43, 63, 63};
		int y5[] = {348, 322, 322, 348};
		g.fillPolygon(x5, y5, 4);
		
		// DRUGI PROZOR
		g.setColor(Color.BLACK);
		int x6[] = {67, 67, 83, 87};
		int y6[] = {348, 322, 322, 348};
		g.fillPolygon(x6, y6, 4);
		
		// TOCKOVI
		g.setColor(Color.BLACK);
		g.fillOval(40, 370, 20, 20);
		g.fillOval(80, 370, 20, 20);
		
		// AUTOBUS
		g.setColor(Color.BLUE);
		g.fillRect(145, 330, 150, 50);
		
		// TOCKOVI
		g.setColor(Color.BLACK);
		g.fillOval(165, 365, 25, 25);
		g.fillOval(235, 365, 25, 25);
		
		g.setColor(Color.BLUE);
		int x7[] = {145, 145, 285, 295};
		int y7[] = {330, 290, 290, 330};
		g.fillPolygon(x7, y7, 4);
		
		g.setColor(Color.WHITE);
		g.fillRect(150, 295, 20, 35);
		g.fillRect(175, 295, 35, 35);
		g.fillRect(215, 295, 35, 35);
		int x8[] = {255, 255, 285, 295};
		int y8[] = {330, 295, 295, 330};
		g.fillPolygon(x8, y8, 4);
		
		// SEMAFOR
		g.setColor(Color.GRAY);
		g.fillRect(470, 210, 5, 120);
		g.setColor(Color.PINK);
		g.fillRect(460, 135, 25, 75);
		g.setColor(Color.RED);
		g.fillOval(462, 140, 20, 20);
		g.setColor(Color.YELLOW);
		g.fillOval(462, 160, 20, 20);
		g.setColor(Color.GREEN);
		g.fillOval(462, 180, 20, 20);
	}
	
}
