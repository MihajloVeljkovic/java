package mart2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Listic {
	protected int premija;
	
	// konstruktor
	public Listic(int premija) {
		this.premija = premija;
	}

	// get metoda za vracanje vrednosti
    public int getPremija() {
        return premija;
    }

    public abstract int odrediDobitak();
    public abstract String proveriDobitak();
    
	public static List izvlacenje(int brojLoptica, int gornjaGranica) {
        List izvuceniBrojevi = new ArrayList();
        Random random = new Random();

        while (izvuceniBrojevi.size() < brojLoptica) {
            int izvuceniBroj = random.nextInt(gornjaGranica) + 1;
            if (!izvuceniBrojevi.contains(izvuceniBroj)) {
                izvuceniBrojevi.add(izvuceniBroj);
            }
        }

        return izvuceniBrojevi;
    }
}
