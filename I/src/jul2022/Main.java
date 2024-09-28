package jul2022;

public class Main {

	public static void main(String[] args) {
		// kreiranje novog objekta
		Mapa mapa = new Mapa(4);
		
		// tacke
        Tacka nis = new Tacka(261, 350, "Nis");
        Tacka beograd = new Tacka(144, 175, "Beograd");
        Tacka noviSad = new Tacka(90, 120, "Novi Sad");
        Tacka subotica = new Tacka(77, 20, "Subotica");
        
        // pozivanje metode za postavljanje tacke
        mapa.postaviTacku(0, nis);
        mapa.postaviTacku(1, beograd);
        mapa.postaviTacku(2, noviSad);
        mapa.postaviTacku(3, subotica);
        
        // rastojanje izmedju Nisa i Subotice
        double rastojanjeNisSubotica = mapa.izracunajUkupnoRastojanje();
        System.out.println("Ukupno rastojanje između Niša i Subotice: " + rastojanjeNisSubotica);
	}
}
