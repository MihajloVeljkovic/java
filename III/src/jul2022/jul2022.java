package jul2022;

import java.applet.Applet;
import java.awt.*;

public class jul2022 extends Applet {
	
	public void paint(Graphics g) {
		// NEBO
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, 500, 130);
		
		g.setColor(Color.GRAY);
		g.fillRect(0, 130, 500, 20);
		
		// TRAKA
		g.setColor(Color.WHITE);
		g.fillRect(0, 130, 40, 20);
		g.fillRect(60, 130, 350, 20);
		g.fillRect(430, 130, 350, 20);
		
		// KUCA
		g.setColor(Color.ORANGE);
		g.fillRect(120, 60, 100, 120);
		
		// PROZORI(GORNJI)
		g.setColor(Color.GRAY);
		g.fillRect(130, 80, 20, 20);
		g.fillRect(160, 80, 20, 20);
		g.fillRect(190, 80, 20, 20);
		
		// PROZOR(DONJI)
		g.fillRect(190, 110, 20, 20);
		
		// VRATA
		g.fillRect(160, 110, 20, 50);
		
		// KROV
		g.setColor(Color.WHITE);
		int x6[] = {120, 150, 200, 220};
		int y6[] = {60, 30, 30, 60};
		g.fillPolygon(x6, y6, 4);
		
		// SUNCE
		g.setColor(Color.YELLOW);
		g.fillArc(350, -20, 40, 40, 180, 180);
		
		g.setColor(Color.BLACK);
		g.drawRect(130, 80, 20, 20);
		g.drawRect(160, 80, 20, 20);
		g.drawRect(190, 80, 20, 20);
		g.drawRect(190, 110, 20, 20);
		g.drawRect(160, 110, 20, 50);
		
		// TRAVA
		g.setColor(Color.GREEN);
		g.fillRect(0, 150, 500, 210);
		
		// STAZA
		g.setColor(Color.WHITE);
		int x1[] = {40, 100, 200, 160};
		int y1[] = {360, 300, 300, 360};
		g.fillPolygon(x1, y1, 4);
		
		int x2[] = {100, 70, 120, 200};
		int y2[] = {300, 250, 250, 300};
		g.fillPolygon(x2, y2, 4);
		
		int x3[] = {70, 110, 130, 120};
		int y3[] = {250, 210, 210, 250};
		g.fillPolygon(x3, y3, 4);
		
		int x4[] = {110, 90, 110, 130};
		int y4[] = {210, 190, 190, 210};
		g.fillPolygon(x4, y4, 4);
		
		int x5[] = {90, 120, 110};
		int y5[] = {190, 150, 190};
		g.fillPolygon(x5, y5, 3);
		
		g.setColor(Color.BLACK);
		g.drawPolygon(x1, y1, 4);
		g.drawPolygon(x2, y2, 4);
		g.drawPolygon(x3, y3, 4);
		g.drawPolygon(x4, y4, 4);
		g.drawPolygon(x5, y5, 3);
	}
	
}
