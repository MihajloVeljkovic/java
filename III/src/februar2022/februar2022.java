package februar2022;

import java.applet.Applet;
import java.awt.*;

public class februar2022 extends Applet {
	public void paint(Graphics g) {
		// NEBO
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, 500, 200);
		
		// TRAVA
		g.setColor(Color.GREEN);
		g.fillRect(0, 200, 500, 200);
		
		// KROV
		g.setColor(Color.RED);
		int x[] = {100, 280, 190};
		int y[] = {100, 100, 50};
		g.fillPolygon(x, y, 3);
		
		// ODZAK
		g.setColor(Color.RED);
		g.fillRect(230, 50, 15, 120);
		
		// KUCA
		g.setColor(Color.ORANGE);
		g.fillRect(100, 100, 180, 150);
		
		// PROZORI
		g.setColor(Color.WHITE);
		g.fillRect(110, 110, 40, 40);
		g.fillRect(170, 110, 40, 40);
		g.fillRect(230, 110, 40, 40);
		g.fillRect(110, 180, 40, 40);
		g.fillRect(230, 180, 40, 40);
		
		// LINIJE
		g.setColor(Color.BLACK);
		g.drawLine(110, 130, 150, 130); // horizontalna linija
		g.drawLine(130, 110, 130, 150); // vertikalna linija
		
		g.drawLine(170, 130, 210, 130); // horizontalna linija
		g.drawLine(190, 110, 190, 150); // vertikalna linija
		
		g.drawLine(230, 130, 270, 130); // horizontalna linija
		g.drawLine(250, 110, 250, 150); // vertikalna linija
		
		g.drawLine(110, 200, 150, 200); // horizontalna linija
		g.drawLine(130, 180, 130, 220); // vertikalna linija
		
		g.drawLine(230, 200, 270, 200); // horizontalna linija
		g.drawLine(250, 180, 250, 220); // vertikalna linija
		
		// VRATA
		g.setColor(Color.RED);
		g.fillRect(180, 190, 30, 60);
		
		// KUGLA
		g.setColor(Color.CYAN);
		g.fillOval(350, 150, 100, 100);
	}
}
