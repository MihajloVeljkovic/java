package DriveSafety;

import java.applet.Applet;
import java.awt.*;

public class DriveSafety extends Applet {
	
	public void paint(Graphics g) {
		// POZADINA
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, 500, 400);
		
		// OBLAK
		g.setColor(Color.WHITE);
		g.fillOval(5, 20, 50, 30);
		g.fillOval(45, 5, 50, 30);
        g.fillOval(85, 15, 50, 30);
        g.fillOval(45, 30, 50, 30);
		
		// SUNCE
        g.setColor(Color.YELLOW);
        g.fillOval(400, 10, 50, 50);
		
		// AUTOMOBIL
        g.setColor(Color.BLACK);
        g.fillRect(250, 100, 65, 20);	
        g.fillRect(230, 120, 120, 30);
		
		// TOCKOVI
        g.setColor(Color.BLACK);
        g.fillOval(250, 140, 20, 20);
        g.fillOval(305, 140, 20, 20);
        
        // TRAKE
        g.setColor(Color.BLACK);
        g.fillRect(10, 	200, 80, 10);
        g.fillRect(130, 200, 80, 10);
        g.fillRect(250, 200, 80, 10);
        g.fillRect(370, 200, 80, 10);
        
        // AUTOMOBIL
        g.setColor(Color.BLACK);
        int x[] = {115, 147, 179};
        int y[] = {277, 237, 277};
        g.fillPolygon(x, y, 3);
        g.fillRect(115, 280, 65, 20);	
        g.fillRect(95, 300, 120, 30);
     		
     	// TOCKOVI
        g.setColor(Color.BLACK);
     	g.fillOval(110, 320, 20, 20);
     	g.fillOval(165, 320, 20, 20);
        
        // TEKST
     	g.setColor(Color.BLACK);
        Font font = new Font("Arial", Font.BOLD, 16);
        g.setFont(font);
        g.drawString("Drive safety!!!", 330, 370); 
	}
}
