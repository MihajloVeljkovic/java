package oktobar2022;

import java.applet.Applet;
import java.awt.*;

public class oktobar2022 extends Applet {
	public void paint(Graphics g) {
        // livada
        g.setColor(Color.GREEN);
        g.fillRect(0, 250, 500, 150);
        g.setColor(Color.GRAY);
        g.drawRect(0, 250, 500, 150);

        // nebo
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 500, 250);
	
		// sunce
		g.setColor(Color.ORANGE);
		g.fillOval(350, 20, 50, 50);
		
		// I oblak
		g.setColor(Color.WHITE);
		g.fillOval(20, 20, 60, 20);
		g.fillOval(30, 15, 10, 10);
		g.fillOval(50, 15, 20, 20);
		g.fillOval(50, 30, 10, 10);
		g.fillOval(70, 30, 10, 10);
	
		// II oblak
		g.setColor(Color.WHITE);
		g.fillOval(390, 40, 50, 20);
		g.fillOval(350, 50, 60, 20);
		g.fillOval(370, 50, 10, 10);
		g.fillOval(390, 60, 10, 10);
		g.fillOval(410, 50, 10, 10);
	
	    // brda
	    // I brdo
	    g.setColor(Color.GREEN);
	    int x1[] = {0, 0, 50, 120};
	    int y1[] = {250, 230, 210, 250};
	    g.fillPolygon(x1, y1, 4);
	    g.setColor(Color.GRAY);
		g.drawPolygon(x1, y1, 4);
	
		// III brdo
		g.setColor(Color.GREEN);
	    int x2[] = {200, 350, 500};
	    int y2[] = {250, 180, 250};
	    g.fillPolygon(x2, y2, 3);
	    g.setColor(Color.GRAY);
		g.drawPolygon(x2, y2, 3);
	
		// II brdo
		g.setColor(Color.GREEN);
	    int x3[] = {180, 260, 350};
	    int y3[] = {250, 200, 250};
	    g.fillPolygon(x3, y3, 3);
	    g.setColor(Color.GRAY);
		g.drawPolygon(x3, y3, 3);
	
		// IV brdo
		g.setColor(Color.GREEN);
		int x4[] = {500, 450, 500};
	    int y4[] = {250, 225, 200};
	    g.fillPolygon(x4, y4, 3);
	    g.setColor(Color.GRAY);
		g.drawPolygon(x4, y4, 3);
		
		// krov
		g.setColor(Color.RED);
		int x5[] = {60, 160, 260};
	    int y5[] = {130, 80, 130};
	    g.fillPolygon(x5, y5, 3);
		g.drawPolygon(x5, y5, 3);
		
		// kuca
		g.setColor(Color.YELLOW);
		g.fillRect(70, 130, 180, 200); 
		g.drawRect(70, 130, 180, 200); 
		
		// mala kuca
		g.setColor(Color.YELLOW);
		g.fillRect(250, 240, 60, 90); 
		g.drawRect(250, 240, 60, 90); 
	
		// krov male kuce
		g.setColor(Color.RED);
		int x6[] = {250, 250, 320};
	    int y6[] = {240, 230, 240};
	    g.fillPolygon(x6, y6, 3);
		g.drawPolygon(x6, y6, 3);
		
		// gornji levi prozor
		g.setColor(Color.WHITE);
		g.fillRect(80, 170, 40, 40); 
		g.setColor(Color.BLACK);
		g.drawRect(80, 170, 40, 40); 
		
		// linije prozora
		g.drawLine(80, 	190, 120, 190);	// horizontalna linija
		g.drawLine(100, 170, 100, 210);	// vertikalna linija
	
		// gornji srednji prozor
		g.setColor(Color.WHITE);
		g.fillRect(140, 170, 40, 40); 
		g.setColor(Color.BLACK);
		g.drawRect(140, 170, 40, 40); 
	
		// linije prozora
		g.drawLine(140, 190, 180, 190);	// horizontalna linija
		g.drawLine(160, 170, 160, 210);	// vertikalna linija
	
		// gornji desni prozor
		g.setColor(Color.WHITE);
		g.fillRect(200, 170, 40, 40); 
		g.setColor(Color.BLACK);
		g.drawRect(200, 170, 40, 40); 
	
		// linije prozora
		g.drawLine(200, 190, 240, 190);	// horizontalna linija
		g.drawLine(220, 170, 220, 210);	// vertikalna linija
	
		// donji levi prozor
		g.setColor(Color.WHITE);
		g.fillRect(80, 250, 40, 40); 
		g.setColor(Color.BLACK);
		g.drawRect(80, 250, 40, 40); 
	
		// linije prozora
		g.drawLine(80, 	270, 120, 270);	// horizontalna linija
		g.drawLine(100, 250, 100, 290);	// vertikalna linija
	
		// donji desni prozor
		g.setColor(Color.WHITE);
		g.fillRect(200, 250, 40, 40);
		g.setColor(Color.BLACK); 
		g.drawRect(200, 250, 40, 40); 
	
		// linije prozora
		g.drawLine(200, 270, 240, 270);	// horizontalna linija
		g.drawLine(220, 250, 220, 290);	// vertikalna linija
	
		// prozor na maloj kucici
		g.setColor(Color.WHITE);
		g.fillRect(260, 250, 40, 40); 
		g.setColor(Color.BLACK);
		g.drawRect(260, 250, 40, 40); 
		
		// linije prozora
		g.drawLine(260, 270, 300, 270);	// horizontalna linija
		g.drawLine(280, 250, 280, 290);	// vertikalna linija
	
		// vrata
		g.setColor(Color.GRAY);
		g.fillRect(140, 250, 40, 80);
		
		// luk iznad vrata
		g.setColor(Color.WHITE);
		g.fillArc(140, 235, 40, 30, 0, 180);
		g.setColor(Color.BLACK);
		g.drawArc(140, 235, 40, 30, 0, 180);
		g.drawLine(150, 240, 160, 250);
		g.drawLine(170, 240, 160, 250);
	
		// jelka
		g.setColor(Color.GRAY);
		int x7[] = {370, 390, 410};
		int y7[] = {280, 220, 280};
		g.fillPolygon(x7, y7, 3);
		g.fillRect(385, 280, 10, 20);
		g.setColor(Color.BLACK);
		g.drawPolygon(x7, y7, 3);
		g.drawRect(385, 280, 10, 20);
    }
}
