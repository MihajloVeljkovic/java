package mart2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Loto extends Listic {
	private int lotoListic;
    private static int dobitnaKombinacija;	// konstantna vrednost, ne menja se
    
    // konstruktor
    public Loto(int premija, int lotoListic) {
        super(premija);
        this.lotoListic = lotoListic;
    }
    
    // get metoda
    public int getLotoListic() {
		return lotoListic;
	}

    // set metoda
	public void setLotoListic(int lotoListic) {
		this.lotoListic = lotoListic;
	}

	// get metoda
	public static int getDobitnaKombinacija() {
		return dobitnaKombinacija;
	}
	
	// set metoda
	public static void setDobitnaKombinacija(int dobitnaKombinacija) {
		Loto.dobitnaKombinacija = dobitnaKombinacija;
	}

	// javna metoda za odredjivanje broja pogodaka
    public int odrediBrojPogodaka() {
        int brojPogodaka = 0;
        for (int broj : lotoListic) {
            if (dobitnaKombinacija.contains(broj)) {
                brojPogodaka++;
            }
        }
        return brojPogodaka;
    }
    
    // nasledjena apstraktna metoda
    @Override
    public int odrediDobitak() {
        int brojPogodaka = odrediBrojPogodaka();
        
        if (brojPogodaka < 3) {
            return 0;	//ako je broj pogodaka manji od 3, nema dobitka
        } 
        
        else if (dobitnaKombinacija) {
            return premija;	//ukoliko je pogodjena dobitna kombinacija, nagrada je premija
        }
        
        else {
            return premija/10;	//za svaki pogodak manje, premija je manja 10 puta 
        }
    }
    
    // nasledjena apstraktna metoda
    @Override
    public String proveriDobitak() {
        int dobitak = odrediDobitak(); //izracunavamo velicinu nagrade
        
        if (dobitak == 0) {
            return "Nema dobitka!";
        } else {
            return "Broj pogodaka: " + odrediBrojPogodaka() + ", Velicina nagrade: " + dobitak;
        }
    }
}
