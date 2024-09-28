package oktobar2022;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class TestKlasa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ArrayList<Osoba> osobe = new ArrayList<>();

        System.out.print("Unesite broj objekata: ");
        int brojObjekata = scanner.nextInt();

        for (int i = 0; i < brojObjekata; i++) {
            System.out.print("Unesite tip objekta (dak/student/zaposleni): ");
            String tipObjekta = scanner.next();

            System.out.print("Unesite ime: ");
            String ime = scanner.next();

            System.out.print("Unesite datum rođenja: ");
            String datumRodjenja = scanner.next();

            System.out.print("Unesite adresu: ");
            String adresa = scanner.next();

            if (tipObjekta.equals("dak")) {
                System.out.print("Unesite naziv škole: ");
                String nazivSkole = scanner.next();

                System.out.print("Unesite razred: ");
                int razred = scanner.nextInt();

                System.out.print("Unesite prosečnu ocenu: ");
                double prosecnaOcena = scanner.nextDouble();

                osobe.add(new Djak(ime, datumRodjenja, adresa, nazivSkole, razred, prosecnaOcena));
            } else if (tipObjekta.equals("student")) {
                System.out.print("Unesite ime fakulteta: ");
                String imeFakulteta = scanner.next();

                System.out.print("Unesite smer: ");
                String smer = scanner.next();

                System.out.print("Unesite godinu upisa: ");
                int godinaUpisa = scanner.nextInt();

                System.out.print("Unesite trenutnu godinu studija: ");
                int trenutnaGodina = scanner.nextInt();

                osobe.add(new Student(ime, datumRodjenja, adresa, imeFakulteta, smer, godinaUpisa, trenutnaGodina));
            } else if (tipObjekta.equals("zaposleni")) {
                System.out.print("Unesite ime firme: ");
                String imeFirme = scanner.next();

                System.out.print("Unesite ime odeljenja: ");
                String odeljenje = scanner.next();

                System.out.print("Unesite mesečnu platu: ");
                double mesecnaPlata = scanner.nextDouble();

                osobe.add(new Zaposleni(ime, datumRodjenja, adresa, imeFirme, odeljenje, mesecnaPlata));
            } else {
                System.out.println("Nepoznat tip objekta. Pokušajte ponovo.");
                i--;  // Ponoviti unos za ovaj korak
            }
        }

        // Ispis informacija o svakom objektu
        for (Osoba osoba : osobe) {
            System.out.println(osoba.toString());
            osoba.markica();
            System.out.println("Prosek: " + osoba.prosek());
            System.out.println();
        }

	}

}
