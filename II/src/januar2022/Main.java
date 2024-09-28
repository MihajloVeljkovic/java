package januar2022;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
            // Učitavanje podataka iz fajlova
            double poluprecnikValjka = ucitajPodatakIzFajla("valjak.txt");
            double visinaValjka = ucitajPodatakIzFajla("valjak.txt");

            double poluprecnikKupe = ucitajPodatakIzFajla("kupa.txt");
            double visinaKupe = ucitajPodatakIzFajla("kupa.txt");

            // Kreiranje objekata tipa geometrijskoTelo (Valjak, Kupa)
            Valjak v = new Valjak(5.0, 12.0);
            Kupa k = new Kupa(5.0, 8.0);

            // Prikaz rezultata
            System.out.println("Povrsina valjka:  " + v.izracunajPovrsinu());
            System.out.println("Zapremina valjka: " + v.izracunajZapreminu());

            System.out.println("Povrsina kupe: 	" + k.izracunajPovrsinu());
            System.out.println("Zapremina kupe: " + k.izracunajZapreminu());

        } catch (IOException | NumberFormatException e) {
            System.out.println("Doslo je do greske: " + e.getMessage());
        }
	}
	
	// Metoda za učitavanje podataka iz fajla
    private static double ucitajPodatakIzFajla(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        reader.close();

        return Double.parseDouble(line);
    }

}

