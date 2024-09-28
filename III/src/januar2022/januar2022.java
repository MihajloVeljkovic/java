package januar2022;

import java.applet.Applet;
import java.awt.*;

public class januar2022 extends Applet {
    public void paint(Graphics g) {
        // pozadina(nebo)
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 500, 250);

        // trava
        g.setColor(Color.GREEN);
        g.fillRect(0, 250, 500, 100);

        // kuca
        g.setColor(Color.YELLOW);
        g.fillRect(350, 130, 130, 120);

        // vrata
        g.setColor(Color.RED);
        g.fillRect(375, 170, 40, 80);

        // krov
        int x[] = {350, 480, 415};
        int y[] = {130, 130, 90};
        g.setColor(Color.RED);
        g.fillPolygon(x, y, 3);

        // SUNCE
        g.setColor(Color.ORANGE);
        g.fillOval(400, 25, 40, 40);

        // zraci
        // g.setColor(Color.YELLOW);
        // int x5[] = {450, 445, 480};
        // int y5[] = {45,  50,  45};

        // CVECE
        // drska
        g.setColor(Color.GREEN);
        g.fillRect(20, 230, 3, 20);
        g.fillRect(40, 230, 3, 20);
        g.fillRect(60, 230, 3, 20);

        // latice
        g.setColor(Color.RED);
        // prvi cvet
        g.fillOval(20, 215, 8, 8);
        g.fillOval(15, 220, 8, 8);
        g.fillOval(25, 220, 8, 8);
        g.fillOval(16, 225, 8, 8);
        g.fillOval(22, 225, 8, 8);
        // drugi cvet
        g.fillOval(40, 215, 8, 8);
        g.fillOval(35, 220, 8, 8);
        g.fillOval(45, 220, 8, 8);
        g.fillOval(36, 225, 8, 8);
        g.fillOval(42, 225, 8, 8);
        // treci cvet
        g.fillOval(60, 215, 8, 8);
        g.fillOval(55, 220, 8, 8);
        g.fillOval(65, 220, 8, 8);
        g.fillOval(56, 225, 8, 8);
        g.fillOval(62, 225, 8, 8);

        // cvet
        g.setColor(Color.YELLOW);
        g.fillOval(18, 220, 10, 10);
        g.fillOval(38, 220, 10, 10);
        g.fillOval(58, 220, 10, 10);

        // COVEK
        // glava
        g.setColor(Color.PINK);
        g.fillOval(250, 135, 40, 40);

        // oci
        g.setColor(Color.BLACK);
        g.fillOval(265, 150, 5, 5);
        g.fillOval(275, 150, 5, 5);

        // usta
        g.setColor(Color.RED);
        g.drawArc(260, 155, 20, 15, 180 , 180); // crtanje luka

        // vrh sesira
        g.setColor(Color.GREEN);
		g.fillArc(250, 120, 40, 30, 0, 180);

		// sesir
    	g.setColor(Color.GREEN);
    	g.fillRect(240, 135, 60, 10);

		// masna oko sesira
		g.setColor(Color.WHITE);
		g.fillRect(250, 130, 40, 5);

		// telo
		g.setColor(Color.GRAY);
		g.fillRect(250, 175, 40, 60);

		// kratki rukavi
		int x1[] = {250, 250, 235};
		int y1[] = {175, 190, 190};
		int x2[] = {290, 290, 305};
		int y2[] = {175, 190, 190};
		g.fillPolygon(x1, y1, 3);
		g.fillPolygon(x2, y2, 3);

		// ruke
		g.setColor(Color.PINK);
		g.fillRect(245, 190, 5, 55);
		g.fillRect(290, 190, 5, 55);

		// pantalone
		g.setColor(Color.BLACK);

		// prva nogavica
		int x3[] = {250, 270, 265, 250};
		int y3[] = {235, 235, 290, 290};
		g.fillPolygon(x3, y3, 4);

		// druga nogavica
		int x4[] = {270, 290, 290, 275};
		int y4[] = {235, 235, 290, 290};
		g.fillPolygon(x4, y4, 4);

		// cipele
		g.fillOval(250, 290, 10, 10);
		g.fillOval(280, 290, 10, 10);

		// oblak
		g.setColor(Color.WHITE);
		g.fillOval(20, 30, 80, 40);
		g.fillOval(25, 50, 12, 15);
		g.fillOval(60, 60, 12, 15);
		g.fillOval(40, 60, 25, 15);
    }
}
