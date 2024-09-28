package septembar2022;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
            // Testiranje funkcija
            Sfera sfera1 = new Sfera(); // Podrazumevani konstruktor
            Sfera sfera2 = new Sfera(1, 2, 3); // Konstruktor sa tri argumenta
            Sfera sfera3 = new Sfera(0, 0, 0, 2); // Konstruktor sa sva četiri argumenta

            // Ispis broja kreiranih sfera
            System.out.println("Broj kreiranih sfera: " + Sfera.brojKreiranihSfera());

            // Ispis informacija o sferama
            System.out.println(sfera1);
            System.out.println(sfera2);
            System.out.println(sfera3);

            // Promena poluprečnika sfera
            sfera1.postaviPoluprecnik(3);

            // Ispis informacija o sferi nakon promene poluprečnika
            System.out.println(sfera1);

            // Učitavanje sfera iz fajla
            Sfera sfera4 = Sfera.ucitajIzFajla("sfere.txt");
            System.out.println(sfera4);

            // Ispisivanje površina u fajl
            Sfera.ispisiPovrsineUFajl("sfere.dat", sfera1, sfera2, sfera3, sfera4);

        } catch (IOException | IllegalArgumentException e) {
            System.out.println("Doslo je do greske: " + e.getMessage());
        }

	}

}
