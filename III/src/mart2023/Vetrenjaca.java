package mart2023;

import java.applet.Applet;
import java.awt.*;

public class Vetrenjaca extends Applet {
	public void paint(Graphics g) {
		// OKVIR
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, 500, 400);
		
		// NEBO
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 500, 300);
        
        // SUNCE
     	g.setColor(Color.YELLOW);
     	g.fillOval(350, 10, 80, 80);
     	g.setColor(Color.BLACK);
     	g.drawOval(350, 10, 80, 80);
        
        // PUT
        g.setColor(Color.GRAY);
        g.fillRect(0, 300, 500, 100);
        
        // BELA LINIJA
        g.setColor(Color.WHITE);
        g.fillRect(0, 300, 500, 5);
        
	    // I BRDO
	    g.setColor(Color.GRAY);
	    int x1[] = {0, 0, 100, 300};
	    int y1[] = {300, 220, 170, 300};
	    g.fillPolygon(x1, y1, 4);
	    
	    // I VETRENJACA
	    g.setColor(Color.WHITE);
	    g.fillRect(60, 70, 7, 150);
	    
	    // PERAJA
	    g.setColor(Color.GRAY);
	    int x4[] = {0, 	35, 60, 40};
	    int y4[] = {70, 65, 70, 75};
	    g.fillPolygon(x4, y4, 4);
	    
	    int x5[] = {90, 75, 60, 65};
	    int y5[] = {10, 50, 70, 45};
	    g.fillPolygon(x5, y5, 4);
	    
	    int x6[] = {60, 80, 95, 70};
	    int y6[] = {70, 90, 120, 95};
	    g.fillPolygon(x6, y6, 4);
	    
		// II BRDO
		g.setColor(Color.GRAY);
	    int x2[] = {10, 220, 400};
	    int y2[] = {300, 140, 300};
	    g.fillPolygon(x2, y2, 3);
	    
	    // II VETRENJACA
	    g.setColor(Color.WHITE);
	    g.fillRect(170, 90, 5, 110);
	    
	    // PERAJA
	    g.setColor(Color.GRAY);
	    int x7[] = {0, 	35, 60, 40};
	    int y7[] = {70, 65, 70, 75};
	    g.fillPolygon(x7, y7, 4);
	    
	    int x8[] = {90, 75, 60, 65};
	    int y8[] = {10, 50, 70, 45};
	    g.fillPolygon(x8, y8, 4);
	    
	    int x9[] = {60, 80, 95, 70};
	    int y9[] = {70, 90, 120, 95};
	    g.fillPolygon(x9, y9, 4);
	    
		// III BRDO
		g.setColor(Color.GRAY);
	    int x3[] = {250, 450, 500, 500};
	    int y3[] = {300, 200, 220, 300};
	    g.fillPolygon(x3, y3, 4);
	    
	    // III VETRENJACA
	    g.setColor(Color.WHITE);
	    g.fillRect(260, 70, 8, 160);
	    
	    // PERAJA
	    g.setColor(Color.GRAY);
	    int x10[] = {0, 35, 60, 40};
	    int y10[] = {70, 65, 70, 75};
	    g.fillPolygon(x10, y10, 4);
	    
	    int x11[] = {90, 75, 60, 65};
	    int y11[] = {10, 50, 70, 45};
	    g.fillPolygon(x11, y11, 4);
	    
	    int x12[] = {60, 80, 95, 70};
	    int y12[] = {70, 90, 120, 95};
	    g.fillPolygon(x12, y12, 4);
	    
	    // LEVI TOCAK
	    g.setColor(Color.BLACK);
	    g.fillOval(215, 285, 40, 40);
	    g.setColor(Color.GRAY);
	    g.fillOval(220, 290, 30, 30);
	    g.setColor(Color.BLACK);
	    g.fillOval(230, 300, 10, 10);
	    
	    // DESNI TOCAK
	    g.setColor(Color.BLACK);
	    g.fillOval(285, 285, 40, 40);
	    g.setColor(Color.GRAY);
	    g.fillOval(290, 290, 30, 30);
	    g.setColor(Color.BLACK);
	    g.fillOval(300, 300, 10, 10);
	    
	    // KOLA
	    g.setColor(Color.BLACK);
	    g.fillRect(210, 250, 120, 50);
	}
}
