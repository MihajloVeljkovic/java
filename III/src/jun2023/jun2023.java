package jun2023;

import java.applet.Applet;
import java.awt.*;

public class jun2023 extends Applet {
	public void paint(Graphics g) {
		// NEBO
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, 500, 250);
		
		// TRAVA
		g.setColor(Color.GREEN);
		g.fillRect(0, 250, 500, 50);
		
		// SUNCE
		g.setColor(Color.YELLOW);
		g.fillArc(450, -50, 100, 100, 180, 90);
		
		// STAZA
		g.setColor(Color.YELLOW);
		g.fillRect(20, 235, 180, 30);
		
		// KUCA
		g.setColor(Color.ORANGE);
		g.fillRect(40, 135, 140, 100);
		
		// VRATA
		g.setColor(Color.GRAY);
		g.fillRect(70, 165, 40, 70);
		
		// PROZOR
		g.setColor(Color.WHITE);
		g.fillRect(125, 165, 40, 40);
		
		// LINIJA
		g.setColor(Color.BLACK);
		g.drawLine(125, 185, 165, 185);	// horizontalna
		g.drawLine(145, 165, 145, 205);	// vertikalna
		
		// KROV
		g.setColor(Color.RED);
		int x[] = {20, 50, 170, 200};
		int y[] = {135, 55, 55, 135};
		g.fillPolygon(x, y, 4);
		
		// ZNAK
		g.setColor(Color.GRAY);
		g.fillRect(400, 180, 15, 70);
		g.fillRect(390, 140, 35, 40);
		g.fillRect(380, 160, 55, 10);
		g.fillRect(380, 120, 55, 20);
		g.fillRect(400, 110, 20, 10);
		
		// TEKST
		g.setColor(Color.WHITE);
		Font font = new Font("Arial", Font.ITALIC, 20);
        g.setFont(font);
        g.drawString("Introduction of Graphical Programing!!!", 20, 30); 
	}
}
