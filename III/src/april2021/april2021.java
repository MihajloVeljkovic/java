package april2021;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class april2021 extends Applet {
	public void paint(Graphics g) {
		// g.drawRect(0, 0, 40, 40); // crta kvadrat //ako je levi cosak
		//g.setColor(Color.red); ako zelimo da nam oboji samo liniju oko oblika
		g.drawLine(0, 0, 380, 360); // crta liniju
		g.setColor(Color.red);
		g.fillRect(340, 0, 50, 50);
		g.setColor(Color.blue);
		g.fillOval(0, 313, 50, 50);

	}
}
